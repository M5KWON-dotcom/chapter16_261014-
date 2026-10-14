package java_chapter16_Thread;

public class alarmThread extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //2초
			System.out.println("[알람] 삐!삐!삐!삐!삐!");
		}

	
	}

}
