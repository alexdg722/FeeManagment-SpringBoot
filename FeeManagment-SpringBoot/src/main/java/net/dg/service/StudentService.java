package net.dg.service;

import java.util.List;

import net.dg.model.Student;

public interface StudentService {
	List<Student> getAllStudents();
	List<Student> getDueFeeStudents();
	void saveStudent(Student student);
	Student getStudentByRollNo(int id);
	void deleteStudentByRollNo(int id);
	
} 
