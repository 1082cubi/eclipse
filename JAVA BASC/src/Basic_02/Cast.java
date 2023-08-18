package Basic_02;

public class Cast {
	int a=0;
	byte b = (byte)a;
	long kbs = 10;
	double sbs = 3.14 *10;
	
	void pri() {
		System.out.printf("long 형에 입력 : %d",kbs);
		System.out.printf("\ndouble형에 정수 곱하기 입력 : %f",sbs);
		System.out.printf("\n4바이트 int형이 1바이트에 강제 변환 : %d",b);
	}

	public static void main(String[] args) {
		
		Cast cast = new Cast(); 
		cast.pri();
		
		
		
		// TODO Auto-generated method stub
//		long kbs = 10;
//		System.out.printf("long형에 성수 입력 : %d",kbs);
//		
//		double sbs = 3.14 *10;
//		System.out.printf("\ndouble형에 정수 곱하기 입력 : %f",sbs);
//		
//		int a=130; 
//		byte b = (byte)a;
//		System.out.printf("\n4바이트 int형이 1바이트에 강제 변환 : %d",b);
//		
		
	}

}
