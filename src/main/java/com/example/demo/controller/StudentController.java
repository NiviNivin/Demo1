package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService ss;
	
	@RequestMapping("home")
	public String getHome() {
		return "home.jsp";
	}
	
	@ResponseBody
	@RequestMapping("addStudent")
	public String addStudent(Student s) {
		
		//Student s = new Student(rollno,name,dept,grade);
		
		return ss.addStudent(s);
	}
	
	@ResponseBody
	@RequestMapping("viewStudent")
	public String  viewStudent(int rollno) {
		return ss.getStudent(rollno);
	}
	
	@ResponseBody
	@RequestMapping("viewAllStudent")
	public List<Student>  viewAllStudent() {
		return ss.getAllStudents();
	}
	
	@ResponseBody
	@RequestMapping("updateStudent")
	public String  updateStudent(Student s) {
		return ss.updateStudent(s);
	}
	
	@ResponseBody
	@RequestMapping("deleteStudent")
	public String  deleteStudent(int rollno) {
		return ss.deleteStudent(rollno);
	}
}
