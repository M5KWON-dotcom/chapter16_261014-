package java_chapter16_Random;

import java.util.Random;

public class SeedTest {

	public static void main(String[] args) {
		
		Random random = new Random();//seed 입력 ->Random(55)->입력안하면 시간불러와서 자동입력
		
		System.out.println(random.nextInt(10));
		System.out.println(random.nextInt(10));
		System.out.println(random.nextInt(10));
		System.out.println(random.nextInt(10));
		System.out.println(random.nextInt(10));

	}

}
