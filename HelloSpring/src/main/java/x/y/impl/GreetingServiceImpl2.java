package x.y.impl;

import x.y.service.GreetingService;
import x.y.service.OutputService;

public class GreetingServiceImpl2 implements GreetingService {
	private OutputService  outputter;
	
	public void GreetingServiceImpl2(OutputService outputter) {
		// TODO Auto-generated constructor stub
		this.outputter = outputter;
	}

	@Override
	public void greetings() {
		// TODO Auto-generated method stub
	}

	@Override
	public void byNameTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void byTypeTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void constructorTest() {
		// TODO Auto-generated method stub
		
	}

}