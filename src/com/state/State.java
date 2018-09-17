package com.state;

public interface State {

	void handle();
}

/**
 * 空闲状态
 *
 * @author Administrator
 */
class FreeState implements State {

	@Override
	public void handle() {
		System.out.println("房间空闲！！！没人住！");
	}

}

/**
 * 已入住状态
 *
 * @author Administrator
 */
class CheckedInState implements State {

	@Override
	public void handle() {
		System.out.println("房间已入住！请勿打扰！");
	}

}

/**
 * 已预订状态
 *
 * @author Administrator
 */
class BookedState implements State {

	@Override
	public void handle() {
		System.out.println("房间已预订！别人不能定！");
	}

}