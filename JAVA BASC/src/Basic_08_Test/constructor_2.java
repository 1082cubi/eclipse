package Basic_08_Test;

public class constructor_2 {

	public static void main(String[] args) {
		ghkl p1 = new ghkl("홍길동",10);
		ghkl p2 = new ghkl("이동수",20);
		ghkl p3 = new ghkl("김혜수",30);
		
		ghkl[] pars= {p1,p2,p3};
		for(int i=0; i<pars.length; i++) {
			System.out.println(pars[i].str());
		}

	}

}
class ghkl {
	String name;
	int age;
	ghkl(String name,int age) {
		this.name=name;
		this.age=age;
	}


String str() {
	return String.format("이름 %s: 나이 : %d",this.name,this.age );
}
}