package com.badri.spring.rest.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.badri.spring.rest.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	List<Student> student;

	// define the post construct to load the data only once .........
	// data ekpatak matra load garne ta ho

	@PostConstruct
	public void loadData() {
		student = new ArrayList<>();

		student.add(new Student("Badri ", "Paudel"));
		student.add(new Student("Juna ", "Gautam"));
		student.add(new Student("Hari ", "Ojha"));
	}

	@GetMapping("/students")
	public List<Student> getStudents() {

		return student;

	}

	// for retrieving the student by id //{studentId} is the path variable
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {

		// check if the studentId is not existing even if it is requested [error
		// handling ]
		if (studentId > student.size() || studentId < 0) {
			System.out.println("student id not found ");
			throw new StudentNotFoundException("Student Id not found " + studentId);
		}

		return student.get(studentId);

	}

	//for the particular controller this works but for larger app this code has been 
	//moved to the StudentRestExceptionHandler using annotation. 
	/*
	 
	// handle the thrown exception using annotation
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException e) {

		StudentErrorResponse error = new StudentErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	//handle generic exception like /api/students/fjfjfjfjfjfj(some random text), because 
	//above case only handles int value
	
	// handle the thrown exception using annotation
		@ExceptionHandler
		public ResponseEntity<StudentErrorResponse> handleGenericException(Exception e) {

			StudentErrorResponse error = new StudentErrorResponse();
			
			error.setStatus(HttpStatus.BAD_REQUEST.value());
			error.setMessage(e.getMessage());
			error.setTimeStamp(System.currentTimeMillis());

			
			return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
		}	
*/
	
}
