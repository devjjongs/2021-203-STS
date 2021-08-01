package x.y.use;

import java.util.*;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import x.y.p36.Bar;
import x.y.p46.CalculatorService;
import x.y.p46.CalculatorServiceImpl;

public class SpringAppScopeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		// bean scope singleton , prototype
		// p36.Bar p36.Baz~~~ 이용 ==> 직접이용이 아니고 DI
		Bar beanRef = (Bar) factory.getBean("barScopeSingle");
		System.out.println("///////////////////=======");
		Bar beanRef2 = (Bar) factory.getBean("barScopeSingle");
		System.out.println("///////////////////");

		System.out.println("\\\\\\\\\\   ///////////////////\\\\\\\\");
		Bar beanRef3 = (Bar) factory.getBean("barScopeProt");
		System.out.println("///////////////////");
		Bar beanRef4 = (Bar) factory.getBean("barScopeProt");
		System.out.println("///////////////////");
	}
}