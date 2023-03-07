import java.util.Date;

public class DI_Strong_Weak {
    public static void main(String[] args) {
        Date d = new Date();    // 강한결합
        System.out.println("date: "+d);
    }

    public static void getDate(Date d) {   // 약한결합 (d 주입)
        Date date = d;
        System.out.println("date2: "+date);
    }

    public static void memberUse1() { // 강한결합
        // Member m1 = new Member();
    }

    public static void memberUse2(Member m) { // 약한 결합 (m 주입)
        Member m2 = m;
    }
}

class Member {
    String name;
    String nickName;
    private Member() {}
}