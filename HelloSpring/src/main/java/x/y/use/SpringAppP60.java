package x.y.use;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import x.y.p36.Bar;
import x.y.p46.CalculatorService;
import x.y.p46.CalculatorServiceImpl;

public class SpringAppP60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
//		
//		Bar beanRef = (Bar)factory.getBean("barScopeSingle");
		
		System.out.println("////");
		
		ApplicationContext factory2 =
				new ClassPathXmlApplicationContext("applicationContext.xml");
//		Bar beanRef2 = (Bar)factory2.getBean("barScopeSingle");
		
	}

}



















