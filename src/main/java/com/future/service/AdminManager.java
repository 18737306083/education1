package com.future.service;

import java.util.List;

import com.future.domain.Admin;
import com.future.domain.Classes;
import com.future.domain.Student;
import com.future.domain.Teacher;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��3��7�� ����10:09:44 
 * ��˵�� 
 */
public interface AdminManager {
	//����Ա��¼
		Admin loginAdmin(Admin admin);
//�鿴ѧ����Ϣ
		List<Student> findStudent(int init,int pageSize);
	//���ѧ����Ϣ
  void addStudent(Student student);
  //�鿴��ʦ��Ϣ
  List<Teacher> findTeacher(int first,int max,Teacher teacher);
  //��ӽ�ʦ
  void addTeacher(Teacher teacher);
  void modifyStudent(Student student);
	//�鿴ָ��ѧ��
  Student findStu(String n);
  void changepassword(String i);
  //�������ҽ�ʦ
  //��ѯ��¼����
  int findbyTotal(Teacher teacher);
  void addClasses(Classes classes);
  Student fndStudentbyclass(Student student);
  //�༶���ѧ��
  void classaddStudent(Classes classes, Student stdent);
  //���ݰ༶��ѯѧ��
  List<Student> findstudentByClasses(Classes classes);
 void deleteTeacher(Teacher teacher) ;
}
