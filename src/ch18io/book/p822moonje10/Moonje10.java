package ch18io.book.p822moonje10;

import java.io.FileOutputStream;
import java.io.*;

public class Moonje10 {
    public static void main(String[] args) throws Exception {
        String path = "C:/Temp/test/photo1.jfif";
        String copy = "C:/Temp/test/photo2.jfif";

        FileInputStream in =new FileInputStream(path);
        BufferedInputStream buf = new BufferedInputStream(in);
        FileOutputStream os = new FileOutputStream(copy);
        BufferedOutputStream osw = new BufferedOutputStream(os);
//        System.out.printf("exists() = " + exists());

        char[] data = new char[1000];
        int len= 0;
//        buf.read(data);

    }
}
