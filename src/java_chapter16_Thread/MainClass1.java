package java_chapter16_Thread;

public class MainClass1 {

	public static void main(String[] args) {


		alarmThread alarm = new alarmThread();
		alarm.start();
		
		for(int i=6;i>=1;i--) {
			System.out.println("남은시간:"+ i +"초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("타임아웃!프로그램종료!");
	}

}
