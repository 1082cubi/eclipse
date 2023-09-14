package ch11exception.lecture;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class C22throws {

    public static void main(String[] args) throws Exception{
        Connection con = DriverManager.getConnection("", "", "");
        var input = new FileImageInputStream(new File(""));
        Class.forName("");

    }
}
