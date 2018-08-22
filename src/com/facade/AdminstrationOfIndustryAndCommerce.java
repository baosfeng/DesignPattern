package com.facade;

/**
 * 工商局接口
 *
 * @author Administrator
 * @date 2018/08/23
 */
public interface AdminstrationOfIndustryAndCommerce {

	void checkName();  //核名
}

/**
 * 工商局接口具体实现类
 *
 * @author Administrator
 * @date 2018/08/23
 */
class TheHaiDianOfAdminstrationOfIndustryAndCommerce implements AdminstrationOfIndustryAndCommerce {

	@Override
	public void checkName() {
		System.out.println("检查名字是否有冲突！");
	}

}
