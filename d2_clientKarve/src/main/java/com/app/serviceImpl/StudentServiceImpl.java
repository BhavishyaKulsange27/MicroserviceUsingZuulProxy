package com.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.StudentKn;
import com.app.repository.StudentRepo;
import com.app.servicei.StudentServiceI;
@Service
public class StudentServiceImpl implements StudentServiceI {
	@Autowired
	StudentRepo sr;

	@Override
	public StudentKn saveStudentData(StudentKn st) {
		return sr.save(st);
	}

	@Override
	public List<StudentKn> getAllStudent() {
		return sr.findAll();
	}

	@Override
	public void updateData(StudentKn st) {
		sr.save(st);
		
	}

	@Override
	public void deleteData(int id) {
		sr.deleteById(id);
		
	}

}
