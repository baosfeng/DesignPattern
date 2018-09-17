package demo.memeno;

import java.util.Date;

/**
 * @author Administrator
 * @date 2018/8/25
 */
public class Client {

	public static void main(String[] args) {
		Student student = new Student(1, "张三", new Date(1234567890L));
		System.out.println(student);
		CareTaker careTaker = new CareTaker(student.createMemeno());
		student = new Student(2, "李四", new Date());
		System.out.println(student);
		student.restoreMemeno(careTaker.getMemeno().getStudent());
		System.out.println(student);


		CareTaker taker = new CareTaker();
		taker.setMemeno("第一次", student.createMemeno());
		student = new Student(2, "李四", new Date(12426184616412L));
		taker.setMemeno("第二次", student.createMemeno());
		student = new Student(3, "王五", new Date(1291941924914194L));
		taker.setMemeno("第三次", student.createMemeno());
		student = new Student(4, "马六", new Date(14612642124712L));
		taker.setMemeno("第四次", student.createMemeno());

		System.out.println(student);
		student.restoreMemeno(taker.getMemenoByDesc("第二次").getStudent());
		System.out.println(student);
	}
}
