package ch12api.book.p558;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) {
        Method[] declaredMethods = Service.class.getDeclaredMethod();
        for (Method method : declaredMethods) {
            //printAnnotation 얻기
            PrintAnnoation printAnnoation = method.getAnnotation(PrintAnnotation.class);

            printLine(printAnnoation);

            method.invoke(new Service());

            printLine(printAnnoation);
        }
    }
    public static void printLine(PrintAnnotation printAnnotation) {
        if (printAnnotation != null) {
            int number = printAnnotation.number();
            for (int i = 0; i < number; i++) {
                String value = printAnnotation.value();
                System.out.println(value);
            }
            System.out.println();
        }
    }
}
