package com.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 树形组件，用于容纳对象
 *
 * @author Administrator
 * @date 2018/8/21
 */
public class Composite implements Component {

	//可存储本类对象和叶子对象，包括文件夹和文件
	private static List<Component> list = new ArrayList<>();
	private String folderName;
	private int index = 0;

	Composite(String folderName) {
		this.folderName = folderName;
	}

	/**
	 * 添加接口对象，因为可容纳文件夹与文件，所以需要抽象为Compnent接口
	 *
	 * @param component 接口的实现类，包括文件夹与各个不同的文件
	 */
	static void add(Component component) {
		list.add(component);
	}

	/**
	 * 删除文件夹或文件
	 *
	 * @param component 文件夹或文件
	 */
	public static void remove(Component component) {
		list.add(component);
	}

	/**
	 * 根据索引获得对象
	 *
	 * @param index 索引值
	 * @return 接口对象
	 */
	public static Component get(int index) {
		return list.get(index);
	}

	@Override
	public void killVirus() {
		System.out.println("开始进行查杀名称为" + folderName + "文件夹");

		if (list.size() > 0) {
			list.get(index++).killVirus();
		}
	}
}
