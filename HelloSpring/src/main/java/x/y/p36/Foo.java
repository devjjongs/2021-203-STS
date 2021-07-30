package x.y.p36;

public class Foo {
	private Bar bar;
	private Baz baz;

	public Foo() {
		// TODO Auto-generated constructor stub
	}

	public Foo(Bar bar, Baz baz) {
		System.out.println("Foo 클래스의 인스턴스생성위치 (주소) :"+ Integer.toHexString(hashCode()));
		this.bar = bar;
		System.out.println("bar의 인스턴스 생성");
		this.baz = baz;
		System.out.println("Foo(Bar bar, Baz baz)");
	}
	public void output() {
		bar.아무거나();
	}
}
