package Basic_08_Test;

public class Extends_1 {

	public static void main(String[] args) {
		
		Chi my = new Chi(10,20);
		System.out.println("홍길동 기준 (홍길동)나의 총 재산 : " + my.chi_money);
		System.out.println("홍길동 기준 (홍길동) 부모의 총 재산 : " + my.p_price);
		
		Chi my2 = new Chi(35,25);
		System.out.println("이동수 기준 (이동수)나의 총 재산 : " + my2.chi_money);
		System.out.println("이동수 기준 (이동수)부모의 총 재산 : " + my2.p_price);
	}

}
class parMoney {
	int p_money;		//부모 돈
	int p_kum=100;		//부모 재산
	int p_price;		//늘어난 재산
	parMoney(int ex) {	//10을 전달받고
		p_money = ex;	//부모 돈은 10
		p_price = p_kum + p_money;	// 10 + 100부모의 늘어난 돈 중 110
		
	}
}
class Chi extends parMoney {
	int chi_money;
	int chi_kum=50;
	Chi(int ex1, int ex2) {
		super(ex1);			//10
		chi_money = ex2; 		//20
		chi_money = chi_kum + chi_money; //50 +20 자식의 늘어난 돈 중 70
	}
	
}
