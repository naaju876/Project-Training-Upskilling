package com.example.StudentResults;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import org.mockito.InjectMocks;

import org.mockito.Mock;

import org.mockito.MockitoAnnotations;

import org.springframework.boot.test.context.SpringBootTest;

import com.example.StudentResults.model.Student;
import com.example.StudentResults.repository.StudentRepository;
import com.example.StudentResults.service.StudentServiceImpl;

import java.util.Arrays;

import java.util.Collections;

import java.util.List;

import java.util.Optional;
 
import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;
 
class StudentServiceImplTest {
 
    @Mock

    private StudentRepository studentRepository;
 
    @InjectMocks

    private StudentServiceImpl studentService;
 
    @BeforeEach

    void setUp() {

        MockitoAnnotations.openMocks(this);

    }
 
    @Test

    void testGetAllStudents() {

        // Arrange

        List<Student> students = Arrays.asList(

                new Student(1, "John", null, 0),

                new Student(2, "Jane", null, 0)

        );

        when(studentRepository.findAll()).thenReturn(students);
 
        // Act

        List<Student> result = studentService.getAllStudents();
 
        // Assert

        assertEquals(2, result.size());

        assertEquals("John", result.get(0).getName());

        assertEquals("Jane", result.get(1).getName());
 
        // Verify interactions

        verify(studentRepository, times(1)).findAll();

        verifyNoMoreInteractions(studentRepository);

    }
 
    @Test

    void testGetAllStudentsEmptyList() {

        // Arrange

        when(studentRepository.findAll()).thenReturn(Collections.emptyList());
 
        // Act

        List<Student> result = studentService.getAllStudents();
 
        // Assert

        assertTrue(result.isEmpty());
 
        // Verify interactions

        verify(studentRepository, times(1)).findAll();

        verifyNoMoreInteractions(studentRepository);

    }
 
    @Test

    void testAddNewStudent() {

        // Arrange

        Student studentToAdd = new Student(3, "Bob", null, 0);

        when(studentRepository.insert(any(Student.class))).thenReturn(studentToAdd);
 
        // Act

        Student result = studentService.addNewStudent(studentToAdd);
 
        // Assert

        assertEquals(3, result.getId());

        assertEquals("Bob", result.getName());
 
        // Verify interactions

        verify(studentRepository, times(1)).insert(any(Student.class));

        verifyNoMoreInteractions(studentRepository);

    }
 
 
    @Test

    void testGetStudentById() {

        // Arrange

        Student existingStudent = new Student(4, "Alice", null, 0);

        when(studentRepository.findById(4)).thenReturn(Optional.of(existingStudent));
 
        // Act

        Student result = studentService.getStudentById(4);
 
        // Assert

        assertEquals(4, result.getId());

        assertEquals("Alice", result.getName());
 
        // Verify interactions

        verify(studentRepository, times(1)).findById(4);

        verifyNoMoreInteractions(studentRepository);

    }
 
    @Test
    void testUpdateStudent() {

        // Arrange

        Student updatedStudent = new Student(5, "UpdatedName", null, 0);

        when(studentRepository.findById(5)).thenReturn(Optional.of(updatedStudent));
 
        // Act

        Student result = studentService.updateStudent(5, updatedStudent);
 
        // Assert

        assertNotNull(result, "Result should not be null");

        assertEquals(5, result.getId(), "Student ID should match");

        assertEquals("UpdatedName", result.getName(), "Student name should match");
 
        // Verify interactions

        verify(studentRepository, times(1)).findById(5);

        verify(studentRepository, times(1)).save(updatedStudent);

        // Check that no other interactions with studentRepository occurred

        verifyNoMoreInteractions(studentRepository);

    }
 
 
    @Test

    void testDeleteStudentById() {

        // Arrange

        int studentIdToDelete = 6;
 
        // Act

        studentService.deleteStudentById(studentIdToDelete);
 
        // Verify interactions

        // Check if the deleteById method is called on the studentRepository with the correct argument

        verify(studentRepository, times(1)).deleteById(eq(studentIdToDelete));
 
        // Verify that there are no more interactions with the studentRepository

        verifyNoMoreInteractions(studentRepository);

    }
 
    

    @SpringBootTest

    class AngularSpringConnectionApplicationTests {
 
        @Test

        void contextLoads() {

            // This test just ensures that the Spring context loads without any errors.

        }

    }


}
