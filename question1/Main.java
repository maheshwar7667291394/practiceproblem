package question1;

public class Main {
	
	public static void main(String[] args) {
		
		ThreadA t1=new ThreadA();
		t1.start();
		synchronized (t1) {
			
		
		try {
			t1.wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("main thread starting");
		int result=t1.total;
		for(int i=0;i<3;i++) {
			System.out.println(result);
		}
		System.out.println("main thred end ");
	}
	}
}
