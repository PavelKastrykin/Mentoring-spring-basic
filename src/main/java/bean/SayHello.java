package bean;

public class SayHello {

	private String sayHelloTo;

	public void greeting() {
		System.out.println("Hello, " + sayHelloTo);
	}

	public String getSayHelloTo() {
		return sayHelloTo;
	}

	public void setSayHelloTo(String sayHelloTo) {
		this.sayHelloTo = sayHelloTo;
	}
}
