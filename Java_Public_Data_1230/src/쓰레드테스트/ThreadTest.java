package 쓰레드테스트;

public class ThreadTest {
    public static void main(String[] args) {
        Runnable test = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명의 클래스 호출");
            }
        };
        Thread th = new Thread(test);
        th.start();

        Thread test2 = new Thread() {
            @Override
            public void run() {
                System.out.println("익명의 인터페이스로 호출");
            }
        };
        test2.start();
    }
}
