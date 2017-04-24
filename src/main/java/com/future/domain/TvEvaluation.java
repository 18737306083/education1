package com.future.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��3��2�� ����8:56:46 
 * ��˵��
 * 
 *  ������
 *  
 */

@Entity
@Table(name="eva_inf")
public class TvEvaluation {
//�γ̺�
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer courseNo;
//����
private String eva;
//��������
private Date date;
//�γ�
@OneToOne(targetEntity=Course.class)
@JoinColumn(name="courseNo",referencedColumnName="courseNo",unique=true)

private Course course;



public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
public Integer getCourseNo() {
	return courseNo;
}
public void setCourseNo(Integer courseNo) {
	this.courseNo = courseNo;
}
public String getEva() {
	return eva;
}
public void setEva(String eva) {
	this.eva = eva;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
	
	
	
}
