package com.future.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * @author ���� ¬��  E-mail: 1914045211@qq.com
 * @version ����ʱ�䣺2017��3��3�� ����9:10:27 
 * ��˵��
 * 
 *  ����Ա��
 *  
 */
@Entity
@Table(name="admin_inf")
public class Admin {
 

	@Id
	@GeneratedValue
	private Integer admin_id;
	
	//�˺�
private String count;
//����
private String password;
 
public Integer getAdmin_id() {
	return admin_id;
}
public void setAdmin_id(Integer admin_id) {
	this.admin_id = admin_id;
}
public String getCount() {
	return count;
}
public void setCount(String count) {
	this.count = count;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}



	
}
