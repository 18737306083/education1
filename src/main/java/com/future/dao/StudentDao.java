package com.future.dao;

 
import java.util.List;
import java.util.Map;

import com.future.domain.Course;
import com.future.domain.Student;
import com.future.domain.TvEvaluation;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��3��4�� ����3:43:42 
 * ��˵�� 
 */
public interface StudentDao {
//ѧ����¼
	Student login(Student student); 
//ѧ����ѯ������Ϣ
  List<Student> findStudentByAll(Student student);
 //��ѯ���˳ɼ�
   List findScores(Student student);      
//ѧ��ѡ��
  void selectCourse(Student student,Course course);
  //ѧ������
  void evaLuation(Course course,TvEvaluation tv);
  
  
  
}
