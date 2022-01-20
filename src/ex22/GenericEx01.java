package ex22;

class 사과 {
    String name = "사과";
}

class 딸기 {
    String name = "딸기";
}

class ResponseBox<T> {
    T data;

    public ResponseBox(T data) {
        this.data = data;
    }
}

public class GenericEx01 {
    public static void main(String[] args) {
        ResponseBox<사과> rb1 = new ResponseBox<사과>(new 사과());
        System.out.println(rb1.data.name);
        // rb1 응답!!
        ResponseBox<딸기> rb2 = new ResponseBox<딸기>(new 딸기());
        // rb2 응답!!
    }
}
