package Basic_04;

public class Method_03 {
	String car = "자동차";
	static String car2 = "자동차";
	
	
	public static void main(String[] args) {
		
		Method_03 carr = new Method_03();
		carr.car="오토바이";
		carr.car2 ="오토바이";
		System.out.println(carr.car);
		System.out.println(car2);
		Method_03 hit = new Method_03();
		System.out.println(hit.car2);
	}

}
