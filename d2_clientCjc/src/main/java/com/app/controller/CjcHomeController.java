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
import org.springframework.web.client.RestTemplate;

import com.app.model.StudentCjc;

@RestController
public class CjcHomeController {
	@Autowired
	RestTemplate rt;
	
	@PostMapping("studcjc")
	public StudentCjc saveStudentData(@RequestBody StudentCjc st) {
//		String url="http://localhost:9001/studkn";
		String url="http://zuul/kn/studkn";
		StudentCjc object = rt.postForObject(url, st,StudentCjc.class);
		
		return object;
	}
	
	@GetMapping("studcjc")
	public List<StudentCjc> getAllData(){
		String url="http://zuul/kn/studkn";
		List list = rt.getForObject(url,List.class);
		return list;
		
	}
	
	@PutMapping("studcjc")
	public String updateStudent(@RequestBody StudentCjc st) {
		String url="http://zuul/kn/studkn";
		rt.put(url, st);
		return "student updated successfully"+st;
		
	}
	
	@DeleteMapping("studcjc/{id}")
	public String deleteStudent(@PathVariable int id) {
		String url="http://zuul/kn/studkn/"+id;
		rt.delete(url);
		return "Delete Student form id:"+id;
	}
	
	

}
