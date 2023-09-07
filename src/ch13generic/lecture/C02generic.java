package ch13generic.lecture;
//ch13generic
public class C02generic {
    public static void main(String[] args) {
        MyClass02<Object> o1 = new MyClass02<Object>();
        MyClass02<String> o2 = new MyClass02<String>();
        MyClass02<Integer> o3 = new MyClass02<Integer>();
        MyClass02<Boolean> o4 = new MyClass02<Boolean>();
        //MyClass02<int> 05 =new MyClass<int>(); //X

        MyClass02<Object> o6 = new MyClass02<>();
        MyClass02<String> o7 = new MyClass02<>();
        MyClass02<Integer> o8 = new MyClass02<>();
        MyClass02<Boolean> o9 = new MyClass02<>();
    }
}
// generic type

class MyClass02 <T> {
    private Object a;
}
