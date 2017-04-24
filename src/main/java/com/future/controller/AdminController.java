package com.future.controller;

import java.io.File;
 

import java.io.IOException;
import java.sql.Date;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.future.base.BaseActions;
import com.future.domain.Student;
import com.opensymphony.xwork2.ActionContext;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��3��15�� ����11:54:04 
 * ��˵�� 
 */
@Controller
@Scope("prototype")
public class AdminController extends BaseActions<Object> implements SessionAware,ServletResponseAware,ServletRequestAware {
	private String name;
	private String number;
	

	private String password;
	 
	private Date birth;
	//��ѧ�ɼ�
	private String examitation;
	//��ѧʱ��
	private Date enterSchool;
	//ѧԺ
	private String collegeNo;
	//�༶
	
	private String classNo;
	//רҵ
	private String major;
	//������
	private String exNumber;
	//���֤
	private String iD;
	//��ϵ�绰
	private String numberPhone;
	//��Ƭ
/*	private byte[] pic;*/
	//ͼƬ
/* private File  file;
 private String fileContentType;
 private String fileFileName;*/
	
/*	
	public String getFileContentType() {
	return fileContentType;
}

public void setFileContentType(String fileContentType) {
	this.fileContentType = fileContentType;
}

public String getFileFileName() {
	return fileFileName;
}

public void setFileFileName(String fileFileName) {
	this.fileFileName = fileFileName;
}
*/
	//��ѯ������Ϣ
	public String inqueryPerson() {
		Student student=new Student();
		/* String basePath = ServletActionContext.getServletContext().getRealPath("img");
		 FileOutputStream fos=new FileOutputStream(getSavePath()+"\\"+getUploadFileName()basePath+"\\"+getFileFileName());
		FileInputStream input=new FileInputStream(getFile());
		byte[] buffer=new byte[30000];
		int len=0;
		while ((len=input.read(buffer))>0) {
			 student.setPic(buffer);
			
		}*/
 	System.out.println("inquerfffff");
		student.setNumber(number);
		 student.setBirth(birth);
		 student.setClassNo(classNo);
		 student.setCollegeNo(collegeNo);
		 student.setEnterSchool(enterSchool);
		 student.setExamitation(examitation);
		 student.setExNumber(exNumber);
		 student.setiD(iD);
		 student.setMajor(major);
		 student.setName(name);
		 student.setNumber(number);
		 student.setNumberPhone(numberPhone);
		 student.setPassword(password);
		System.out.println(student.getName()+student.getiD());
		 adminManager.addStudent(student);
		 
		 ActionContext.getContext().getValueStack().push("comple");
		  return SUCCESS; 
	 }
		
	//���ѧ��
	 public String addStudent(){
		 
		 
		 return "";
	 }
		
		
	 
	 
	 
	 
 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getExamitation() {
		return examitation;
	}

/*	public File getFile() {
		return file;
	}
	   */
	 
	/*public void setFile(File file) {
		this.file = file;
	}*/

	public void setExamitation(String examitation) {
		this.examitation = examitation;
	}

	public Date getEnterSchool() {
		return enterSchool;
	}

	public void setEnterSchool(Date enterSchool) {
		this.enterSchool = enterSchool;
	}

	public String getCollegeNo() {
		return collegeNo;
	}

	public void setCollegeNo(String collegeNo) {
		this.collegeNo = collegeNo;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	 

 

	/*public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}*/


	
	
	
	
	
	 

	public String getExNumber() {
		return exNumber;
	}
 

 

 

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setExNumber(String exNumber) {
		this.exNumber = exNumber;
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

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

}
