package org.techhub.colldep;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("application.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		College college = (College) bf.getBean("cn");
		college.show();
	}

}
