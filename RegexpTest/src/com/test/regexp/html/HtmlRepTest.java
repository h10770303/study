

package com.test.regexp.html;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 将<div></div> 或者<p></p>中的内容进行提取 增加换行符
 * @author hh
 *
 */
public class HtmlRepTest {
	
	public static void main(String[] args) {
		
//		 String string = "<span class=\"acm\">回复[3042]</span>"  
//		            + "<span class=\"acm\">回复[3043]</span>"  
//		            + "<span class=\"acm\">回复[]</span>"  
//		            + "<span class=\"acm\">回复[3]</span>";  
//		    Pattern p = Pattern.compile("(?<=<span\b[^>]*?>)[^<>]+(?=</span>)");  
////		    Pattern p = Pattern.compile("<[^>]*>[^>]*\\[(\\d*)\\][^>]*</[^>]*>");  
//		    Matcher m = p.matcher(string);  
//		    StringBuilder sb = new StringBuilder();  
//		    while (m.find()) {  
//		        sb.append(m.group(1));  
//		        sb.append("\n");  
//		    }  
//		    System.out.println(sb.toString());  
		
		
		 String str="<p>测试环境换行问题测试</p><p>环境换行问</li>lilili<li>题测试环境换行问题测试环境换行"
		 		+ "问题测试环<ul class=\" list-paddingleft-2\"><li>境换行问题测试环境换行问题测</li></ul>"
		 		+ " 试环境换行问题测试环境换行问题"
		 		+ "</p><div>测试环境换行问题测试环境换<strong>行问题测试环境换</strong>行问题测试环境换行问题"
		 		+ "测试环境换行问题</div><div>测试环境换行问<span>题测试环境换行问题测</span>试环境换"
		 		+ "行问题</div><div>测试环境<span>换行问题测试</span>环境换行问题</div>";
		 
//		 str=" <ol class=\" list-paddingleft-2\"><li><p><span style=\"line-height: 1.42857;\">给对方辅导辅导费</span><br/></p></li><li><p>方法发<span style=\"font-family:Arial Black\">的方法多的地方对方</span>答复</p></li><li><p><strong>风复古风格风格复古风格 非顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶发发发顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶的方法反反复复反复反复</strong></p></li></ol><p><strong><ul class=\" list-paddingleft-2\"><li><p>到底的方法反反复复反复反复烦烦烦</p></li><li><p>发的发&nbsp;</p></li></ul></strong></p>";
//		  String regex="(?<=>\\()\\d+\\+?(?=\\))";
////		  String regex="<p.*?>(.*?)</p> ";
//		  Pattern p =Pattern.compile(regex);
//		  Matcher m=p.matcher(str);
//		  while(m.find()){
//		   System.out.println(m.group(1));
//		  }
		 /**
		  * 对该正则表达式进行解释：
		  * (?! )   匹配模式， 括号里面的不匹配。  具体可参考正则表达式规则表，还有其他类似的
		  * 解释： 匹配含<或者</ 紧跟着的任何非>的字段最后为>的表达式进行匹配，但是不包括，<p </p <div </div 的标签
		  */
		String newStr= str.replaceAll("</?(?!/?p|/?div)[^>]*>", "");
		 System.out.println(str);
		 System.out.println(newStr);
		 String finlStr=newStr.replaceAll("<p>|<div>", "")
				 .replaceAll("</p>|</div>", "/n");
		 System.out.println(finlStr);
		 
		 
		 
	}

}