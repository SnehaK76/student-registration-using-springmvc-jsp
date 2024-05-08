package com.prowings.dao;

import java.util.List;

import com.prowings.entity.Student;

public interface StudentDao {
	
	public void saveStudent(Student student);
	
	public List<Student> getStudentList();
}
