package demo.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 * @date 2018/8/25
 */
public class Test {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		Person person = new Person(1, "张三", new Date());
		list.add(person);
		person = new Person(2, "李四", new Date(1123121261629816L));
		list.add(person);
		person.setId(3);
		list.add(person);
		person.setBirthday(new Date());
		list.add(person);
		for (Person p : list) {
			System.out.println(p);
		}
	}
}

class Person {

	private int id;
	private String name;
	private Date birthday;

	public Person(int id, String name, Date birthday) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", birthday=" + birthday +
				'}';
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
}