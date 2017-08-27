package com.codeinsight.projects.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codeinsight.projects.college.model.Student;
import com.codeinsight.projects.college.service.IStudentService;


@Controller
public class StudentController {

	private String responseMessage;
	
	@Autowired
	private IStudentService studentService;
	
	@RequestMapping("/StudentRegistration")
	public String showStudentRegistrationPage(ModelMap map){
		map.addAttribute("responseMessage", responseMessage);
		return "StudentRegistration";
	}
	
	@RequestMapping(value="/doSaveStudent", method=RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student")Student student){
		int studentId=studentService.saveStudent(student);
		responseMessage="Student registerd sucessfully eith ID : "+studentId;
		return "redirect:StudentRegistration";
	}
	
	@RequestMapping("/UpdateStudentData")
	public String showStudentEditPage(){
		return "UpdateStudentData";
	}
	
	@RequestMapping(value="/doUpdateStudent", method=RequestMethod.POST)
	public String updateStudent(@RequestParam("studentId")int studentId){
		Student student=studentService.getStudentById(studentId);
		studentService.updateStudent(student);
		responseMessage="Student updated with ID : "+studentId;
		return "redirect:AllStudentsData";
	}
	
	@RequestMapping("/doDelete")
	public String deleteStudent(@RequestParam("studentId")int studentId){
		studentService.deleteStudent(studentId);
		responseMessage="Student deleted with ID : "+studentId;
		return "redirect:AllStudentsData";
	}
	
	@RequestMapping("/ShowAllStudentData")
	public String getAllStudents(ModelMap map){
		List<Student> allStudentsList=studentService.getAllStudents();
		map.addAttribute("allStudentsList", allStudentsList);
		map.addAttribute("responseMessage", responseMessage);
		return "AllStudentsData";
	}
	
	/*@RequestMapping("/getPassedOutStudents")
	public String getPassedOutStudents(
			@RequestParam("courseName") String courseName, ModelMap map) {
		List<Student> passedOutStudentsList = service
				.getPassedOutStudents(courseName);
		map.addAttribute("passedOutStudents", passedOutStudentsList);
		return "getPassedOutStudents";
	}

	@RequestMapping("/studentsListByCourse")
	public String getStudentsByCourse(
			@RequestParam("courseName") String courseName, ModelMap map) {
		List<Student> studentsListByCourse = service
				.getStudentsByCourse(courseName);
		map.addAttribute("studentsListByCourse", studentsListByCourse);
		return "studentsListByCourse";
	}

	@RequestMapping("/topStudentByCourse")
	public String topStudentByCourse(
			@RequestParam("courseName") String courseName, ModelMap map) {
		Student topStudentByCourse = service.topStudentByCourse(courseName);
		map.addAttribute("topStudentByCourse", topStudentByCourse);
		return "topStudentByCourse";
	}

	@RequestMapping("/getFailedStudents")
	public String getFailedStudents(
			@RequestParam("courseName") String courseName, ModelMap map) {
		List<Student> failedStudentsListByCourse = service
				.getFailedStudents(courseName);
		map.addAttribute("failedStudentsListByCourse",
				failedStudentsListByCourse);
		return "getFailedStudents";
	}

	@RequestMapping("/getStudentsByCity")
	public String getStudentsByCity(@RequestParam("city") String city,
			ModelMap map) {
		List<Student> studentsListByCity = service.getStudentsByCity(city);
		map.addAttribute("studentsListByCity", studentsListByCity);
		return "getStudentsByCity";
	}

	@RequestMapping("/getStudentsByState")
	public String getStudentsByState(@RequestParam("state") String state,
			ModelMap map) {
		List<Student> studentsListByState = service.getStudentsByState(state);
		map.addAttribute("studentsListByState", studentsListByState);
		return "getStudentsByState";
	}

	@RequestMapping("/getStudentsByMinAge")
	public String getStudentsByMinAge(@RequestParam("age") int age, ModelMap map) {
		List<Student> studentsListByAge = service.getStudentsByMinAge(age);
		map.addAttribute("studentsListByAge", studentsListByAge);
		return "getStudentsByMinAge";
	}*/

}
