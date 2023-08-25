package Basic_06_E;

import java.util.Scanner;


public class Football_Title {

	public static void main(String[] args) {
		
		Football_Epl football_epl = new Football_Epl();
		Football_laliga football = new Football_laliga();
		Football_Bunde football_bunde = new Football_Bunde();
		Football_Prangs prangs = new Football_Prangs(); 
		Scanner aaa = new Scanner(System.in);
		String soccer = "축구리그 검색 (이피엘,라리가,분데스리가,리그앙)";
		
		System.out.println(soccer);
		while(true) {
		String gul= aaa.next();
		
		
			if(gul.equals("이피엘")) {
				football_epl.Epl_f();
			} 
			else if (gul.equals("라리가")) {
				football.Football_1();
			}
			else if (gul.equals("분데스리가")) {
				football_bunde. Bunde_f();
			}
			else if (gul.equals("리그앙")) {
				prangs.prangs_f();
			}
			else {
				System.out.println("4개중에 검색해");
				continue;
			}
			
			System.out.println("\n다시 입력하겠습니까? y/n");
				gul = aaa.next();
				
				if(gul.equals("y")) {
					System.out.println(soccer);
				}
				else if (gul.equals("n")){
					System.out.println("축구를 사랑해주셔서 감사합니다");
					break;
				}
		}
		
	}

}
