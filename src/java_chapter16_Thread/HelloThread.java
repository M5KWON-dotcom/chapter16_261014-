package java_chapter16_Thread;

public class HelloThread extends Thread{

	public static void main(String[] args) {
	
		
		
	}

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		
		}
	}
}