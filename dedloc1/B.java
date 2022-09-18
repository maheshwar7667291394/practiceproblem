package dedloc1;

public class B {
	
	public synchronized void funB(A a) {
		System.out.println("inside funB of b");
		a.fun1();
		System.out.println("outside of funB of b");
	}
	public synchronized void fun2() {
		System.out.println("inside fun2 of B");
	}

}
