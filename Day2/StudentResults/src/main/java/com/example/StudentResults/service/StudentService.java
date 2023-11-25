package com.example.StudentResults.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.StudentResults.model.Student;



@Service
public interface StudentService {


	List<Student> getAllStudents();

	Student addNewStudent(Student student);

	Student getStudentById(int id);

	Student updateStudent(int id, Student student);

	void deleteStudentById(int id);

}
