package ch14thread.book.p605;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
        System.out.println("1~100 합:" + sumThread.getSum());
    }
}
