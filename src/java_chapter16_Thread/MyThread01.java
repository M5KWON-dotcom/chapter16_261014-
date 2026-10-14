package java_chapter16_Thread;

public class MyThread01 extends Thread{

	@Override
	public void run() {
	
		for(int i=1;i<=5;i++) {
			System.out.println("쓰레드작업: "+ i);	
		}
	}
	
	

}
