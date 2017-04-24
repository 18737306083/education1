package com.future.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.future.dao.StudentDao;
import com.future.domain.Course;
import com.future.domain.Student;
import com.future.domain.TvEvaluation;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��3��5�� ����10:37:32 
 * ��˵�� 
 */
@Repository
public class StudentDaoImpl extends HibernateUtils implements StudentDao {

	@Override
	public Student login(Student student) {
		// TODO Auto-generated method stub
		String hql="From Student s where s.number = :number and s.password = :password";
		
		return (Student) geSession().createQuery(hql).setString("number", student.getNumber()).setString("password", student.getPassword()).uniqueResult();
	}

	@Override
	public List<Student> findStudentByAll(Student student) {
		// TODO Auto-generated method stub
		String hql="From ";
		
		return null;
	}
	 //��ѯ���˳ɼ�
	@Override
	public List findScores(Student student) {
		// TODO Auto-generated method stub
		String hql="from Student s join fetch s.course c join fetch c.scores where s.number=:number";
	 
		return geSession().createQuery(hql).setString("number", student.getNumber()).list();
	}
//ѡ��
	@Override
	public void selectCourse(Student student, Course course) {
		// TODO Auto-generated method stub
	/*	student.getCourse().add(course);*/
		geSession().saveOrUpdate(course);
		
		
	}
//����
	@Override
	public void evaLuation(Course course, TvEvaluation tv) {
		// TODO Auto-generated method stub
		tv.setCourse(course);
		geSession().saveOrUpdate(course);
		
	}

	 
	 

}
