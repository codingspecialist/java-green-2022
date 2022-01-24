package ex24;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        // 키보드(소스)와 자바(목적지)에 Stream이 연결된다.
        InputStream s = System.in;

        try {
            int n = s.read();
            System.out.println((char) n);
        } catch (IOException e) {
            System.out.println("에러");
        }

    }
}
