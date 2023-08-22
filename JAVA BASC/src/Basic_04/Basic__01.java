package Basic_04;

public class Basic__01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, count=0;
		do {
			count++;
			sum += count;
			
		} while(count < 100);
		System.out.println("현재 값 : " + sum);   //1부터 100까지 더한 값을 구해라
		 
	}

}
