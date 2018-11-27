package com.future;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * 数据类
 *
 * @author Administrator
 * @date 2018/11/27 21:35
 */
public class Data implements Callable<String> {

	private String result;

	private String query;

	public Data(String query) {
		this.query = query;
	}

	@Override
	public String call() throws Exception {
		result = "查询条件" + query + "操作结果：";
		TimeUnit.SECONDS.sleep(5);
		return result;
	}
}
