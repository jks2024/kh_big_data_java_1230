package 영화표예매;

import java.util.Scanner;

// 영화표 예매하기 클래스를 만들고 객체 생성
// 극장의 좌석은 10개 (10개의 좌석 예약 상태를 기록하기 위한 배열 필요)
// 좌석당 가격은 12000원
// 메뉴는 예약하기와 종료로 구성
// 예약하기에서는 현재 좌석의 예약 상태를 보여 주고 예약을 받음
// 종료는 판매된 좌석의 개수를 확인해서 판매 금액을 구함 (3 * 12000 = 36000)
public class MovieMain {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        Scanner sc = new Scanner(System.in);
        int selMenu;
        while(true) { // 예약은 종료하기를 누르기 전까지는 계속 진행해야 함.
            System.out.println("[1]예매하기");
            System.out.println("[2]종료");
            selMenu = sc.nextInt(); // 메뉴 선택에 대한 값을 입력 받음
            if(selMenu == 1) movieTicket.selectSeat(); // 좌석 예약하기에 대한 메소드 호출
            else {
                System.out.println("판매금액 : " + movieTicket.totalAmount()); // 종료하기 선택 시 판매 금액 계산
                break; // 종료를 위해서 반복문 탈출
            }
        }

    }
}
