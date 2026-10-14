package java_chapter16_HorseGame;

public class Horse extends Thread{
	
	private String name;
	private int distance;
	//100미터달리기 대회
	public Horse(String name) {  //말 이름을 객체로 생성시 인수로 받기위한 생성자
		this.name = name;
	}
	
	public String getHorseName() {
		return name;
	}
	public void setHorseName(String name) {
		this.name= name;
    }
	@Override
	public void run() {
		while(distance <100) { //거짓-> 결승선을 통과
			//1~5미터 사이의 랜덤한 거리로 전진(랜덤-> 경주마 마다 속도가 달라짐)
			int randomStep = (int)(Math.random()*5)+1;
			distance = distance +randomStep;
			if(distance>100) { //만약 100을 넘으면 100으로 보정
				distance= 100;
			}
			//트랙 그래픽 표시
			String track = "";
			for(int i=0;i<distance;i=i+1) {
				track= track+">";
			}
			System.out.println("["+name+"]"+distance+"m"+track);
			System.out.println("--------------------------------------------");
			try {
				Thread.sleep(200);//게임이 너무 빨리 끝나지 않도록 0.5초 동안 잠깐 멈춤 추가
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        }
		    System.out.println("["+this.name+"] 경주마 결승점 통과!");
		
	
}
}