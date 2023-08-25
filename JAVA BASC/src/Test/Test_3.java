package Test;

public class Test_3 {
	static int pay= 1500000;
	static int su= 55000;
	static double tax =0.1;
	
	static int func() {
		return (pay + su) - (int)(150000 * tax); 
	}
	public static void main(String[] args) {
		
//		System.out.println( func() + "원" );
		
		
		
		Test_3 test = new Test_3();
		int result = test.func();
		System.out.println(result + "원");
		
			
		
		
	}

}
