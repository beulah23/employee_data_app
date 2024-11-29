package com.infycodes.springboot_firstapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.infycodes.springboot_firstapp.model.Student;

import jakarta.annotation.PostConstruct;


@Service
public class StudentService {
	
	List<Student> studentList=new ArrayList<>();

	
	@PostConstruct
	public void getStudentDetails()
	{
		Student s1=new Student("Beulah",1);
		Student s2=new Student("Blessy",2);
		Student s3=new Student("Kani Priya",3);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
	}
	
	public List<Student> getAllStudents()
	{
		return studentList;
		
	}
	
	public Student addStudent(Student student)
	{
		studentList.add(student);
		return student;
	}
	
	public Student deleteStudentDeatails(int id)
	{
		Student s=getStudent(id);
		studentList.remove(s);
		return s;
	}
	
	public Student getStudent(int id)
	{
		for(Student s: studentList)
		{
			if(s.getId().equals(id))
			{
				return s;
			}
		}
		return null;
	}
	
	public Student updateStudentDetails(Student s)
	{
		
		Integer id=s.getId();
		
		for(Student s1:studentList)
		{
			if(s1.getId()==id)
			{
				s1.setName(s.getName());
			}
		}
		return s;
	}
	
}
