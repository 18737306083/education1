package com.future.service;

import java.util.List;

import com.future.domain.Classes;
import com.future.domain.Course;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��4��20�� ����8:22:48 
 * ��˵�� 
 */
public interface AdminByarrayService {
List<Course> findByCourse(Classes classes);
}
