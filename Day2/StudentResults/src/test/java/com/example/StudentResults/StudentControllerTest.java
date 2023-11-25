package com.example.StudentResults;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.StudentResults.controller.StudentController;
import com.example.StudentResults.model.Student;
import com.example.StudentResults.service.StudentService;



class StudentControllerTest {

	@Mock
	private StudentService studentService;

	@InjectMocks
	private StudentController studentController;

	private MockMvc mockMvc;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(studentController).build();
	}

	@Test
	void getAllStudents() throws Exception {

		List<Student> students = Arrays.asList(new Student(1, "John", null, 0), new Student(2, "Jane", null, 0));
		when(studentService.getAllStudents()).thenReturn(students);

		mockMvc.perform(MockMvcRequestBuilders.get("/student/allStudents")).andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON)).andExpect(jsonPath("$[0].id").value(1))
				.andExpect(jsonPath("$[0].name").value("John")).andExpect(jsonPath("$[1].id").value(2))
				.andExpect(jsonPath("$[1].name").value("Jane"));

		verify(studentService, times(1)).getAllStudents();
		verifyNoMoreInteractions(studentService);
	}
}
