package question1;

public class ThreadA extends Thread{
	int total;
	
	@Override
	public void  run() {
		
		synchronized(this) {
		
		System.out.println("child thread performing calculation");
		for(int i=1;i<=100;i++) {
			total+=i;
		}
		
		System.out.println("child thred performed calculatiion");
		
		this.notify();
		
//		1000;
		
	}
	}
	

}
