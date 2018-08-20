package com.proxy.staticproxy;

/**
 * @author Administrator
 * @date 2018/8/20
 */
public class RealSinger implements SingInterface {

	@Override
	public void negotiation() {

	}

	@Override
	public void signContract() {

	}

	@Override
	public void sing() {
		System.out.println("歌手开始唱歌");
	}

	@Override
	public void sing(String singName) {
		System.out.println("歌手开始唱" + singName + "歌");
	}

	@Override
	public void collectMoney() {

	}
}
