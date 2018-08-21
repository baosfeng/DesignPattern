package com.proxy.dynamicproxy;

/**
 * 唱歌的抽象接口
 *
 * @author Administrator
 * @date 2018/8/20
 */
public interface SingInterface {

	/**
	 * 谈判
	 */
	void negotiation();

	/**
	 * 签合同
	 */
	void signContract();

	/**
	 * 唱歌
	 */
	void sing();

	/**
	 * 可自定义需要唱的歌
	 *
	 * @param singName
	 */
	void sing(String singName);

	/**
	 * 收钱
	 */
	void collectMoney();
}
