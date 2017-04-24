package com.future.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
 

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.future.dao.AdminDao;
import com.future.dao.DbUtils;
import com.future.domain.Admin;
import com.future.domain.Classes;
import com.future.domain.Student;
import com.future.domain.Teacher;
import com.future.service.AdminManager;
 

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��3��7�� ����10:26:42 
 * ��˵�� 
 */
@Service
@Transactional 
public class AdminServiceImpl implements AdminManager {
	@Resource
private AdminDao adminDaoImpl;
	@Resource
	private DbUtils dbUtils;
	
	
	public DbUtils getDbUtils() {
		return dbUtils;
	}



	public void setDbUtils(DbUtils dbUtils) {
		this.dbUtils = dbUtils;
	}



	public AdminDao getAdminDaoImpl() {
	return adminDaoImpl;
}



public void setAdminDaoImpl(AdminDao adminDaoImpl) {
	this.adminDaoImpl = adminDaoImpl;
}

//����Ա��¼

	@Override
	public  Admin  loginAdmin(Admin admin) {
		// TODO Auto-generated method stub
		if(admin==null) return null;
		else return getAdminDaoImpl().getloginAdmin(admin);
		 
	}

//����ѧ��

	@Override
	public List<Student> findStudent(int init,int pageSize) {
		// TODO Auto-generated method stub
		
		
		
		
		return getAdminDaoImpl().findStudentByPages(0, 5);
	}


//���ѧ��
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		getAdminDaoImpl().addStudent(student);
	}


//���ҽ�ʦ
	@Override
	public List<Teacher> findTeacher(int first,int max,Teacher teacher) {
		// TODO Auto-generated method stub
		
		return getAdminDaoImpl().findTeacher(first, max,teacher);
	}

//��ӽ�ʦ

	@Override
	public void addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		getAdminDaoImpl().addTacher(teacher);
	}



	@Override
	public void modifyStudent(Student student) {
		// TODO Auto-generated method stub
		getAdminDaoImpl().updateStudent(student);
		
		
		
		
	}
//ɾ����ʦ
	public void deleteTeacher(Teacher teacher) {
		getAdminDaoImpl().deleteTeacher(teacher);
		
	}

	@Override
	public Student findStu(String n) {
		// TODO Auto-generated method stub
		
		System.out.println("findService");
		
		return getAdminDaoImpl().findStudent(n);
	}



	@Override
	public void changepassword(String i) {
		// TODO Auto-generated method stub
	getAdminDaoImpl().changepassword(i);	
	}



	@Override
	public int findbyTotal(Teacher teacher) {
		// TODO Auto-generated method stub
	
		
		return 	dbUtils.findTotalBylimit(teacher);
	}



	@Override
	public void addClasses(Classes classes) {
		// 
		
		getAdminDaoImpl().addClasses(classes);
		
		
		
	}



	@Override
	public Student fndStudentbyclass(Student student) {
		// TODO Auto-generated method stub
		
		return getAdminDaoImpl().findStudentbyClass(student); 
	}



	@Override
	public void classaddStudent(Classes classes, Student stdent) {
		// TODO Auto-generated method stub
		getAdminDaoImpl().classaddStudent(classes, stdent);
		
		
		
	}



	@Override
	public List<Student> findstudentByClasses(Classes classes) {
		// TODO Auto-generated method stub
		
		return getAdminDaoImpl().findstudentByClasses(classes);
	}

	 

 

}
