package com.adapter;

/**
 * 第三方类统一接口，此类用于抽象实现其他系统与本系统进行沟通的公共方法
 * @author Administrator
 * @date 2018年9月17日 21:50:42
 */
public interface Target {

	/**
	 * 处理逻辑
	 */
	void handleRequest();
}
