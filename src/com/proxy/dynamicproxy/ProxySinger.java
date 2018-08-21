package com.proxy.dynamicproxy;

/**
 * 唱歌的经纪人，只负责自己的模块，其他非自己的模块不负责
 *
 * @author Administrator
 * @date 2018/8/20
 */
public class ProxySinger implements SingInterface {

	ProxySinger() {
	}

	@Override
	public void negotiation() {
		System.out.println("经纪人开始谈判");
	}

	@Override
	public void signContract() {
		System.out.println("经纪人签署合同");
	}

	@Override
	public void sing() {

	}

	@Override
	public void sing(String singName) {

	}

	@Override
	public void collectMoney() {
		System.out.println("经纪人收钱");
	}
}
