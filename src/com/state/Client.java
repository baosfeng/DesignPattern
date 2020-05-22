package com.state;

/**
 * 状态模式,随着状态的改变,而做出不同的反应
 */
public class Client {

	public static void main(String[] args) {
		HomeContext ctx = new HomeContext();

		ctx.setState(new FreeState());
		ctx.setState(new BookedState());

	}
}
