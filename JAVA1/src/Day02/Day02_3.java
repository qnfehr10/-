package Day02;

import java.util.Scanner;

public class Day02_3 {

	public static void main(String[] args) {
		
		// 문제1 : 급여 계산
				/*
				 * 	[입력조건]
				 * 		기본급 , 수당
				 * 	[ 조건 ] 
				 * 		실수령액 = 기본급 + 수당 - 세금[기본급10%] 
				 * 	[출력조건] 
				 * 		실수령액 출력 
				 */
				
				// 문제2 : 지폐 세기 
				/*
				 * [ 입력조건 ] 
				 * 		금액 
				 * [ 조건 ] 
				 * 		십만원 부터 백원 까지의 개수 세기 
				 * [ 출력조건 ]
				 * 		예) 356789 입력시 
				 * 		십만원 3장 
				 * 		만원 5장
				 * 		천원 6장 
				 * 		백원 7개
				 * 
				 */
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("기본급 입력 : ");
		int 기본급 = sc.nextInt();
		System.out.println("수당 입력 : ");
		int 수당 = sc.nextInt();
		int 세금 = (int)(기본급*0.1); // int*double 후에 int 형으로 강제변환 (캐스팅)
		int 실수령액 = 기본급 + 수당 - 세금;
		
		System.out.println("실수령액 = " + 실수령액 );
						//	문자열	+	변수명( 변수내 데이터 호출 )
						// + : 1. 연결연산자 기능 2. 더하기 기능
		*/
		System.out.println("금액을 입력해주세요 : ");
		int 금액 = sc.nextInt();
		int 십만원 = (int)(금액*0.00001);
		int 만원 = (int)(금액*0.0001 - 십만원*10); // 금액*0.0001 - 십만원*10
		int 천원 = (int)(금액*0.001 - (십만원*100 + 만원*10));
		int 백원 = (int)(금액*0.01 - (십만원*1000 + 만원*100 + 천원*10));
		System.out.println("십만원권은 " + 십만원 + "장 있습니다.");
		System.out.println("만원권은 " + 만원 + "장 있습니다.");
		System.out.println("천원권은 " + 천원 + "장 있습니다.");
		System.out.println("백원은 " + 백원 + "개 있습니다.");
		
		
	}

}
