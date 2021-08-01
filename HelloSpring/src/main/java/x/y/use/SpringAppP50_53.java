package x.y.use;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import x.y.impl.GreetingServiceImpl;
import x.y.impl.GreetingServiceImpl2;
import x.y.service.GreetingService;

public class SpringAppP50_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

//		GreetingService ref1 = (GreetingServiceImpl) factory.getBean("greetingP50");
//		ref1.byNameTest();
//		System.out.println("=============== byName ===============");
//		
//		GreetingService ref2 = (GreetingServiceImpl)factory.getBean("greetingP51");
//		ref2.byTypeTest();
//		System.out.println("=============== byType ===============");
		
		GreetingServiceImpl2 ref3 = (GreetingServiceImpl2)factory.getBean("greetingP52");
		ref3.constructorTest();
		System.out.println("============ constructor =============");
	}

}
