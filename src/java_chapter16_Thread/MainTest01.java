package java_chapter16_Thread;

public class MainTest01 {

	public static void main(String[] args) {
		MyThread01 t1 =new MyThread01();
		MyThread01 t2 =new MyThread01();
		
		t1.run();  //run -> thread 적용 안됨
		t2.run(); 
		System.out.println("======================");
		t1.start();  
		t2.start();  // 쓰레드는 반드시 start()로 실행해야 함
	
	
	   for(int i =1;i<=5;i++) {
		   System.out.println(i);
		   try {
			Thread.sleep(1000);  //1초간 cpu 휴식
		} catch (InterruptedException e) {
			e.printStackTrace();
		} //1초는 1000 단위(밀리세컨드) 1000분의1초,..
	   }
	}

}
