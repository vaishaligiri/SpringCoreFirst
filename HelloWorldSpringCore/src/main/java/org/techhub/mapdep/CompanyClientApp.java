package org.techhub.mapdep;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CompanyClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Resource r=new ClassPathResource("application.xml");
       BeanFactory bf=new XmlBeanFactory(r);
		Company c = (Company) bf.getBean("comp"); //new Company()
		Company c1 = (Company) bf.getBean("comp");
		Company c2 = (Company) bf.getBean("comp");
		

	}

}
