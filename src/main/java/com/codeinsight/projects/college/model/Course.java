package com.codeinsight.projects.college.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component
@Entity
@Table(name = "course_tab")
public class Course implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "c_id")
	private int courseId;
	@Column(name = "c_name", length = 20)
	private String courseName;
	@Column(name = "c_days")
	private int durationInDays;
	@Column(name = "c_fee")
	private double courseFee;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Course_Sub", joinColumns = { @JoinColumn(name = "c_id") }, inverseJoinColumns = { @JoinColumn(name = "sub_id") })
	private Set<Subject> subjectList;

	public Course() {
		super();
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDurationInDays() {
		return durationInDays;
	}

	public void setDurationInDays(int durationInDays) {
		this.durationInDays = durationInDays;
	}

	public double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}

	public Set<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(Set<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(courseFee);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + courseId;
		result = prime * result
				+ ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + durationInDays;
		result = prime * result
				+ ((subjectList == null) ? 0 : subjectList.hashCode());
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
		Course other = (Course) obj;
		if (Double.doubleToLongBits(courseFee) != Double
				.doubleToLongBits(other.courseFee))
			return false;
		if (courseId != other.courseId)
			return false;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (durationInDays != other.durationInDays)
			return false;
		if (subjectList == null) {
			if (other.subjectList != null)
				return false;
		} else if (!subjectList.equals(other.subjectList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName
				+ ", durationInDays=" + durationInDays + ", courseFee="
				+ courseFee + ", subjectList=" + subjectList + "]";
	}

}
