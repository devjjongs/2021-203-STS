package x.y.use;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.consolution.test.anno.Bar72;

public class P77AnnoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Resource resource = new ClassPathResource("annoTestContext.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);

		ApplicationContext context = new ClassPathXmlApplicationContext("annoTestContext.xml");// 배열을 이용해서 넣어줘도 되고,
																								// ","를 이용해서 여러개 넣어도
																								// 상관 없음

		Bar72 bar72 = (Bar72) context.getBean("bar72");
		System.out.println("beans 생성");
		bar72.doBar72();// bar72에서 doBar72를 가져와서 사용
	}
}