package x.y.use;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import x.y.p36.Foo;
import x.y.service.HelloBean;

public class SpringAppP36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Foo bean =  (Foo)factory.getBean("foo");
//		
		Foo bean2 =  (Foo)factory.getBean("foo");
	}

}
