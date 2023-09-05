package Ch16lambda.book.p716.moonje5;

public class Example {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(() ->
            System.out.println("Ok 버튼을 클릭했습니다"));
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(()->
                System.out.println("cancel 버튼을 클릭했습니다"));
        btnCancel.click();
    }
}
