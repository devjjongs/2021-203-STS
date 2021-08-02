package x.y.p40;

public class Foo {
	private Bar bar40;

	public void setBar40(Bar bar40) {
		this.bar40 = bar40;
		System.out.println("void setBar40(Bar bar40)");
	}
	public Bar getBar40() { //get은 매개 변수 없이 return만 있는 형식
		return bar40;
	}
}
