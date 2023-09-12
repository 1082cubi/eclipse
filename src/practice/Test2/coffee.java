package practice.Test2;

public class coffee {
    public int[] solution(int money) {

        int num =0;
        int num1 =0;
        int A =5500;


                num1 = money % A;
                num = money - A*num1;

            int [] answer = {num1,num};

        return answer;

    }
}
