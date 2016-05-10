package com.jaxb.unmarshll;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.jaxb.po.Student;

public class UnmarshllTest {

	/**
	 * 将xml 转换成对象
	 * 
	 * @param clzz
	 * @param xml
	 * @return
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public static <T> T unmarshallXmlType(Class<T> clzz, String xml) throws IOException {
		try {
			JAXBContext context = JAXBContext.newInstance(clzz);
			Unmarshaller u = context.createUnmarshaller();
			return (T) u.unmarshal(new StringReader(xml));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {

		String xml = "<?xml version=\"1.0\" encoding=\"GBK\" standalone=\"yes\" ?> <Student> <Age>22</Age> <Name> gg </Name> </Student>";

		
		Student s = null;
		try {
			System.out.println(xml);
			s = unmarshallXmlType(Student.class, xml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);

	}

}
