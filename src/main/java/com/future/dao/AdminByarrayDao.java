package com.future.dao;

import java.util.List;

import com.future.domain.Classes;
import com.future.domain.Course;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��4��20�� ����8:17:15 
 * ��˵�� 
 */
public interface AdminByarrayDao {
//��ѯ�༶���޿γ�
List<Course> findByCourse(Classes classes);

}
