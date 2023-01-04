package 제일큰값찾기;
import java.util.Scanner;
// 세자리의 정수를 입력 받아서 100자리, 10자리, 1자리로 나누어 담고 이중 가장 큰 수 찾기
public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 정수를 입력 받기 위해 스캐너 객체 생성
        System.out.print("세자리 정수를 입력 하세요 : ");
        int number = sc.nextInt(); // 키보드로 부터 입력 받은 값을 변수에 담음
        int a = number / 100; // 100으로 나눈 몫을 넣어 줌
        int b = (number % 100) / 10; // 100으로 나눈 나머지를 구하고, 다시 10으로 나눈 몫을 널어 줌
        int c = number % 10; // 10올 나눈 나머지를 넣어 줌
        if(a > b) {
            System.out.println(Math.max(a,c));
        } else {
            System.out.println(Math.max(b,c));
        }
    }
}
