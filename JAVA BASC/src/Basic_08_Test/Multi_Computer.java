package Basic_08_Test;

public class Multi_Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lang lang = new Java();
		lang.show();

	}

}
class Lang {
	String name;
	int page;
	int def;
	
	
	public void show() {
		System.out.println("--------------------");
		System.out.println("언 어 " + name);
		System.out.println("페이지" + page);
		System.out.println("난이도" + def);
		System.out.println("--------------------");
	}
}
class Java extends Lang {
	public Java() {
		name = "자바";
		page = 200;
		def = 50;
	
	}
}
class Javascipt extends Lang {
	public Javascipt() {
		name = "자바스크립트";
		page = 200;
		def = 50;
		
	}
}
