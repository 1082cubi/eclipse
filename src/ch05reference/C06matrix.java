package ch05reference;

public class C06matrix {

	public static void main(String[] args) {

		int[][] a = {{1,2,3}, {10,20,30}, {100,200,300} };
		int[][] b = a;
		
		System.out.println(a[0][2]); //3
		System.out.println(b[0][2]); //3
		
		a[1][1] = 2000;
		System.out.println(a[1][1]); //2000
		System.out.println(b[1][1]); //20? 2000? 당연히 2000
		
		
		b[2][2] = 9999;
		System.out.println(b[2][2]);
		System.out.println(a[2][2]);
		
		b[2] = new int[] {111,222,333};
		System.out.println(b[2][2]);
		System.out.println(a[2][2]); 
		
		b= new int [][] {{33,44}, {22,11}};
		System.out.println(b[1][0]);
		System.out.println(a[1][0]);

	}

}
