package ch11exception.lecture;

public class C10catch {
    public static void main(String[] args) {
        try {
            //exception
        } catch (ArrayIndexOutOfBoundsException e) {
            // exception 처리코드
        } catch (NumberFormatException e) {
            // exception 처리코드
        }

        try {

        } catch (NumberFormatException | ClassCastException exception) {
            // exception 처리코드
        }
    }
}
