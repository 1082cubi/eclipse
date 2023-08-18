package Basic_01;

public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money = 32345;
		int man, chun, bak, si, w, nam;
		
		man =  money/10000;
		nam = money - (man*10000);
		System.out.printf("만원 : %d(나머지 %d)\n",man,nam);
		 
		chun = nam/1000;
		nam = nam - (chun*1000);
		System.out.printf("천원 : %d(나머지 %d) \n",chun,nam);
		

	}

}
