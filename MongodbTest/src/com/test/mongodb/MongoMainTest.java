package com.test.mongodb;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;


public class MongoMainTest {
	
	public static void main(String[] args) throws UnknownHostException {
		Mongo mo=new Mongo();
		List<String> list=mo.getDatabaseNames();
		// 查询所有的数据库名
		for (String string : list) {
			System.out.println("mongodb dataBase:"+string);
		}
		
		/**
		 * 针对具体数据库集合进行操作
		 */
		DB db=mo.getDB("testdb");
//		Set<String>set=db.getCollectionNames();
//		for (String string : set) {
//			System.out.println("testdb中的集合："+string);
//		}
		
		/**
		 * 针对具体数据表的文档进行操作
		 */
		DBCollection dbc=db.getCollection("testdb");
		System.out.println("testdb的数据量："+dbc.count());
		DBCursor cursor=dbc.find();
		while (cursor.hasNext()) {
			DBObject dbObject = (DBObject) cursor.next();
			System.out.println(dbObject);
			
		}
		
		/**
		 * mongodb save
		 */
//		String string="{\"id\":2,\"name\":\"hh\",\"age\":33}";
//		DBObject dbo=new BasicDBObject();
//		dbo.put("id", 2);
//		dbo.put("name", "胡明伟");
//		dbo.put("age", 33);
//		dbc.save(dbo);
//		System.out.println(dbc.save(dbo).getN());
//		System.out.println(dbc.find(dbo).getQuery());
		
		/**
		 * mongodb delete 
		 */
//		DBObject dbo=new BasicDBObject();
//		dbo.put("name", "u_29");
//		System.out.println(dbc.remove(dbo).getN());
//		System.out.println(dbc.find(dbo).getQuery());
		
		/**
		 *  mongodb update
		 */
		//upser true 不存在就添加 multi true  只修改一条，false 多条修改
//		dbc.update(q, o, upsert, multi)
		
		DBObject dbo=new BasicDBObject();
		System.out.println(dbc.update(new BasicDBObject("name", "u_28"), new BasicDBObject("age",50.5 )).getN());
//		dbo.put("", arg1)
		
		
	}
	

}
