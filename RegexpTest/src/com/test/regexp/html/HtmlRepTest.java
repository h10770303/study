
package com.test.regexp.html;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 将<div></div> 或者
 * <p>
 * </p>
 * 中的内容进行提取 增加换行符
 * 
 * @author hh
 *
 */
public class HtmlRepTest {

	public static void main(String[] args) {

		// String string = "<span class=\"acm\">回复[3042]</span>"
		// + "<span class=\"acm\">回复[3043]</span>"
		// + "<span class=\"acm\">回复[]</span>"
		// + "<span class=\"acm\">回复[3]</span>";
		// Pattern p = Pattern.compile("(?<=<span\b[^>]*?>)[^<>]+(?=</span>)");
		//// Pattern p =
		// Pattern.compile("<[^>]*>[^>]*\\[(\\d*)\\][^>]*</[^>]*>");
		// Matcher m = p.matcher(string);
		// StringBuilder sb = new StringBuilder();
		// while (m.find()) {
		// sb.append(m.group(1));
		// sb.append("\n");
		// }
		// System.out.println(sb.toString());

		String str = "<p>测试环境换行问题测试</p><p>环境换行问</li>lilili<li>题测试环境换行问题测试环境换行"
				+ "问题测试环<ul class=\" list-paddingleft-2\"><li>境换行问题测试环境换行问题测</li></ul>" + " 试环境换行问题测试环境换行问题"
				+ "</p><div>测试环境换行问题测试环境换<strong>行问题测试环境换</strong>行问题测试环境换行问题"
				+ "测试环境换行问题</div><div>测试环境换行问<span>题测试环境换行问题测</span>试环境换"
				+ "行问题</div><div>测试环境<span>换行问题测试</span>环境换行问题</div>";

		str = "<p class=\"titlebody\" style=\"color: green;\"><span class=\"titlebody head\" contenteditable=\"false\">【正文】</span></p><p class=\"titlebody\" style=\"color: green;\"></p><div xmlns:apxh=\"http://www.w3.org/1999/xhtml\" class=\"titlebody\" style=\"color: green;\">"
				+ "<p>"

				+ "	</p><p>RESTRICTION SUMMARY: AP CLIENTS ONLY</p>" + "	<p>SHOTLIST:</p>"
				+ "	<p>AP TELEVISION - AP CLIENTS ONLY</p>" + "	<p>Doha, Qatar - 17 April 2016</p>"
				+ "	<p>1. Tracking shot of Saudi Oil Minister Ali al-Naimi walking into oil producers&#39; meeting</p>"
				+ "	<p>(i) to check the terms of their licence agreements for use of content outside news programming and that further advice and assistance can be obtained from the AP Archive on: Tel +44 (0) 20 7482 7482 Email: info@aparchive.com</p>"
				+ "	<p>(ii) they should check with the applicable collecting society in their Territory regarding the clearance of any sound recording or performance included within the AP Television News service</p>"
				+ "	<p>(iii) they have editorial responsibility for the use of all and any content included within the AP Television News service and for libel, privacy, compliance and third party rights applicable to their Territory.</p>"
				+ "</div><p class=\"titlebody\" style=\"color: green;\"></p>";
		str = "<p>今天是国际护士节。在国际和平妇幼保健院上完夜班的护士们意外地享受到了贵宾待遇，坐上了免费的专车回家。&nbsp;"
				+ "一早，国际和平妇幼保健院三楼产房，还在忙碌的护士们就收到了司机们送上的鲜花。&nbsp;"
				+ "23年前，大众约租车的驾驶员周曜就出生在这里，今天能够专门来服务护士让他特别兴奋。而戴敏也准备养二胎，今天特地主动请缨来送护士。“拍一下马屁， 护士们确实也很辛苦！”&nbsp;"
				+ "而在楼下，一排专车早早就在待命，将负责把护士们安全送回家，这让刚上完一晚夜班的护士很是意外。"
				+ "“平日里下班都坐地铁回家，有的时候太困了，在地铁里都会睡着，坐过站，今天不担心了，专车送回家，很安心。”&nbsp;"
				+ "据介绍，不仅是护士节，大众方面还考虑在平日里也给予医护人员车费优惠和特别服务，比如车费减免并鼓励驾驶员优先多抢医院的单子。“如果同样两张单子的话，我们会优先去考虑医院的单子。因为不管是用车高峰，还是在平时，医护人员跟患者在等车上面都不太容易。将心比心，所以我们会为他们多考虑一些。” 看看新闻网记者何晓报道。</p>";
		str = "<p class=\"titlebody\" style=\"color: green;\"><span class=\"titlebody head\" contenteditable=\"false\">【正文】</span></p><p class=\"titlebody\" style=\"color: green;\">北京：交通拥堵收费真的要来了<br/>（记者 董燕）<br/><br/>昨天（5月26日），北京市政协召开雾霾治理提案办理协商会。在回复委员关于征收拥堵费建议时，相关部门表示，本市已初步制定了交通拥堵收费政策方案和技术方案，目前正在组织进一步深入研究和论证。 争议多年的交通拥堵费政策出台在即，北京已率先制定方案。<br/>【插照片 2010年大拥堵】<br/>据了解，北京市政协十二届四次会议关于雾霾治理的提案有19件，涉及6大类21方面共94条具体建议。这94条建议已经有82条拟采纳，12条被部分采纳。<br/>在回复有关委员“开征拥堵费”的建议时，相关部门回复称：北京市交通委会同发展改革委、环保局、公安交管局等部门，在充分借鉴新加坡、伦敦、斯德哥尔摩等城市经验基础上，初步制定了本市交通拥堵收费政策方案和技术方案，目前正在组织进一步深入研究和论证。<br/>拥堵费一旦开征，汽车就可能不是你想开就能开的，首先得看看自己的腰包。对于北京市民尤其是司机们来说，他们会持什么态度呢？<br/>(插视频“拥堵费1”)<br/>【北京市民1：我觉得不合理。（为什么）你限行但收税是按满年收的，这也收那也收，所以（再收）不太合理】<br/>【北京市民2：收呗，我真说实话，堵车现在堵得都恶心】<br/>【北京市民3：我觉得没问题收就收吧，真的无所谓，改善交通嘛】<br/>【北京市民4：唉，怎么说呢，收可能会稍微好一点。因为有一些因为涉及到成本，他可能会适当减少一些出行机会。但是他该开的还是开，他没办法需要开车开始开。就跟我这送货一样，必须开】<br/>【北京市民：征收也没用（为什么）拥堵费啊，收多了它不会，收少了一点作用起不到】<br/><br/>如果真的开收拥堵费，怎么个收法？ 收多少？ 这是个问题。中国道路运输协会副会长王丽梅认为，如果开征就得让大家有点心疼才能有效果。<br/>那么到底额外支出多少能让车主们每天考虑一下要不要开车呢？记者随机采访了20位私车司机。按月计算：<br/>300元及以上&nbsp;&nbsp; &nbsp;200元左右&nbsp;&nbsp; &nbsp;无论多少都不愿意&nbsp;&nbsp; &nbsp;无所谓<br/>3&nbsp;&nbsp; &nbsp;10&nbsp;&nbsp; &nbsp;6&nbsp;&nbsp; &nbsp;1<br/><br/>&nbsp;北京对于拥堵费的讨论始于2010年“世纪大堵车”之后，当时曾进行过一番关于是否要收拥堵费以“治堵”的讨论，不过之后没有了下文。2012年冬天雾霾大爆发，2013年9月，北京市印发《北京市2013~2017年清洁空气行动计划》，将治理重点直指机动车排放。“征收拥堵费“一事再次进入公众视野，不过依然没有明确的时间表。<br/>实际上，拥堵费之所以迟迟没有推出，就是因为每一次提出来，争议都一直在持续，无法弥合，在2012年全国两会期间关于拥堵费的讨论中，有专家认为：拥堵费指标不治本 只能影响价格敏感车主， 而广东省社科院院长梁桂全直言斥责“拥堵费是 “用交通灾难发财”，甚至连标都治不了！” <br/>直到2015年，有机构监测分析报告称：2014年北京的PM2.5来源解析显示，机动车排放占比约1/3，为PM2.5本地来源最大头。去年年底，北京机动车保有量超过了500万辆，年排放污染物近70万吨。空气污染与拥堵两个问题在机动车这一点上有了交集，促使北京市相关部门下了决心。 去年12月，北京市交通委主任周正宇在一次接受媒体采访时明确表态，2016年将研究试点征收拥堵费。<br/>&nbsp;&nbsp;&nbsp;&nbsp; 而为了解决拥堵和空气污染的问题，这几年北京先后推出了提高停车费、尾号限行、车牌摇号等方式来减少路面压力和控制车辆增长速度，但城市交通状况依然在继续恶化。拥堵费作为解决拥堵问题比较靠后的一个选项如果真要推出， 需要回答更多的问题：1、征收拥堵费的合法性在哪里？2、能否达到治堵的效果？如果不能达到预期效果怎么办？3、公共交通设施、交通管理效率、道路规划设计能否跟得上？4、公平性问题如何解决: 公务车会不会征收拥堵费？城内的私家车如何征收？&nbsp; 5、 哪个部门收？收到的钱怎么花？<br/>【插视频“拥堵费2”】<br/>&nbsp;&nbsp;&nbsp;&nbsp; 【北京市民： 我觉得应该有更好的办法来治堵，收拥堵费是不合适的，这笔钱用在哪儿？到时候最后咱也不知道。光收了，到时候还是拥堵，对于那些公车或者出租车，照样在城里跑，所以对私家车不太公平】<br/>【北京市民：这钱收了以后去哪儿用在哪儿了？收了这钱是不是真能把拥堵解决了呢？如果解决不了你是不是要退10倍给我】<br/>&nbsp;&nbsp;&nbsp;&nbsp; 国家发改委综合运输研究所城市交通室主任程世东认为：治理大城市的拥堵问题必须综合施策，靠某一项措施是没有用的，征收拥堵费即便作为一项暂时的、阶段性治标的措施要推出必须非常慎重。最终还是需要靠大力发展公共交通、改善公交环境来吸引市民主动使用公交才是上策。<br/>【插音频“拥堵费（程世东采访）”】<br/>【&nbsp; 国家发改委综合运输研究所城市交通室主任程世东 】<br/>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<br/>&nbsp;【延伸阅读】<br/>它们这样收拥堵费<br/>■新加坡：驶入控制区每次收费2至14元<br/>新加坡是世界上最早征收交通拥堵费的国 家，1975年就开始在市中心6平方公里的控制区域征收“交通拥堵费”，除公交车辆外，驶入车辆都要缴费。按照不 同路段、时段、车辆种类，收费标准为0.5新元/次至3新元/次（约合2元至14元人民币）。当车辆经过电子收费系统时(如图），收费器自动扫描与车牌号 唯一对应的读卡器扣费。越是拥挤的路段、越是高峰期收费越贵，同样是小汽车，私家车辆比出租车收费贵。有些路段按季节进行收费，比如通往学校的路段，学校 放假期间停止收费，待开学之后重新开始收费。<br/>■英国伦敦：驶入特定区域收90元拥堵费<br/>伦敦自2003年开始征收拥堵费，划定区域约为20平方公里(如图）。收费区内设置了大约800个摄像头，专门识别车牌号。根据规定，周一到周五早7点到晚6点半间，驾车进入这一地区的司机每天必须缴纳10英镑（约合90元人民币）拥堵费。<br/>■瑞典斯德哥尔摩：进入市中心须交8至16元<br/>2005年，瑞典首都斯德哥尔摩决定对进入市 中心的驾驶者试行收取拥堵费。除周末和法定节假日外，每天上午6点半至下午6点半，驾车进城或出城时须支付 10至20瑞典克朗（约合8至16元人民币）不等的拥堵费。具体金额要根据不同的时段收取，但每天最多不超过60瑞典克朗（约合48元人民币）。自行车、 紧急车辆、特定商用车以及国外牌照的汽车不在拥堵费征收对象中。目前，68%斯德哥尔摩人步行或者骑车上班。<br/>记者：董燕</p>";
		// str= "<p >回复[3042]</p>"
		// + "<span class=\"acm\">回复[3043]</span>"
		// + "<span class=\"acm\">回复[]</span>"
		// + "<span class=\"acm\">回复[3]</span>";
		// str=" <ol class=\" list-paddingleft-2\"><li><p><span
		// style=\"line-height:
		// 1.42857;\">给对方辅导辅导费</span><br/></p></li><li><p>方法发<span
		// style=\"font-family:Arial
		// Black\">的方法多的地方对方</span>答复</p></li><li><p><strong>风复古风格风格复古风格
		// 非顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶发发发顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶的方法反反复复反复反复</strong></p></li></ol><p><strong><ul
		// class=\"
		// list-paddingleft-2\"><li><p>到底的方法反反复复反复反复烦烦烦</p></li><li><p>发的发&nbsp;</p></li></ul></strong></p>";
		// String regex="(?<=>\\()\\d+\\+?(?=\\))";
		//// String regex="<p.*?>(.*?)</p> ";
		// Pattern p =Pattern.compile(regex);
		// Matcher m=p.matcher(str);
		// while(m.find()){
		// System.out.println(m.group(1));
		// }
		/**
		 * 对该正则表达式进行解释： (?! ) 匹配模式， 括号里面的不匹配。 具体可参考正则表达式规则表，还有其他类似的 解释： 匹配含<或者</
		 * 紧跟着的任何非>的字段最后为>的表达式进行匹配，但是不包括，<p </p <div </div 的标签
		 */
		// newStr = content.replaceAll("</?(?!/?p|/?div)[^>]*>", "");
		// result = newStr.replaceAll("<p[^>]*>|<div[^>]*>",
		// "").replaceAll("</p>|</div>", "/n");

		String newStr = str.replaceAll("</?(?!/?p|/?div|/?br)[^>]*>", "");
		String result = newStr.replaceAll("<p[^>]*>|<div[^>]*>", "").replaceAll("</p>|</div>|<br/>", "/n")
				.replaceAll("&nbsp;", "");

		System.out.println("final=" + result);

	}

}
