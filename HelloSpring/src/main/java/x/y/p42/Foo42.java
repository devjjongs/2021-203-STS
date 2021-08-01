package x.y.p42;

public class Foo42 {
	private Bar42 bar42;
	
	public void doBar42() {
		System.out.println("1");
		Bar42 bar42 = getBar42() ;
		System.out.println("bar42==>"+bar42);
		System.out.println("2");
		bar42.doIt();
		System.out.println("3");
	}
	
	protected Bar42 getBar42() {
		System.out.println("4");
		return null;
	}

	public void setBar42(Bar42 bar42) {
		this.bar42 = bar42;
	}
	
	
}
