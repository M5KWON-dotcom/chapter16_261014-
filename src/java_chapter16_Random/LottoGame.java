package java_chapter16_Random;

import java.util.Random;
import java.util.Scanner;

public class LottoGame {

	public static void main(String[] args) {
		
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	System.out.println("원하시는 로또번호 게임 갯수를 입력하세요: ");
	int gameCount = sc.nextInt();
	int count =1;
	
	while(count>gameCount){
		count++;
	int[] lottoNumbers = new int[6];
	
	for(int i=0;i<6;i++) {
		lottoNumbers[i]=random.nextInt(45)+1;
		for(int j=0;j<i;j++) {
			if(lottoNumbers[i]==lottoNumbers[j]) {
				i--;
			break;
			}
		}
	}
	//	System.out.println("["+lottoNumbers+"]");
	for(int lottoNumber:lottoNumbers) {
		System.out.println("["+lottoNumber+"]");
	}
	System.out.println();
	}
	}
}



