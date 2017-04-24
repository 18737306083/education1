package com.future.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��3��1�� ����10:36:15 
 * ��˵�� 
 */
@Entity
@Table(name="teacher_inf")
public class Teacher  implements Serializable{
	@Id
	@GeneratedValue
private Integer teacher_id;	
	
	//��ʦ���
private String number_teacher;
//��¼����
private String pasword_teacher;
//��ϵ�绰

private String newberphone;
//��ʦ����
private String teachername;
//ְ��
private String title;
 //Ժϵ
private String department;

//��ʦ���Ա�
private String sex;
@OneToMany(targetEntity=Course.class,mappedBy="teacher")
private Set<Course> course=new HashSet<>();
//��ѧ�ƻ�
@OneToOne(targetEntity=Plan.class)
private Plan plan;



public Plan getPlan() {
	return plan;
}

public void setPlan(Plan plan) {
	this.plan = plan;
}

public Set<Course> getCourse() {
	return course;
}

public void setCourse(Set<Course> course) {
	this.course = course;
}

 
 
public Integer getTeacher_id() {
	return teacher_id;
}

public void setTeacher_id(Integer teacher_id) {
	this.teacher_id = teacher_id;
}

public String getNumber_teacher() {
	return number_teacher;
}

public void setNumber_teacher(String number_teacher) {
	this.number_teacher = number_teacher;
}

public String getNewberphone() {
	return newberphone;
}

public void setNewberphone(String newberphone) {
	this.newberphone = newberphone;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDepartment() {
	return department;
}

public String getTeachername() {
	return teachername;
}

public void setTeachername(String teachername) {
	this.teachername = teachername;
}

public void setDepartment(String department) {
	this.department = department;
}

public void Sex(String department) {
	this.department = department;
}

public String getPasword_teacher() {
	return pasword_teacher;
}

public void setPasword_teacher(String pasword_teacher) {
	this.pasword_teacher = pasword_teacher;
}

public String getSex() {
	return sex;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result
			+ ((number_teacher == null) ? 0 : number_teacher.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Teacher other = (Teacher) obj;
	if (number_teacher == null) {
		if (other.number_teacher != null)
			return false;
	} else if (!number_teacher.equals(other.number_teacher))
		return false;
	return true;
}

public void setSex(String sex) {
	this.sex = sex;
}



}
