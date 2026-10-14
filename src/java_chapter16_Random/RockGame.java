package java_chapter16_Random;

import java.util.Random;
import java.util.Scanner;

public class RockGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int count1 = 0;
		while(true) {
			System.out.println("가위(0),바위(1),보(2) 중에 하나를 입력하세요(게임종료->9): ");
			String userChoice = sc.nextLine();
	        //0,1,2중 하나가 저장
			int user = Integer.parseInt(userChoice); //유저가 선택한 0,1,2를 정수로 변환하여 저장
		if(user==9) {
			System.out.println("게임이 종료 되었습니다!"); 	
		    break;
		}if(count1==5) {
			System.out.println("축하합니다. 5번 승리하였습니다. 게임이 종료 됩니다!"); 	
		    break;
		}int computer = random.nextInt(3); // 0,1,2중에 랜덤으로 하나를 컴퓨터 추출

	    if(user==computer) {
	    	System.out.println("비겼습니다!"); 	
	    }else if((user==0&&computer==2)||(user==1&&computer==0)||(user==2&&computer==1)) {
	    	System.out.println("이겼습니다!");
	    	//내가 이겼을때, 가위-> 0,2 바위-> 1,0 보-> 2,1
	    	count1++;
	    }else {
	    	System.out.println("졌습니다!"); 	
	    }
	    }
		}
	}

		
	
