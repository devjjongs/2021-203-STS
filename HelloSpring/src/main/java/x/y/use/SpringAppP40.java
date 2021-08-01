package x.y.use;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import x.y.p40.Foo;
import x.y.service.GreetingService;
import x.y.service.HelloBean;

public class SpringAppP40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		x.y.p40.Foo bean =  (Foo)factory.getBean("fooP40");
		
		Foo fooBean = (Foo)factory.getBean("fooP41");
		
	}

}
