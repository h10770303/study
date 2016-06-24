package com.memcache.test;


import java.io.IOException;
import java.net.InetSocketAddress;

import net.spy.memcached.MemcachedClient;

public class MemcacheTest {

//	public static void main(String[] args) {
//		 MemCachedClient mcc = new MemCachedClient();
//		 String[] servers = {"172.27.54.75:11211"};
//	       Integer[] weights = {3};
//	       
//	       // 创建Socket连接池对象
//	       SockIOPool pool = SockIOPool.getInstance();
//	       
//	       // 设置服务器信息
//	       pool.setServers(servers);
//	       pool.setWeights(weights);
//	       pool.setFailover(true);
//	       
//	       // 设置初始连接数、最小和最大连接数以及最大处理时间
//	       pool.setInitConn(5);
//	       pool.setMinConn(5);
//	       pool.setMaxConn(250);
//	       pool.setMaxIdle(1000*60*60*6);
//	       
//	       // 设置主线程睡眠时间
//	       pool.setMaintSleep(30);
//	       
//	       // 设置TCP参数、连接超时等
//	       pool.setNagle(false);
//	       pool.setSocketTO(3000);
//	       pool.setSocketConnectTO(0);
//	       pool.setAliveCheck(true);
//	       
//	       // 初始化连接池
//	       pool.initialize();
//	       
//	       // 压缩设置，超过指定大小（单位为K）的数据都会被压缩
//	       mcc.setCompressEnable(true);
//	       mcc.setCompressThreshold(64 * 1024);
//	       
//	       mcc.add("key1", "122112");
//	       System.out.println(mcc.get("key1"));
//	}
	
////		//  连接方式2： 使用socket套接字的方式进行连接
	public static void main(String[] args) throws IOException {
		
		 MemcachedClient client=new MemcachedClient(new InetSocketAddress("172.27.54.75", 11211));
//	      //60是超时数，默认以秒为单位
	      client.set("test", 6000, "1111测试memcache成功了吧");
//	   
	     System.out.println(client.get("test"));
	      client.shutdown();//关闭连接
	}
}
