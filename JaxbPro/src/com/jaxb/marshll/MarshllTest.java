package com.jaxb.marshll;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;

import com.jaxb.po.Student;

public class MarshllTest {
	
	
	/**
	 * 将jaxb对象 序列化xml
	 * @param value
	 * @param os
	 */
	@SuppressWarnings("unchecked")  
	public static <T> String marshallXmlType(T value, OutputStream os) {  
	    try {  
	        Class<T> clzz = (Class<T>) value.getClass();  
	        JAXBContext context = JAXBContext.newInstance(clzz);  
	        Marshaller m = context.createMarshaller();  
	        m.setProperty("jaxb.formatted.output", true); 
	        m.setProperty(Marshaller.JAXB_ENCODING, "GBK"); 
	        QName name = new QName(clzz.getSimpleName());  
	        JAXBElement<T> element = new JAXBElement<T>(name, clzz, value);  
	        m.marshal(element, os);  
	        return os.toString();
	    } catch (JAXBException e) {  
	        e.printStackTrace();  
	    }  
	    return null;
	} 
	
	/**
	 * xml 转化成对象
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
	
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream  os=new ByteArrayOutputStream();
		Student s=new Student();
		s.setAge(22);
		s.setName("gg");
		// 将jaxb对象 转换成xml
	   String xml=	marshallXmlType(s, os);
	   System.out.println(xml);
		os.close();
		
		Student s2=unmarshallXmlType(Student.class, xml);
		System.out.println(s2);
		
	}

}
