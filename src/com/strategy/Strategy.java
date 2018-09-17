package com.strategy;

/**
 * @author Administrator
 * @date 2018/8/23
 */
public interface Strategy {

	double getPrice(double standardPrice);
}

class NewCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("新客户少量还想打折？腿打折！");
		return standardPrice;
	}
}

class NewCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("新用户大量打9折，原价：" + standardPrice);
		return standardPrice * 0.9;
	}
}

class OldCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("老用户少量打85折，原价：" + standardPrice);
		return standardPrice * 0.85;
	}
}

class OldCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("老用户大量打8折，原价：" + standardPrice);
		return standardPrice * 0.8;
	}
}