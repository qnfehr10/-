package Day03;

import java.util.Scanner;

public class Day03_7 {

	public static void main(String[] args) {
		
		boolean run = true; // 실행 여부 변수 / true = 실행 false = 종료
		
		int balance = 0; // 예금액[저축금액] 변수
		
		Scanner sc = new Scanner(System.in); // 입력객체
		
		while( run ) { // while( true ) { } : 무한루프
			System.out.println("-----------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("-----------------------");
			System.out.print("선택>");
			int 선택 = sc.nextInt(); // 입력받은 값을 가져오기
			if( 선택 == 1 ) { // 만약에 입력값이 1 이면
				System.out.println(" 예금액 : "); int 예금액 = sc.nextInt();
				// 입력받은 예금액을 통장에 넣기
				balance += 예금액; // balance = balance + 예금액
			}
			else if( 선택 == 2 ) { // 만약에 입력값이 2 이면
				System.out.println(" 출금액 : "); int 출금액 = sc.nextInt();
				// 만약에 출금액이 예금액보다 더 크면 잔액부족
				if( 출금액>balance ) { System.out.println(" 알림) 잔액이 부족합니다."); }
				// 아니면 출금실행
				else { balance -= 출금액; } // 입력받은 출금액을 통장에서 빼기
				}
			
			else if( 선택 == 3 ) { // 만약에 입력값이 3 이면
				System.out.println(" 잔고 : " + balance);
			}
			else if( 선택 == 4 ) { // 만약에 입력값이 4 이면
				break; // while 탈출 [ 무한루프 종료 ]
			}else { // 그외
				System.out.println(" 알림) 알수 없는 번호 입니다.");
			}
		} // w e
		
		System.out.println("프로그램 종료");
	} // m e

} // c e
