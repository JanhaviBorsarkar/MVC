package com.org.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.org.dao.HomeDao;
import com.org.model.Student;
import com.org.service.HomeService;

@Service
public class HomeServicImpl implements HomeService 
{
	@Autowired
	HomeDao hd;
	
	@Override
	public int saveData(Student s) {
	
		return hd.saveData(s);
	}

	@Override
	public List<Student> loginCheck(String uname, String pass) {
		
		return hd.loginCheck(uname,pass);
	}

	@Override
	public Student editRecord(int id) {
		// TODO Auto-generated method stub
		return hd.editRecord(id);
	}

	@Override
	public List<Student> updateRecord(Student s) {
		// TODO Auto-generated method stub
		return hd.updateRecord(s);
	}

	@Override
	public List<Student> deleteRecord(int id) {
		
		return hd.deleteRecord(id);
	}
}
