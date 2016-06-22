package com.memcache.test;


import java.io.IOException;
import java.net.InetSocketAddress;

import net.spy.memcached.MemcachedClient;

public class MemcacheTest {

	
	public static void main(String[] args) throws IOException {
//		String[] serverList={"172.27.54.75:11211"};
//		SockIOPool pool=SockIOPool.getInstance();
//		pool.setServers(serverList);
//		pool.initialize();
//		
//		MemCachedClient mc=new MemCachedClient();
//		String key="key1";
//		String value="bbb";
//		mc.set(key, value);
		
		
		 MemcachedClient client=new MemcachedClient(new InetSocketAddress("172.27.54.75", 11211));
	      //60是超时数，默认以秒为单位
	      client.set("test", 6000, "1111测试memcache成功了吧");
	   
	    
//	     System.out.println(client.get("test"));
	      client.shutdown();//关闭连接
	}
}
