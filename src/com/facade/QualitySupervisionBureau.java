package com.facade;

/**
 * 质监局接口
 *
 * @author Administrator
 * @date 2018/08/23
 */
public interface QualitySupervisionBureau {

	void orgCodeCertificate();  //办理组织机构代码证
}


/**
 * 质监局接口实现类
 *
 * @author Administrator
 * @date 2018/08/23
 */
class TheHaiDianOfQualitySupervisionBureau implements QualitySupervisionBureau {

	@Override
	public void orgCodeCertificate() {
		System.out.println("在海淀区质检局办理组织机构代码证！");
	}

}
