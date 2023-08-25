package Org.open.number;

import java.util.Scanner;

public class Socc_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Socc_messi messisi = new Socc_messi();
		Socc_namir namirmir = new Socc_namir();
		
		System.out.println("메시, 네이마르중 선택");
		
		while (true) {
		String gum = sc.next();
		
		
			if(gum.equals("메시")) {
				messisi.messi_2();
				gum = sc.next();
				if(gum.equals("1")) {
					messisi. messi_3();
				}
				else 
					messisi.messi_4();
				
			}
			else if (gum.equals("네이마르")) {
				namirmir.namir_1();
				gum = sc.next();
				if(gum.equals("1")) {
					namirmir.namir_2 ();				
			}
				else 
					namirmir.namir_3 ();	
			}
			else if(gum.equals("y")) {
				System.out.println("계속 검색 하실건가요? y/n");
				continue;
			}
			else 
				break;
		}
	}

}
