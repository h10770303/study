package com.test.regexp.pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * 测试 正在表达式中 appendReplacement appendTail 与replaceAll repaceFrist 区别 都有替换的意思
 * 
 * @author hh
 *
 */
public class AppendReplacementTest {

	public static void main(String[] args) {

		Map<String, Object> map = new HashMap<>();
		String str = "尊敬的客户${customer},您本次消费金额${amount}￥,您的账户${account}" + "余额为${balance}， 欢迎下次光临！";
		map.put("customer", "胡明伟");
		map.put("amount", "1400");
		map.put("account", "622821002***319");
		map.put("balance", "1500000");

		String result = getResult(str, map);
		System.out.println("最后处理后的结果：" + result);
	}

	/**
	 * 通过正则表达式处理字符串 使之变量进行替换
	 * 
	 * @param str
	 * @param map
	 * @return
	 */
	private static String getResult(String str, Map<String, Object> map) {
		String result = "";
		System.out.println("处理之前的字符串：" + str);
		// String regex="\\$\\{(.*)\\}"; // 注意针对特殊字符的必须要进行转义
		String regex = "\\$\\{(.*?)\\}"; // 注意?的非贪婪模式的用法
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		// System.out.println("测试是否匹配："+m.find());
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			// System.out.println("全匹配的结果："+m.group(0));
			// System.out.println("匹配1组的结果："+m.group(1));
			// System.out.println("组数："+m.groupCount());
			String value = (String) map.get(m.group(1));
			// System.out.println("匹配到的字符串对应的值为："+value);
			// result=str.replaceAll(m.group(1), value);
			m.appendReplacement(sb, value); // 作用将匹配的字符串替换，并将该匹配结果插入sb中
			System.out.println("处理之后的字符串：" + sb);
		}
		// System.out.println("sb="+sb);
		m.appendTail(sb);// 最后一次匹配后剩余的字符串添加到sb 中
		return sb.toString();
	}

}
