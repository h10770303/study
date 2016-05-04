package com.test.stringe.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;




public class DateTest {

	
	public static void main(String[] args) {
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
//		Date date=new Date();
//		Calendar cal=Calendar.getInstance();
//		System.out.println("当前时间为："+sdf.format(cal.getTime()));
//		cal.add(Calendar.MONTH, -3);
//		System.out.println("当前时间为："+sdf.format(cal.getTime()));
//		
//		long time=date.getTime()-cal.getTime().getTime();
//		System.out.println("两个时间相差=="+time);
//		
//		int day=(int) (time/(1000*60*60*24));
//		System.out.println("相差天数=="+day);
		
//		Calendar cal=Calendar.getInstance();
//		cal.add(Calendar.DATE, -4);
//		System.out.println(checkExistsWithinTime(cal.getTime()));
		
		
//		if(true1(true)&&true1(true)&&true1(true)){
//			System.out.println(1);
//		}
		
		
		String aa="ftp://toavid:toavid@10.27.124.13:2121/video/外来电讯.美联社/5045222_Cycling Van den Driessche doping ban.xml";
		System.out.println(aa.length());
	}
	
	
	static boolean true1(boolean aa){
		System.out.println(aa);
		return aa;
	}
	
	/**
	 * 测试时间是否在3天之内
	 * @param date
	 * @return
	 */
	public static boolean checkExistsWithinTime(Date date) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		System.out.println(sdf.format(date));
		long createDate = date.getTime();
		long now = new Date().getTime();
		long time;
		if (now > createDate) {
			time = now - createDate;
		} else {
			time = createDate - now;
		}
		time = time / (1000 * 60 * 60 * 24);
		if (time > 3) {
			return false;
		}
		return true;
	}
	
	
//	private String cutLongPath(String path) {
//		if (path.length() > maxPathLength) {
//			String longPath = path;
//			String ext = Commons.getFileExtension(path);
//			int pathPos = 0;
//			if (path.contains("\\") || path.contains("/")) {
//				pathPos = path.replaceAll("[\\\\\\/][^\\\\\\/]*$", "").length() + 1;
//			}
//			path = path.substring(0, maxPathLength - ext.length());
//			Assert.isTrue(path.length() > pathPos, String
//					.format("将文件路径%s裁剪到%d字符时发生错误，文件路径太长导致文件名被完全裁掉", path,
//							maxPathLength));
//			path += ext;
//			logger.info("发现路径{}长度超过{}，进行裁剪后为{}", longPath, maxPathLength, path);
//		}
//		return path;
//	}
}
