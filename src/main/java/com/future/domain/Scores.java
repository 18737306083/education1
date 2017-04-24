package com.future.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��3��3�� ����8:22:24 
 * ��˵��
 * �ɼ���
 *  
 */
@Entity
@Table(name="scores_inf")
public class Scores {
//�߼�����
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer  numberScores;
//ԭʼ�ɼ�
	private float oldScores;
//���ճɼ�
private float finalScores;
 
@OneToOne(targetEntity=Course.class,mappedBy="scores")
private Course course;


public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
public Integer getNumberScores() {
	return numberScores;
}
public void setNumberScores(Integer numberScores) {
	this.numberScores = numberScores;
}
public float getOldScores() {
	return oldScores;
}
public void setOldScores(float oldScores) {
	this.oldScores = oldScores;
}
public float getFinalScores() {
	return finalScores;
}
public void setFinalScores(float finalScores) {
	this.finalScores = finalScores;
}
	
	
	
}
