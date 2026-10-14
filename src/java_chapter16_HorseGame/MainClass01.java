package java_chapter16_HorseGame;

public class MainClass01 {

	public static void main(String[] args) {
		System.out.println("================================");
		System.out.println("=======경주마 경기가 시작됩니다=======");
		System.out.println("================================");
		
		Horse h1 = new Horse("번개");
		Horse h2 = new Horse("쏘니");
		Horse h3 = new Horse("질풍");
		Horse h4 = new Horse("윈드");
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		
		
		try {
			h1.join(); //join() -> 해당 스레드가 종료 될때까지 메인스레드를 기다리게 하는 기능
			h2.join();
			h3.join();
			h4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("================================");
		System.out.println("====모든 말이 결승점에 도착! 경기끝!===");
		System.out.println("================================");
	}
}
