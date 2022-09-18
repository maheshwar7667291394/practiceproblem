package Threadpool;

public class poolA {
	
	
	public  void fun1() {
	      for(int i=1;i<=10;i++) {
		  System.out.println("inside chiild thread of run method "+i);;
		}
	
}
	
	public static void main(String[] args) {
		
	
      
		

		Thread t=new Thread(new poolA():: fun1);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("inside main thread of main metho d"+ i);
		}
	}

}
