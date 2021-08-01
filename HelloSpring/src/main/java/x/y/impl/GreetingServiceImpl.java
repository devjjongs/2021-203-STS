package x.y.impl;

import x.y.service.GreetingService;
import x.y.service.OutputService;

public class GreetingServiceImpl implements GreetingService {
	private String greeting;
	private int loopCount;
	private OutputService outputter;
	
	public void setOutputter(OutputService outputter) {
		this.outputter = outputter;
	}

	public GreetingServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public GreetingServiceImpl(String greeting, int loopCount) {
		this.greeting = greeting;
		this.loopCount = loopCount;
	}

	@Override
	public void greetings() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= loopCount; i++) {
			System.out.println(greeting);
		}
	}
	
	@Override
	public void byNameTest() {
		System.out.println("byName");
	}
	
	@Override
	public void byTypeTest() {
		System.out.println("byType");
	}
	
	@Override
	public void constructorTest() {
		
	}
}