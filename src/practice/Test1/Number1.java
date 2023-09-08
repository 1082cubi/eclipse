package practice.Test1;

class Number1 {
    public int solution(int n, int k) {
        int answer = 0;
        int A = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 0) {
                A += i;
            }
        }
        answer = (n * 12000) + (k * 2000) - (A * 2000);
        return answer;
    }
}


