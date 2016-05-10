package com.test.stringe.split;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SplitTest {

	public static void main(String[] args) {
//		String path = "FTP://toavid:toavid@10.27.124.13:2121/inews/全媒报片.报片/a6071cb3-ddaa-49cf-9881-447416b982eb.xml";
////		path="ftp://";
////		matches("(?i)ftp\\:\\/\\/.*")  // 修饰符（不区分大小写）
////		System.out.println("是否匹配=="+path.matches("(?i)ftp\\:\\/\\/.*"));
//		
//		path=path.replaceAll("(?i)ftp\\:\\/\\/", "");
////		System.out.println(""+path);
////		String[] parts = path.split("\\/", 2);
//		String arcSoftTemplate="SD=KankanSD,HD=KankanHD,UHD=KankanHD";
//		String[] parts = arcSoftTemplate.split("[;；、,，]");
////		String[] parts = path.split("\\/", 2);
//		for (int i = 0; i < parts.length; i++) {
//			System.out.println(parts[i]);
////			String[] host=parts[0].split("\\@", 2);
////			for (String string : host) {
////				System.out.println(string);
////			}
//		}
		
		
		/**
		 * 转码模板获取
		 */
		String arcSoftTemplate="test";
//		String arcSoftTemplate="SD=KankanSD,HD=KankanHD,UHD=KankanHD";
		String[] temps=arcSoftTemplate.split("[\\,，；、]");
		String result=temps[0];
		Map<String, Object> temMap=new HashMap<>();
		for (int i = temps.length-1; i >=0 ; i--) {
			System.out.println(temps[i]);
			if(temps[i]!=null){
				String[] cont=temps[i].split("[\\=]");
				if (cont.length==2) {
					temMap.put(cont[0].toUpperCase(), cont[1]);
					result=cont[1];
					System.out.println("temMap="+temMap);
					System.out.println("result="+result);
				}
			}
		}
//		System.out.println("resultFinal=="+result);
//		System.out.println("getTemplate=="+temMap.get("UHD"));
		Set<String> set=temMap.keySet();
		System.out.println("set=="+set);
		for (String string : set) {
			System.out.println("string=="+string);
		}
		if (temMap.size()<=0) {
			System.out.println(11);
		}
		System.out.println("getTemplate=="+temMap.entrySet());
		
	}

}
