package Dedlocpractioce;

public class A {
	
	public synchronized void funA(B b) {
		System.out.println("inside funA of A");
		b.fun2();
	}
	
	public  void  fun1() {
		System.out.println("inside fun1 of A");
	}

}
