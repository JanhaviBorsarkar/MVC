package com.org.dao;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.org.dao.HomeDao;
import com.org.model.Student;

@Repository
public class HomeDaoImpl implements HomeDao
{
	@Autowired
	SessionFactory sf;
	
	public int saveData(Student s) {
	
		Session session= sf.openSession();
		int id=(Integer)session.save(s);
		session.beginTransaction().commit();
		return id;
		/*Session session= sf.openSession();
		int id=s.getId();
		Query q=session.createQuery("select id from Student");
		List<Integer> ids=q.getResultList();
		for(Integer sid:ids) {
			if(id == sid) {
				System.out.println("duplicate id");
				break;
			}
		}
		session.save(s);
		System.out.println(id);
		session.beginTransaction().commit();
		
		return id; */
	}

	@Override
	public List<Student> loginCheck(String uname, String pass) {
		Session session=sf.openSession();
		if(uname.equals("admin")&&pass.equals("admin")) {
			Query q=session.createQuery("from Student");
			List<Student> slist=q.getResultList();
			return slist;
		}
		else {
			Query q=session.createQuery("from Student where uname=:uname and pass=:pass");
			q.setParameter("uname", uname);
			q.setParameter("pass", pass);
			
			List<Student> slist=q.getResultList();
			return slist;
			
		}
	}

	@Override
	public Student editRecord(int id) {
		Session session=sf.openSession();
		Student stu=session.get(Student.class, id);
		return stu;
	}

	@Override
	public List<Student> updateRecord(Student s) {
		Session session=sf.openSession();
		session.update(s);
		session.beginTransaction().commit();
		Query q=session.createQuery("from Student");
		List<Student> slist=q.getResultList();
		return slist;
	}

	public List<Student> deleteRecord(int id) {
		Session session=sf.openSession();
		Student stu=session.get(Student.class, id);
		session.delete(stu);
		session.beginTransaction().commit();
		Query q=session.createQuery(" from Student");
		List<Student> slist= q.getResultList();
		return slist;
	}

	
}
