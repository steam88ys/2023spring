public class MainClass {
    public static void main(String[] args) {
        HelloworldKr hello1 = new HelloworldKr();
        callMethod(hello1);

    }
    static void callMethod(HelloworldKr hello) {
        hello.sayHello();
    }

}
