package com.facade;

/**
 * 办理注册公司流程的门面对象
 *
 * @author Administrator
 * @date 2018/08/23
 */
public class RegisterFacade {

	public void register() {
		//工商局
		AdminstrationOfIndustryAndCommerce commerce = new TheHaiDianOfAdminstrationOfIndustryAndCommerce();
		commerce.checkName();
		//质监局
		QualitySupervisionBureau bureau = new TheHaiDianOfQualitySupervisionBureau();
		bureau.orgCodeCertificate();
		//税务局
		TaxOffice office = new TheHaiDianOfTaxOffice();
		office.taxCertificate();
		//银行
		Bank bank = new IndustrialAndCommercialBankOfChina();
		bank.openAccount();
	}
}
