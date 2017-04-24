package com.future.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��3��23�� ����10:19:52 
 * ��˵��
 * �༶ 
 */
@Entity
@Table(name="class_inf")
public class Classes {
@Id
@GeneratedValue
private Integer class_id;
//�༶���
private String class_num;


//�༶����
private String class_name;
//�༶����
private String class_propertity;
 //ѧ��
@OneToMany(targetEntity=Student.class,mappedBy="classes")
private Set<Student> student=new HashSet<>(); 
//�༶��ӿγ� ��Զ�
@ManyToMany(targetEntity=Course.class)
@JoinTable(name="classes_course",joinColumns=@JoinColumn(name="class_num",referencedColumnName="class_num"),
inverseJoinColumns=@JoinColumn(name="courseNo",referencedColumnName="courseNo"))
private Set<Course> course=new HashSet<>();



public String getClass_num() {
	return class_num;
}
public void setClass_num(String class_num) {
	this.class_num = class_num;
}
public Set<Course> getCourse() {
	return course;
}
public void setCourse(Set<Course> course) {
	this.course = course;
}
public Integer getClass_id() {
	return class_id;
}
public void setClass_id(Integer class_id) {
	this.class_id = class_id;
}
public String getClass_name() {
	return class_name;
}
public void setClass_name(String class_name) {
	this.class_name = class_name;
}
public String getClass_propertity() {
	return class_propertity;
}
public void setClass_propertity(String class_propertity) {
	this.class_propertity = class_propertity;
}
 public Set<Student> getStudent() {
	return student;
}
public void setStudent(Set<Student> student) {
	this.student = student;
}
 


	
	
}
