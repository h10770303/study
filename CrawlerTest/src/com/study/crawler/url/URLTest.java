package com.study.crawler.url;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 该为 爬虫的第一步 获取网页的源代码
 * 
 * @author hh
 *
 */
public class URLTest {

	public static void main(String[] args) throws IOException {

		try {
			URL url = new URL("http://developer.51cto.com/art/201103/249779.htm");
			// System.out.println("url组成之协议：" + url.getProtocol());
			// System.out.println("url组成之域名：" + url.getHost());
			// System.out.println("url组成之端口：" + url.getPort());
			// System.out.println("url组成之默认端口：" + url.getDefaultPort());
			// System.out.println("url组成之查询参数：" + url.getQuery());
			// System.out.println("url组成之相对路径：" + url.getPath());
			// System.out.println("url组成之全路径：" + url.getFile());
			// System.out.println("url组成之版权：" + url.getAuthority());
			// System.out.println("url组成之相关：" + url.getRef());
			// System.out.println("url组成之用户信息：" + url.getUserInfo());
			// System.out.println("url组成之连接：" + url.getContent().toString());
			// System.out.println("url组成之网络流：" + url.openStream());// 网络流
			// ，进行爬虫时需要
			// System.out.println("url获取当前页面的编码集："+url.openConnection().getContentEncoding());

			// ===========================================
			// 读取流 1. 使用最原始的流 会出现乱码 因此 用buferstream 进行转换
			// InputStream in=url.openStream();
			// byte[] b=new byte[1024];
			// int len=0;
			// while (-1!=(len=in.read(b))) {
			// System.out.println(new String(b, 0, len));
			// }
			// in.close();

			// ==========================使用bufferreader进行流的读取 文件流写 =
			// ==涉及到文件时用到fileinptu fileoutout=
			InputStream in = url.openStream();
			String charset = "utf-8";
			BufferedReader read = null;
			String readeLine = null;
			// charset = getCharset(in, read, charset, readeLine);
			readAndWrite(url, read, getCharset(in, read, charset, readeLine), readeLine);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 关闭流文件
	 * 
	 * @throws IOException
	 */
	private static void streamClose(InputStream in, BufferedReader read, FileOutputStream out, BufferedWriter write)
			throws IOException {
		read.close();
		in.close();
		if (out != null)
			out.close();
		// write.close();

	}

	/**
	 * 爬虫读取网页文件 并写入指定文件中 最后关闭流文件
	 * 
	 * @param in
	 * @param read
	 * @param charset
	 * @param readeLine
	 * @throws IOException
	 */
	private static void readAndWrite(URL url, BufferedReader read, String charset, String readeLine)
			throws IOException {
		read = new BufferedReader(new InputStreamReader(new BufferedInputStream(url.openStream()), charset));
		FileOutputStream out = new FileOutputStream("baidu.html");
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(out, charset)); // utf-8
		while ((readeLine = read.readLine()) != null) {
			System.out.println(readeLine);
			System.out.println();
			// write.write(readeLine);
			write.append(readeLine);
			write.newLine();
		}

		streamClose(url.openStream(), read, out, write);
	}

	/**
	 * 通过页面获取页面的编码集
	 * 
	 * @param in
	 * @param read
	 * @param charset
	 * @return
	 * @throws IOException
	 */
	private static String getCharset(InputStream in, BufferedReader read, String charset, String readeLine)
			throws IOException {
		read = new BufferedReader(new InputStreamReader(new BufferedInputStream(in), charset));
		while ((readeLine = read.readLine()) != null) {
			System.out.println(readeLine);
			if (readeLine.contains("charset")) {
				int index = readeLine.indexOf("charset");
				charset = readeLine.substring(index + 8, index + 13);
				charset = (charset.contains("gb") ? "gb2312" : "utf-8");
				break;
			}
		}
		// streamClose(in, read, null, null);
		return charset;
	}

}
