package com.codeinsight.projects.college.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component
@Entity
@Table(name="student_tab2")
public class Student implements Serializable {

	@Id
	@Column(name="s_id")
	private int studentId;
	@Column(name="s_name", length=20)
	private String studentName;
	@Column(name="s_age")
	private int studentAge;
	@Column(name="sub1_mark")
	private int subject1tMark;
	@Column(name="sub2_mark")
	private int subject2tMark;
	@Column(name="sub3_mark")
	private int subject3tMark;
	@Column(name="sub4_mark")
	private int subject4tMark;
	@Column(name="tot_mark")
	private int totalMark;
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Address address;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="c_id_fk")
	private Course course;
		
	 public Student() {
		 super();
	 }

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public int getSubject1tMark() {
		return subject1tMark;
	}

	public void setSubject1tMark(int subject1tMark) {
		this.subject1tMark = subject1tMark;
	}

	public int getSubject2tMark() {
		return subject2tMark;
	}

	public void setSubject2tMark(int subject2tMark) {
		this.subject2tMark = subject2tMark;
	}

	public int getSubject3tMark() {
		return subject3tMark;
	}

	public void setSubject3tMark(int subject3tMark) {
		this.subject3tMark = subject3tMark;
	}

	public int getSubject4tMark() {
		return subject4tMark;
	}

	public void setSubject4tMark(int subject4tMark) {
		this.subject4tMark = subject4tMark;
	}

	public int getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(int totalMark) {
		this.totalMark = totalMark;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + studentAge;
		result = prime * result + studentId;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		result = prime * result + subject1tMark;
		result = prime * result + subject2tMark;
		result = prime * result + subject3tMark;
		result = prime * result + subject4tMark;
		result = prime * result + totalMark;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (studentAge != other.studentAge)
			return false;
		if (studentId != other.studentId)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		if (subject1tMark != other.subject1tMark)
			return false;
		if (subject2tMark != other.subject2tMark)
			return false;
		if (subject3tMark != other.subject3tMark)
			return false;
		if (subject4tMark != other.subject4tMark)
			return false;
		if (totalMark != other.totalMark)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", subject1tMark=" + subject1tMark + ", subject2tMark=" + subject2tMark + ", subject3tMark="
				+ subject3tMark + ", subject4tMark=" + subject4tMark + ", totalMark=" + totalMark + ", address="
				+ address + ", course=" + course + "]";
	}

}
