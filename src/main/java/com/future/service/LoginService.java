package com.future.service;

import com.future.domain.Admin;
import com.future.domain.Student;
import com.future.domain.Teacher;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��3��13�� ����10:51:58 
 * ��˵�� 
 */
public interface LoginService {

 Student loginByStudent(Student student);
Teacher loginByTeacher(Teacher teacher);
Admin getloginByAdmin(Admin admin);
void insert(Admin admin);
	
}
