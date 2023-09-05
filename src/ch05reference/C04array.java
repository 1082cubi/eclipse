package ch05reference;

public class C04array {

	public static void main(String[] args) {
		int a = 5;
		int b = a;
		
		System.out.println(a);  //같다
		System.out.println(b);
		
		int[] c = {3,4,5};
		int[] d = c;
		
		c[2] = 55;
		
		System.out.println(c[2]); //55
		System.out.println(d[2]); //5? 55? 당연히 55다

	}

}
