package com.future.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.future.dao.AdminByarrayDao;
import com.future.domain.Classes;
import com.future.domain.Course;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��4��20�� ����8:25:50 
 * ��˵�� 
 */
@Service
@Transactional
public class AdminByarrangServiceImpl implements AdminByarrayDao {
@Resource
AdminByarrayDao adminByarrayDao;
	
	
	
	@Override
	public List<Course> findByCourse(Classes classes) {
		// TODO Auto-generated method stub
		return null;
	}

}
