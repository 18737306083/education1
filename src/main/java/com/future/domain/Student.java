package com.future.domain;

import java.math.BigInteger;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��3��1�� ����10:36:05 
 * ��˵�� 
 */
@Entity
@Table(name="student_info")
public class Student {

	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY) 
	  private Integer student_id;
	  //ѧ��
	private String number; 
   
 
	private String name;
    
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
	
	@Lob
	@Basic(fetch=FetchType.LAZY)
	private byte[] pic;
 //�γ�
	@ManyToMany(targetEntity=Course.class)
	@JoinTable(name="student_course",joinColumns=@JoinColumn(name="student_id",referencedColumnName="student_id"),
	inverseJoinColumns=@JoinColumn(name="course_id",referencedColumnName="course_id"))
  private Set<Course> course=new HashSet<>(); 
	 //�༶
	 @ManyToOne(targetEntity=Classes.class)
	 @JoinColumn(name="class_id",referencedColumnName="class_id")
	 private Classes classes;
	
	
	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}
 
	 public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
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

 
 
 

	 
 

 
 

	 

	public Integer getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getExNumber() {
		return exNumber;
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

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	 @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((number == null) ? 0 : number.hashCode());
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
			Student other = (Student) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (number == null) {
				if (other.number != null)
					return false;
			} else if (!number.equals(other.number))
				return false;
			return true;
		}

	
	
	
}
