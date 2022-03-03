package Day03;

import java.util.Scanner;

public class Day03_4 {

	public static void main(String[] args) {
		
		// 제어문 : 1. if 2. switch문
			// if : 논리검사( true 혹은 false ) / 경우의수 정해져 있지 않는경우
				// >= <= > < == !=
			// switch : 데이터검사(선택조건)			/ 경우의 수 정해져 있는 경우
				// 동일한 case 이면 실행문처리 후 -> 다음 case 이동
			// 형태
				// switch( 검사대상 ) {
				//		case '값' : 실행문;
				//		case '값' : 실행문;
				//		case '값' : 실행문;
				//		default : 실행문;
				// }
		
			//break
		
		// 예1) 점수가 90점 이면 A 80점이면 B 70점이면 C 그 외 탈락
		int 점수 = 80;
		//---------------------------------------------
		if( 점수 == 90 ) System.out.println("A");
		else if( 점수 == 80) System.out.println("B");
		else if( 점수 == 70) System.out.println("C");
		else System.out.println("탈락");
		
		System.out.println("---------------------");
		
		switch( 점수 ) {
		case 90 : System.out.println("A");	 break;
		case 80 : System.out.println("B");	 break;
		case 70 : System.out.println("C");	 break;
		default : System.out.println("탈락");	 break;
		}
		
		
		// 예2)
		int 버튼 = 3;
		switch( 버튼 ) {
			case 1 : System.out.println("1층으로 이동"); break;
			case 2 : System.out.println("2층으로 이동"); break;
			case 3 : System.out.println("3층으로 이동"); break;
			case 4 : System.out.println("4층으로 이동"); break;
			default : System.out.println("정지");
		}
		
		// 예3)
		char 등급 = 'A';
		switch( 등급 ) {
		case 'A' : // System.out.println("우수 회원");
		case 'B' : System.out.println("우수 회원"); break;
		case 'C' : // System.out.println("일반 회원");
		case 'D' : System.out.println("일반 회원"); break;
		default :  System.out.println("손님");
		}
		// 예4)
		String 직급 = "과장";
		switch( 직급 ) { // 선택조건이기 때문에 .equals 사용 x
			case "부장" : System.out.println("700만원");	break;
			case "과장" : System.out.println("500만원");	break;
			default : System.out.println("300만원");		
		}
		
		// 문제1 ) if 사용 x 국영수 점수를 입력받아 평균이 90점 이상이면 A등급 80점 이상이면 B등급 나머지 탈락
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 :"); int 국어 = sc.nextInt();
		System.out.println("영어 :"); int 영어 = sc.nextInt();
		System.out.println("수학 :"); int 수학 = sc.nextInt();
		
		int 평균 = (국어+영어+수학)/3;
		System.out.println(" 평균 :" + 평균 + " 나누기/10 " + 평균/10 );
		switch( 평균/10 ) { // 1자리 제외
			case 9 : System.out.println("A등급");		break;
			case 8 : System.out.println("B등급");		break;
			default : System.out.println("탈락");		
		}

				
				

	}

}
