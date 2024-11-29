package com.infycodes.springboot_firstapp.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infycodes.springboot_firstapp.model.Student;
import com.infycodes.springboot_firstapp.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	private final StudentService studentService;
	
	StudentController(StudentService s)
	{
		studentService=s;
	}

	@GetMapping(value = "/get-students")
	public ResponseEntity<List<Student>> getStudents() {
		List<Student> studentList=studentService.getAllStudents();
		return new ResponseEntity<>(studentList,HttpStatus.OK);
		
	}
	
	@PostMapping("/add-student")
	public  ResponseEntity<Student> addStudent(@RequestBody Student student)
	{
		Student s=studentService.addStudent(student);
		return new ResponseEntity<>(s,HttpStatus.CREATED);
	}

	
	@DeleteMapping("/delete-student/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable int id)
	{
		Student s=studentService.deleteStudentDeatails(id);
		return new ResponseEntity<>(s,HttpStatus.valueOf(200));
	}
	
	@PutMapping("/update-student")
	public ResponseEntity<Student> updateStudent(@RequestBody Student s)
	{
		Student student=studentService.updateStudentDetails(s);
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
	
	@GetMapping("/get-student")
	public  ResponseEntity<Student>  getStudent(@RequestParam int id)
	{
		Student stu=studentService.getStudent(id);
		return new ResponseEntity<>(stu,HttpStatus.OK);
	}
}
