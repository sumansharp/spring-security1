package com.springsecurity.springsecurity.Service;

import java.util.List;

import com.springsecurity.springsecurity.model.Course;
import com.springsecurity.springsecurity.model.Student;

public interface StudentService {
	public Student retrieveStudent(String studentId);
	public List<Course> retrieveCourses(String studentId);
}
