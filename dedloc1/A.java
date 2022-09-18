package dedloc1;

import Dedlocpractioce.B;

public class A {
	
	
	public synchronized void funA(B b) {
		
		System.out.println("inside of funA of A");
		
		b.fun2();
		System.out.println("outside of funA of A");
	}
	
	public synchronized void fun1() {
		System.out.println("inside fun fun1 of A");
	}

	
}
