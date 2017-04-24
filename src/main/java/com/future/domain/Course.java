package com.future.domain;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Check;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��3��3�� ����8:11:20 
 * ��˵��
 * 
 * �γ̱�
 */
@Entity
@Table(name="course_inf")
public class Course {

//�γ̺�
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer course_id;
	
	
	public Integer getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}
	private Integer courseNo;
//�γ���
	@Column(nullable=false,unique=true)
	private String courseName;
//	ѧ��
	@ManyToMany(targetEntity=Student.class)
	@JoinTable(name="student_course",joinColumns=@JoinColumn(name="course_id",referencedColumnName="course_id"),
	inverseJoinColumns=@JoinColumn(name="student_id",referencedColumnName="student_id"))
  private Set<Student> student=new HashSet<>();
	//�ɼ������
	@OneToOne(targetEntity=Scores.class)
	@JoinColumn(name="scores_id",referencedColumnName="numberScores",unique=true)
	private Scores scores;
	//��ʦ����
	 @ManyToOne(targetEntity=Teacher.class)
	 @JoinColumn(name="teacher",referencedColumnName="number_teacher",nullable=false)
	 private Teacher teacher;
	 //�༶
	 
	 @ManyToMany(targetEntity=Classes.class)
	 @JoinTable(name="classes_course",joinColumns=@JoinColumn(name="courseNo",referencedColumnName="courseNo"),
	 inverseJoinColumns=@JoinColumn(name="class_num",referencedColumnName="class_num"))
	 private Set<Classes> classes=new HashSet<>();

	//�α�
	@OneToOne(targetEntity=Books.class,mappedBy="course")
private Books books;
	
	
	//�Ͽ�ʱ�䡢
	private String time;
	//�Ͽν�
	private String jie;
	//�Ͽεص�
	private String position;
	
	
	
	
	 public Books getBooks() {
		return books;
	}
	public void setBooks(Books books) {
		this.books = books;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getJie() {
		return jie;
	}
	public void setJie(String jie) {
		this.jie = jie;
	}
 
	 
	
	 
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Scores getScores() {
		return scores;
	}
	public void setScores(Scores scores) {
		this.scores = scores;
	}
	public Set<Student> getStudent() {
		return student;
	}
	public void setStudent(Set<Student> student) {
		this.student = student;
	}
	public Integer getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(Integer courseNo) {
		this.courseNo = courseNo;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public Set<Classes> getClasses() {
		return classes;
	}
	public void setClasses(Set<Classes> classes) {
		this.classes = classes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result
				+ ((courseNo == null) ? 0 : courseNo.hashCode());
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
		Course other = (Course) obj;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (courseNo == null) {
			if (other.courseNo != null)
				return false;
		} else if (!courseNo.equals(other.courseNo))
			return false;
		return true;
	}
	
	
	
}
