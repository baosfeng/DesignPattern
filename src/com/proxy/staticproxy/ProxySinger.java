package com.proxy.staticproxy;

/**
 * 唱歌的经纪人，由他做中间人，介绍歌手唱歌
 *
 * @author Administrator
 * @date 2018/8/20
 */
public class ProxySinger implements SingInterface {

	RealSinger singer;

	public ProxySinger(RealSinger singer) {
		this.singer = singer;
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
		singer.sing();
	}

	@Override
	public void sing(String singName) {
		singer.sing(singName);
	}

	@Override
	public void collectMoney() {
		System.out.println("经纪人收钱");
	}
}
