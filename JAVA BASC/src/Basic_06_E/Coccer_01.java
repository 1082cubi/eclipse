package Basic_06_E;

import java.util.Scanner;

public class Coccer_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Soccer_Nimar soccer_nimar = new Soccer_Nimar();
		Soccer_Messi soccer_messi = new Soccer_Messi();
		
		
		String gim = "축구선수 메시, 네이마르 둘중 검색";
		System.out.println(gim);
		gim = sc.nextLine();
		while(true) {
			if(gim.equals("메시")) {
				soccer_messi.messi();
				
			} else if(gim.equals("네이마르")) {
				soccer_nimar.nimar();
			
			} else {
					System.out.println("제대로 입력해주세요");
			}
				
				System.out.println("\n다시 검색 하실거면 y/n ");
				String ggg = sc.nextLine();
				String fifi = "메시 네이마르 중 선택";
			  if ( ggg.equals("y")) {
					System.out.println(fifi);
					gim = sc.nextLine();
			} else if (ggg.equals("n")) {
					System.out.println("종료합니다");
					break;
				}
		}
				
		}
		
		

	}


