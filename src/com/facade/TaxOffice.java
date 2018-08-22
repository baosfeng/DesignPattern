package com.facade;

/**
 * 税务局接口
 *
 * @author Administrator
 * @date 2018/08/23
 */
public interface TaxOffice {

	void taxCertificate();  //办理税务登记证
}

/**
 * 税务局接口实现类
 *
 * @author Administrator
 * @date 2018/08/23
 */
class TheHaiDianOfTaxOffice implements TaxOffice {

	@Override
	public void taxCertificate() {
		System.out.println("在海淀税务局办理税务登记证！");
	}

}
