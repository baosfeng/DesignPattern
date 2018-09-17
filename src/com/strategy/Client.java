package com.strategy;

/**
 * @author Administrator
 * @date 2018/8/23
 */
public class Client {

	public static void main(String[] args) {
		Strategy strategy = new NewCustomerFewStrategy();
		double price = strategy.getPrice(100);
		System.out.println(price);
		strategy = new OldCustomerManyStrategy();
		price = strategy.getPrice(1000);
		System.out.println(price);

	}
}
