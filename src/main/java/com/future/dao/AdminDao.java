package com.future.dao;

import java.util.List;

import com.future.domain.Admin;
import com.future.domain.Classes;
import com.future.domain.Student;
import com.future.domain.Teacher;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��3��6�� ����9:12:53 
 * ��˵�� 
 */
public interface AdminDao {
	//����Ա��¼
	Admin getloginAdmin(Admin admin);
//���ѧ��
	void addStudent(Student student);
//ɾ��ѧ��
	void deleteStudent(Student student);

//��ӽ�ʦ
	void addTacher(Teacher teacher);
	//ɾ����ʦ
	void deleteTeacher(Teacher teacher);
//�޸Ľ�ʦ����
	void updateTeacher(Teacher teacher);
	//�޸�ѧ������
	void updateStudent(Student student);
//��ҳ�鿴ѧ������	
	List<Student> findStudentByPages(int firstResults,int maxResults );
//��ҳ�鿴��ʦ����
	List<Teacher> findTeacher(int firstResults,int maxResults,Teacher teacher);
	Student findStudent(String n);
	void insert(Admin ad);
	//
//�޸�����
void changepassword(String i);
	//��Ӱ༶
 void addClasses(Classes classes);
	//�ڰ༶�в���ѧ��
	Student findStudentbyClass(Student student);
	//��ѧ����ӵ�ָ���༶
	void classaddStudent(Classes classes,Student stdent);
	//��ѯ
//���ݰ༶��ѯѧ��
	List<Student> findstudentByClasses(Classes classes);
	
	
	
	
	
}
