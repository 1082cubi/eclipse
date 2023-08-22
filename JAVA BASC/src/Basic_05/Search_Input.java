package Basic_05;

import java.util.Scanner;

public class Search_Input extends Search_Array {
	String name;
	void input_name() {
		
		
		Scanner scanf = new Scanner (System.in);
		
		while (true) {
			System.out.println("사람을 입력해주세요");
			name = scanf.next();
			
			
			int count=0;
			
			for(String src : nameA) {
				if (name.equals(src)) 
					break;
				count++;
				}
			System.out.println(nameA [count] + "\t"+   ageA [count]  +  "\t" + telA [count]);
			System.out.println("더 할거냐? 안하는게 좋을 걸? (y/n)");
			name = scanf.next();
			if(name.equals("n"))
				break;
			
			}
		
	
		}
		
		
	
	
		
		
		
		
	}

