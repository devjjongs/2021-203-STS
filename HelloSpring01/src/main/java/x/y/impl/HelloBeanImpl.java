package x.y.impl;

import x.y.service.HelloBean;

public class HelloBeanImpl implements HelloBean {

    @Override
    public void sayHello(String name) {
    	// TODO Auto-generated method stub
    	System.out.println("안녕하세요." +name+"씨!");
    }

}
