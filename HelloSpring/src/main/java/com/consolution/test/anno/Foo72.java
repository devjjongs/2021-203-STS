package com.consolution.test.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component // 하나의 클래스로 인스턴트화 시켜주는 @
			// Component("~~") 임의의 ~~로 생성 가능
public class Foo72 {
	private String name;

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void doFoo72() {
		System.out.println("Foo72.doFoo72()"); // Foo72 클래스가 가지고 있는 doFoo 메소드
	}

	public Foo72() {
		System.out.println("Foo72()"); // Foo72의 생성자
	}

	@PostConstruct
	public void start() {
		System.out.println("Foo72.start()"); // Foo72 클래스의 start 메소드
	}

	@PreDestroy
	public void stop() {
		System.out.println("Foo72.stop()"); // Foo72 클래스의 stop 메소드
	}
}