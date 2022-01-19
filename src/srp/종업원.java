package srp;

// 종업원 - 요리사 (의존성)
public class 종업원 {

    // 주석!!
    public 음식 주문받기(요리사 chef) {
        음식 jjajang = chef.음식생성();
        return jjajang; // null 아무것도 없음.
    }

}
