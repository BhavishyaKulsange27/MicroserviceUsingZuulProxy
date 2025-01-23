package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.StudentKn;
import com.app.servicei.StudentServiceI;

@RestController
public class KarveHomeController {
	@Autowired
	StudentServiceI ssi;
	
	@PostMapping("studkn")
	public StudentKn saveStudentData(@RequestBody StudentKn st) {
		StudentKn stud=ssi.saveStudentData(st);
		
		return stud;
	}
	
	@GetMapping("studkn")
	public List<StudentKn> getAllData(){
		List<StudentKn> ls=ssi.getAllStudent();
		return ls;
	}
	
	@PutMapping("studkn")
	public String updateData(@RequestBody StudentKn st) {
		ssi.updateData(st);
		return "Ok";
	}
	
	@DeleteMapping("studkn/{id}")
	public String deleteData(@PathVariable int id) {
		ssi.deleteData(id);
		return "OK";
	}
	
	
	
	
	
	
	
	
	

}
