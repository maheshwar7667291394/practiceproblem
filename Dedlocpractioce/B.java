package Dedlocpractioce;

public class B {
	
	public synchronized void funB(A a) {
		System.out.println("inside funB of B");
		a.fun1();
		System.out.println("out side of funB");
	}
	
	public synchronized void fun2() {
		System.out.println("inside of fun2 of B");
	}


}
