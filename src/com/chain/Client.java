package com.chain;

/**
 * 责任链模式就是只负责自己能处理的，不能处理就交给下一级进行处理
 *
 * @author Administrator
 * @date 2018/8/23
 */
public class Client {

	public static void main(String[] args) {
		LeaveRequest request = new LeaveRequest("张三", 20, "世界那么大，我想去看看！");
		Leader director = new Director("李四");
		Leader manager = new Manager("王五");
		Leader generalManager = new GeneralManager("马六");
		Leader boos = new Boos("赵七");
		director.setNextLeader(manager);
		manager.setNextLeader(generalManager);
		generalManager.setNextLeader(boos);

		director.handleRequest(request);
	}
}
