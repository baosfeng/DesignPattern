package com.facade;

/**
 * 银行接口
 *
 * @author Administrator
 * @date 2018/08/23
 */
public interface Bank {

	void openAccount();  //开户
}

/**
 * 银行接口实现类
 *
 * @author Administrator
 * @date 2018/08/23
 */
class IndustrialAndCommercialBankOfChina implements Bank {

	@Override
	public void openAccount() {
		System.out.println("在中国工商银行开户！");
	}

}
