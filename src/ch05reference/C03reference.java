package ch05reference;

public class C03reference {

	public static void main(String[] args) {
		int a = 5;
		int b = a;
		
		String c = "jave";
		String d = c;
		
		System.out.println(a == b); // true
		System.out.println(c == d); // true
	}

}
