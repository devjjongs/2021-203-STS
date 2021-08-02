package com.consolution.test.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Bar72 {
	private Foo72 foo72;// private 하게 Foo72를 foo72로 지정

	public Bar72() {
		System.out.println("member 변수 foo72가 가지고 있는 주소값 : " + foo72);
	}

	@Required // 와
	@Resource // 를 이용하여 mapping 작업을 해줘야 작동
	public void setFoo72(Foo72 foo72) { // setFoo72가 자동으로 되게 하기 위해서 Required가 필요
		this.foo72 = foo72;
	}

	public void doBar72() {
		System.out.println("doBar72()");
		foo72.doFoo72(); // foo72에서 doFoo72
	}

}
