package 반복문ForEx1;
import java.util.Scanner;
// for 반복문 : for(초기식;조건식;증감식) { 반복 수행 구간}
public class ForEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int number = sc.nextInt();
        int result = recursiveFunc(number);
        System.out.println(result);

    }
    public static int recursiveFunc(int n) {
        if(n == 1) return 1;
        return n + recursiveFunc(n - 1);
    }
}
