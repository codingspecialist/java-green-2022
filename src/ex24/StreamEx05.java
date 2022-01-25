package ex24;

import java.io.File;
import java.io.FileOutputStream;

public class StreamEx05 {
    public static void main(String[] args) {

        try {
            File file = new File("c:\\test.txt");
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(65);
            fos.close(); // 파일을 닫는다.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
