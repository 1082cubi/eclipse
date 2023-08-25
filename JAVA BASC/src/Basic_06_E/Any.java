package Basic_06_E;

import java.util.Scanner;

public class Any {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ani_Tir ani_tir = new Ani_Tir();
		Ani_Cat ani_cat = new Ani_Cat();
		 String gum = "동물검색";
		 System.out.println(gum);
			gum = sc.nextLine();
			while(true) {
				if(gum.equals("호랑이")) {
					ani_tir.tirCha();
				} else if (gum.equals("고양이")) {
					ani_cat.catCha();
				} else {
					System.out.println("두가지밖에 없어요");
				}
		
					System.out.println("\n또 검색하실건가요? y/n");
					String last = sc.nextLine();
						String fufu = "동물검색";
						if(last.equals("y")) {
							System.out.println(fufu);
							gum= sc.nextLine();
							
						} else if (last.equals("n")) {
							System.out.println("종료합니다");
							break;
						}
		
			}
				
	}

}

				
			
			


