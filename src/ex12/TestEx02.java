package ex12;

interface WindowConnect {
    public abstract void close();
}

// close 이름으로 약속되어 있음.
public class TestEx02 implements WindowConnect {

    @Override
    public void close() {
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

    }
}
