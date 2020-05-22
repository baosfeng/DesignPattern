package com.future;

import java.util.concurrent.*;

/**
 * 使用jdk内置的future类来实现future设计模式的创建
 * 具体的实现过程为:单独创建一个新的线程去执行任务,其他的任务继续异步执行
 *
 * @author 小书包
 * @date 2018/11/27 21:37
 */
public class Client {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		String query = "查询条件";
		FutureTask<String> futureTask = new FutureTask<>(new Data(query));

		//创建线程池
		ExecutorService executorService = new ThreadPoolExecutor(10, 10,
				0L, TimeUnit.MILLISECONDS,
				new LinkedBlockingQueue<Runnable>(1024));
		executorService.submit(futureTask);
		System.out.println("任务提交完毕，开始异步操作");
		System.out.println("异步操作1");
		System.out.println("异步操作2");

		System.out.println("查询中...");
		//获得请求后的结果
		System.out.println(futureTask.get());

		executorService.shutdown();

	}
}
