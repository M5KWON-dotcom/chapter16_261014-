package java_chapter16_Thread;

public class MainTest02 {

	public static void main(String[] args) {
		
		HelloThread ht1 = new HelloThread();
		HiThread ht2 = new HiThread();
		
		ht1.start();
		ht2.start();
	}

}
