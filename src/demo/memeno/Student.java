package demo.memeno;

import java.util.Date;

/**
 * @author Administrator
 * @date 2018/8/25
 */
public class Student {

	private int id;
	private String name;
	private Date birthday;

	public Student(int id, String name, Date birthday) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", birthday=" + birthday +
				'}';
	}

	Memeno createMemeno() {
		return new Memeno(this);
	}

	void restoreMemeno(Student student) {
		this.id = student.getId();
		this.name = student.getName();
		this.birthday = student.getBirthday();
	}
}
