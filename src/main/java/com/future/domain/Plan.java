package com.future.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��3��3�� ����8:56:55 
 * ��˵��
 * 
 *  ��ѧ�ƻ�
 */
@Entity
@Table(name="plan_inf")
public class Plan {
//�߼�����
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
//�ƻ����
private String plan_no;
//�ƻ�����
@Lob
private char[] content;
//��ѧ�ƻ�
@OneToOne(targetEntity=Teacher.class)
@JoinColumn(name="number_teacher",referencedColumnName="number_teacher",unique=true)
private Teacher teacher;




public Teacher getTeacher() {
	return teacher;
}
public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public char[] getContent() {
	return content;
}
public void setContent(char[] content) {
	this.content = content;
}
public String getPlan_no() {
	return plan_no;
}
public void setPlan_no(String plan_no) {
	this.plan_no = plan_no;
}
	
	
	
	
	
	
}
