package ch13generic.book.p587.mooonje;

public class Container<T> {
    private T field;
    public void set(T p) {
        this.field =p;
    }

    public T get() {
        return field;
    }
}
