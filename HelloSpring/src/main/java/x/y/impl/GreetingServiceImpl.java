package x.y.impl;

import x.y.service.GreetingService;

public class GreetingServiceImpl implements GreetingService {
	private String greeting;
	private int loopCount;
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
		for(int i=1  ;  i <= loopCount  ; i++ ) {
			System.out.println(greeting);
		}
	}
}
