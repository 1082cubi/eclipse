package Test;

public class Test_2 {
	

	public static void main(String[] args) {
		int calculate = 65430;
		int man,chun,beck,si;
		System.out.println("calculate");
		
		man = calculate/10000;
		calculate -= (man * 10000);	
		
		chun = calculate/1000;
		calculate -= (chun * 1000);	// calculate = calculate- (chun*1000);
		
		beck = calculate/100;
		calculate -= (beck * 100);	
		
		si = calculate/10;
		calculate -= (si* 10);	
		
		System.out.printf("\n만원 %d",man);
		System.out.printf("\n천원 %d",chun);
		System.out.printf("\n천원 %d",beck);
		System.out.printf("\n십원 %d",si);
	}

}
