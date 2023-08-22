package Basic_04;


public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s_1 = "abcdefg";
		String s_2 = "ABCDEFG";
		int i_1=1234567;
		double pi = 3.141592;
		
		System.out.println( String.format("%20s",s_1));     //총 자리수 20자리로 앞에 공백 채우기
		System.out.println( String.format("%,d",i_1));     // 3자리 마다 콤마
		System.out.println( String.format("%,#6.3f",pi));     // 총 6자리에서(소수점 포함) 소수 3자리(#은 공백)
		System.out.println( String.format("%,06.3f",pi));     // 총 6자리에서(소수점 포함) 소수 3자리(0은 빈자리)
		System.out.println("-------------------------------");
		
		
		
		
		System.out.println(String.format( s_2.toLowerCase())  ); //총 자리수 20자리를 앞에 공백 채우기
		System.out.println(String.format( s_1.toLowerCase())  ); //총 자리수 20자리를 앞에 공백 채우기
		System.out.println("-------------------------------");
		
		String s_3 ="   abc     ";
		System.out.println("공백 제거 전 : " + s_3); 			//좌우 공백 제거 하기 전
		System.out.println("공백 제거 후 : " + s_3.trim() );	// 좌우 공백 제거
		System.out.println("-------------------------------");
		
		
		
		System.out.println("문자 추출 : " + s_1.substring(3) );		//네번째부터 출력
		System.out.println("문자 추출 : " + s_1.substring(3, 5) );		//3부터 5 전까지 출력
		System.out.println("-------------------------------");
		
		
		char[] charA = s_2.toCharArray();
		for(int k=0; k<charA.length; k++)
		System.out.printf("[%d] : %s \n", k, charA[k]);
		System.out.println("-------------------------------");
		
		String kor = "한글 입력을 시작 합니다.";
		String[]wordA = kor.split(" +");		//공백이 한개 이상(+) 일 대 공백을 구분으로 추출해서 배열에 넣어라
		for(int k=0; k<wordA.length; k++) 
			System.out.printf( "[%d] : %s \n", k, wordA[k]);
			System.out.println("-------------------------------");
			
			System.out.println(" 알파벳 소문자가 있나?" + s_1.matches("[a-z]") );   //소문자가 한개 있으면 true
			System.out.println(" 알파벳 소문자가 있나?" + s_1.matches("[a-z]+") );   //소문자가 한개 이상 있으면 true
			System.out.println("-------------------------------");
			
			
//			String pw = "123abc";
//			System.out.println( pw.matches("[0-9]") );   //숫자 1개 이상 있으면  false
//			System.out.println( pw.matches("[0-9]+") );   //숫자 1개 이상 있으면  true
			
			String[] strA = { "사바", "웹표준","백엔드","프론트"};
			System.out.println(String.join( ", ", strA) );
			System.out.println(String.join( " - ", strA) );
			System.out.println("-------------------------------");
			
			
			
			//문자열 관련 표현식
			String a1 ="컴퓨터";  //알파벳 A-65 B-66 C-67  한글 : ㄱ ㄴ ㄷ ㄹ ㅁ  숫자 : 1 2 3 4 5
			String a2 ="컴퓨터";
			System.out.println(a1.compareTo(a2) );  //같으면 0
			
			a2 = "학교";
			System.out.println( a1.compareTo(a2) );	//a2 크면 음수
			
			
			a2 = "가자";
			System.out.println( a1.compareTo(a2) );	//a2 작으면 양수
			System.out.println("-------------------------------");
			
			
			String c_1 = "Abc";
			System.out.println(c_1.equals("abc") ); //대소분자 구분해서 다르면 false
			System.out.println(c_1.equalsIgnoreCase("abc") ); //대소분자 구분해서 같으면 true
			System.out.println("-------------------------------");
			
			System.out.println( a1.startsWith("컴") );		//첫 글자가 컴이면 true
			System.out.println( a1.endsWith("컴") );		// 마지막 글자가 터이면 true
			System.out.println("-------------------------------");
			
			String c_2 = "abc123 ? kbs456:sbs777";
			System.out.println(c_2.replace("?","") );   //?를 공백으로 바꿔라
			System.out.println(c_2.replaceAll("[0-9]","") );   //0~9 사이는 숫자는 삭제하라
			System.out.println("-------------------------------");
			
			
			
			String book = "1, 자바 학습,창조 타임, String를 학습합니다.,홍길동";
			String[] tokens = book.split(",");
			
			System.out.println("변호:" + tokens[0]);
			System.out.println("제목:" + tokens[1]);
			System.out.println("내용:"+ tokens[2]);
			System.out.println("상명:"+ tokens[3]);
			System.out.println("-------------------------------");
			
			for(int i=0; i<tokens.length; i++) 
				System.out.printf("\n[%d] : %s",i,tokens[i]);
			System.out.println("-------------------------------");
			
			for(String str : tokens)			//배열 항목 반복문을 위한 향상된 for문
				System.out.println(str);
			
			
			int[] jumsu = { 50,60,70};
			for(int no : jumsu) {
				System.out.println(no);
			}
			System.out.println("-------------------------------");
			
			
			int count =0;
			String[] nameA = {"홍길동","이동수","김철수"};
			int [] nameB = {0,1,2,3};
			for(String str : nameA ){
				count++;
				System.out.printf("%d. %s\n",count,str);
			
			}
			
			
			
			
			
			
			
			
			
			
		
		
		
	}

}
