package Basic_08_Test;

public class Constructor_3 {
	public static void main(String[] args) {
		Fither fit = new Fither("메시",38);
		Fither fit1 = new Fither("네이마르",30);
		Fither fit2 = new Fither("한의혁",39);
		Fither fit3 = new Fither("ㅇㄹㅇ",39);
		Fither fit4 = new Fither("ㅎ로",39);
		Fither fit5 = new Fither("ㅏㅣ",39);
		Fither fit6 = new Fither("ㄷㄱ",39);
		Fither fit7 = new Fither("ㅗㅛㅓ",39);
		Fither fit8 = new Fither("ㅇ로",39);
		Fither fit9 = new Fither("ㅓㄱㅁㄴ요",39);
		
		Fither[] seri = { fit,fit1,fit2,fit3,fit4,fit5,fit6,fit7,fit8,fit9,};
		for(int i=0; i<seri.length; i++) {
			System.out.println(seri[i].seri1());
		}
	}
}
class Fither {
	String name;
	int age;
	Fither(String name,int age) {
		this.name=name;
		this.age =age;
	}
	   String seri1() {
		return String.format("%s %d",name,age);
	}
}
