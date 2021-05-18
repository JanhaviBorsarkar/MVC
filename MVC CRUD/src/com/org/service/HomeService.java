package com.org.service;

import java.util.List;
import com.org.model.Student;

public interface HomeService 
{
	public int saveData(Student s);
	public List<Student> loginCheck(String uname,String pass);
	public Student editRecord(int id);
	public List<Student> updateRecord(Student s);
	public List<Student> deleteRecord(int id);
}
