package com.app.servicei;

import java.util.List;

import com.app.model.StudentKn;

public interface StudentServiceI {

	StudentKn saveStudentData(StudentKn st);

	List<StudentKn> getAllStudent();

	void updateData(StudentKn st);

	void deleteData(int id);

}
