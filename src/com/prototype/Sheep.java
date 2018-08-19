package com.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 测试深拷贝，反序列化也可以实现深拷贝
 *
 * @author Administrator
 * @date 2018/08/19
 */
public class Sheep implements Cloneable, Serializable {   //1997,英国的克隆羊，多利！

	private String sname;
	private Date birthday;


	public Sheep(String sname, Date birthday) {
		super();
		new Sheep();
		this.sname = sname;
		this.birthday = birthday;
	}


	private Sheep() {
		//故意休眠10ms检查生成对象的快慢
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();  //直接调用object对象的clone()方法！
		// 进行深度克隆
		Sheep sheep = (Sheep) obj;
		sheep.birthday = (Date) this.birthday.clone();
		return sheep;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Sheep{" +
				"sname='" + sname + '\'' +
				", birthday=" + birthday +
				'}';
	}
}
