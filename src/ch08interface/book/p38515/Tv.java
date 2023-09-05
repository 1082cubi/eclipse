package ch08interface.book.p38515;

public class Tv implements Remocon{
    @Override
    public void powerOn() {
        System.out.println("켰ㅅ브니ㅏㄷ");
    }

    public static void main(String[] args) {
        Remocon r = new Tv();
        r.powerOn();
        }
}
