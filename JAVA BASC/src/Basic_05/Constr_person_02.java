package Basic_05;

public class Constr_person_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hong hong = new Hong("홍길동",188,"좋음","책읽기");
		hong.name_func();
		Hong hong2 = new Hong("홍홍홍",198,"보통","기타연주");
		
		
	}

}

class Hong {
	String name;
	int ki;
	String kid;
	String rea;
	
	Hong(String a,int c,String b,String d ){
	name = a;
	ki = c;
	kid = b;
	rea = d;
	System.out.printf("이름은 : %s \n키는 : %d  \n성격은 : %s  \n취미는 : %s \n",a,c,b,d);
	}
	String name1="한의혁";
	void name_func(){
		System.out.println(name1);
		
	}
	
	

}

