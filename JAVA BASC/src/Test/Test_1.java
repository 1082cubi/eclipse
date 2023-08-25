package Test;

public class Test_1 {
		static String a= "100";
		static String b= "100";
		
		
		static void calc( ) {
			int _a = Integer.parseInt(a);		//integer 이 모지?
			int _b = Integer.parseInt(b);
			System.out.printf(" %d +  %d  =  %d",_a,_b,_a+_b);
		}
	public static void main(String[] args) {
//		String a = "100";
//		String b = "200";
//		int _a = Integer.parseInt(a);
//		int _b = Integer.parseInt(b);
//		System.out.printf(" %d * %d = %d",_a,_b,_a*_b);
		calc();
	}

}
