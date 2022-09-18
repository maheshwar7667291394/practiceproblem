package ThreadPool2;

public class Printjob implements Runnable{
	
         String name;

		public Printjob(String name) {
			super();
			this.name = name;
		}

		@Override
		public void run() {
		  System.out.println(name+" job is printed by thread "+Thread.currentThread().getName());
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println(name+" job is completed by thread "+Thread.currentThread().getName());
		}
         
         

}
