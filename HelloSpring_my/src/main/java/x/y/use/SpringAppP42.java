package x.y.use;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import x.y.p42.Foo42;
import x.y.service.GreetingService;
import x.y.service.HelloBean;

public class SpringAppP42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Foo42 foo42 = (Foo42) factory.getBean("foo42");
		foo42.doBar42();
	}
}