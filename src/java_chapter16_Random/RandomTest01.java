package java_chapter16_Random;

import java.util.Random;

public class RandomTest01 {

	public static void main(String[] args) {
		double randomNum1 = Math.random();
		//Math.random()사용하기
		System.out.println(randomNum1);
        //랜덤값: 0~1사이의 값만 실수로 랜덤으로 만들어줌 -> randomNum1에 저장
	    
	    int randomNum2 = (int)(Math.random()*10);
	    System.out.println(randomNum2);
	    
	    System.out.println(randomNum2+1);
	    
	    int randomNum3 = (int)(Math.random()*6)+1; //1~6사이의 랜덤수
	    System.out.println(randomNum3);
	    
	    int randomNum4 = (int)(Math.random()*45)+1; //1~45사이의 랜덤수
	    System.out.println("로또번호: " + randomNum4);
	    
	    Random random = new Random();
	    int random1 = random.nextInt(10)+1; //0~10사이의 수중 랜덤수 반환
	    System.out.println("로또번호: " + random1);
	    
	    int random2 = random.nextInt(45)+1; //0~45사이의 수중 랜덤수 반환
	    System.out.println("로또번호: " + random2);
	    
	    
}
}
