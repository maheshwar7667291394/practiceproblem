package Dedlocpractioce;

public class ThreadB extends Thread{
	
	A a;
	B b;
	public ThreadB(A a, B b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public void run() {
		b.funB(a);
	}
}
