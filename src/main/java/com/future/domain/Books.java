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
 * @version ����ʱ�䣺2017��3��3�� ����8:46:21 
 * ��˵��
 * �̲���Ϣ
 *  
 */
@Entity
@Table(name="book_inf")
public class Books {
//�߼�����
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer number;
	//ͼ���߼����
private String book_no;
	
//�̲���
private String name;
//������
private String publish;
//�۸�
private float price;
//��������
private Date date;
@OneToOne(targetEntity=Course.class)
@JoinColumn(name="courseNo",referencedColumnName="courseNo",unique=true)
private Course course;


public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
public Integer getNumber() {
	return number;
}
public void setNumber(Integer number) {
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPublish() {
	return publish;
}
public void setPublish(String publish) {
	this.publish = publish;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getBook_no() {
	return book_no;
}
public void setBook_no(String book_no) {
	this.book_no = book_no;
}
	
	
	
	
}
