package practice;
class TimeTest {
    private int hour;
    private int minute;
    private int second;
    public void setHour(int hour){
    if(hour < 0 || hour > 23)
        return;
        this.hour = hour;
    }
    public int getHour() {
        return hour;
    }
}
public class Time {
    public static void main(String[] args) {
        TimeTest t = new TimeTest();
        t.hour = 100;
        System.out.println(t.hour);

    }
}
