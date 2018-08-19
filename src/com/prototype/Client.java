package com.prototype;

import org.junit.Test;

import java.io.*;
import java.util.Date;

/**
 * 测试克隆类
 *
 * @author Administrator
 * @date 2018/8/19
 */
public class Client {


	/**
	 * 测试通过实现Cloneable接口实现深度克隆
	 *
	 * @throws CloneNotSupportedException
	 */
	@Test
	public void testClone() throws CloneNotSupportedException {
		//实验正常开始之前
		Sheep sheep = new Sheep("邵莉", new Date(123456789L));
		System.out.println(sheep);
		//克隆之后
		Sheep cloneSheep = (Sheep) sheep.clone();

		sheep.setBirthday(new Date());

		System.out.println("对照组，修改了sheep的值，观察cloneSheep的值是否会发生改变");
		System.out.println(sheep);
		System.out.println(cloneSheep);
	}

	/**
	 * 测试通过反序列化方式实现深度克隆
	 */
	@Test
	public void testSerial() {
		//实验正常开始之前
		Sheep sheep = new Sheep("邵莉", new Date(123456789L));
		System.out.println(sheep);
		//开始进行反序列化操作
		ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteOutputStream)) {
			//将sheep写入byteOutputStream中
			objectOutputStream.writeObject(sheep);
			//将生成的字节流转换为byte数组
			byte[] bytes = byteOutputStream.toByteArray();
			ByteArrayInputStream byteInputStream = new ByteArrayInputStream(bytes);
			ObjectInputStream objectInputStream = new ObjectInputStream(byteInputStream);
			//将对象从流中转换出来
			Sheep serialSheep = (Sheep) objectInputStream.readObject();

			//修改值，查看是否会发生改变
			sheep.setBirthday(new Date());
			System.out.println(sheep);
			System.out.println(serialSheep);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGenere() throws CloneNotSupportedException {
		long startTime = System.currentTimeMillis();
		int numSize = 1000;
		generalCreateObj(numSize);
		long endTime = System.currentTimeMillis();
		System.out.println("常规生成" + numSize + "个对象消耗的时间：" + (endTime - startTime));


		startTime = System.currentTimeMillis();
		cloneCreateObj(numSize);
		endTime = System.currentTimeMillis();
		System.out.println("克隆生成" + numSize + "个对象消耗的时间：" + (endTime - startTime));
	}

	private void cloneCreateObj(int numSize) throws CloneNotSupportedException {
		Sheep sheep = new Sheep("邵莉", new Date(123456789L));
		for (int i = 0; i < numSize; i++) {
			sheep.clone();
		}
	}

	private void generalCreateObj(int numSize) {
		for (int i = 0; i < numSize; i++) {
			new Sheep("邵莉", new Date(123456789L));
		}
	}
}
