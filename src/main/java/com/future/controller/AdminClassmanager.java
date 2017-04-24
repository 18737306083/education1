package com.future.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.future.base.BaseActions;
import com.future.domain.Classes;
import com.future.domain.Student;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��3��26�� ����3:04:21 
 * ��˵��    ����Ա �༶����
 */

@Controller
@Scope("prototype")
public class AdminClassmanager  extends BaseActions<Object> implements SessionAware,ServletResponseAware,ServletRequestAware{
private String class_propertity;
private String class_name;
private String class_num;
//���ѧ��
private String number;
private String name;
List<Student> stu;
//��Ӱ༶
	public String addClasses(){
		Classes classes=new Classes();
		classes.setClass_name(getClass_name());
		classes.setClass_num(class_num);
		classes.setClass_propertity(class_propertity);
		adminManager.addClasses(classes);
		return "add";
	}
	
	//�༶���ѧ��
public String classbyStudent(){
	//�Ȳ�ѯѧ��������ӵ��༶
	Student student=new Student(); 
	student.setName(name);
	student.setNumber(number);
student=adminManager.fndStudentbyclass(student);
	Classes classes=new Classes();
	classes.setClass_name(class_name);
	adminManager.classaddStudent(classes, student);
	return "classbystudent";
}
	
	//��ѯ�༶
public String findbyclasses(){
	Classes classes=new Classes();
	classes.setClass_name(class_name);
List<Student>	student=adminManager.findstudentByClasses(classes);
	
	
	return "findbyclass";
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1559248381656007823L;

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}

	public String getClass_propertity() {
		return class_propertity;
	}

	public void setClass_propertity(String class_propertity) {
		this.class_propertity = class_propertity;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public String getClass_num() {
		return class_num;
	}

	public void setClass_num(String class_num) {
		this.class_num = class_num;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStu() {
		return stu;
	}

	public void setStu(List<Student> stu) {
		this.stu = stu;
	}

}
