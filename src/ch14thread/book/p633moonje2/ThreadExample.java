package ch14thread.book.p633moonje2;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new MovieThread();
        thread1.start();

        Thread thread2 = new Thread(new Music());

                thread2.start();

    }
    }


