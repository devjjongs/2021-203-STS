package x.y.use;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import x.y.p46.CalculatorService;
import x.y.p46.CalculatorServiceImpl;

public class SpringAppP46_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

//		CalculatorService ref1 =  (CalculatorServiceImpl)factory.getBean("calculator");
//		ref1.listOutput();
		
		//ref1.get
		//CalculatorServiceImpl ref2 =  (CalculatorServiceImpl)factory.getBean("calculator48");
		CalculatorServiceImpl ref2 =  (CalculatorServiceImpl)factory.getBean("calculator46_48");
		Properties properties = ref2.getProperties();
//		String serverValue = properties.getProperty("server");
//		System.out.println(serverValue);
		
		ref2.listOutput();
		
		
		///////  ref2.getProperties();  값중에서 key를 모를때 사용하는 방법
		Enumeration  keys  =  properties.keys();
		List<String> keyList = new ArrayList<String>();
		
		while( keys.hasMoreElements()  ) {
			keyList.add((String)keys.nextElement());
		}
//		
//		for(Object key : keys ) {//Can only iterate over an array or an instance of java.lang.Iterable
//			System.out.println(key);
//		}
//		
		
		for(String key : keyList ) {
			
			System.out.println(key+":" + properties.getProperty(key));
		}
		
		
		
	}

}



















