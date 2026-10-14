package java_chapter16_Thread;

public class ThreadTest01 {

	public static void main(String[] args) {
	/*	//thread를 사용하지 않는 경우
		for(int i=1;i<=5;i++) {
			System.out.println("첫번째작업:" + i);
		}
		for(int i=1;i<=5;i++) {
			System.out.println("두번째작업:" + i);
		}*/
		//thread를 사용하는경우
		
		Thread t1 = new Thread(() -> {
				for(int i=1;i<=5;i++) {
					System.out.println("첫번째작업:" + i);
				}
		});
		Thread t2 = new Thread(() -> {
			for(int i=1;i<=5;i++) {
				System.out.println("두번째작업:" + i);
			}
	});
		t1.start();  //t1 thread 시작
		t2.start();  //t2 thread 시작 cpu가 t1,t2 동시에 일함->순서가 돌릴때마다 다름
	}

}
