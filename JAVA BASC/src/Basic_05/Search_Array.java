package Basic_05;

public class Search_Array {
	String[] nameA = {"홍길동","이동수","김철수","이다혜","김수정"};
	int[] ageA = {10,20,30,40,50};
	String[] telA = {"010-12-456","010-456","010-89789","010-741741","010-36939"};
	
	
	int i, count =0;
	void line() {
		System.out.println("----------------------------");
	}
	
	
	
	
	void Search_print() {
		System.out.println("데이터 출력");
		line();
		System.out.println("이름    나이    전화");
		line();
//		for(String n : nameA) {
//			System.out.println(n);
		
		for(i=0; i<nameA.length; i++) {
			System.out.println(nameA [i] + "\t" + ageA[i] + "\t" + telA[i]);
			
		}
		}
	}

