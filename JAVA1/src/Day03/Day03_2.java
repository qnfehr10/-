package Day03; //패키지명

import java.util.Scanner;

public class Day03_2 { // c s

	public static void main(String[] args) { // m s
		
		// 입력객체 = { } 당 1번 사용
		Scanner sc = new Scanner(System.in);
		
		// 문제1 : 2개의 정수를 입력받아서 더 큰 수를 출력
		System.out.println("정수1입력: ");
		int 정수1 = sc.nextInt();
			// int형 변수 선언 하고 입력받은 값을 정수로 가져와서 대입
		System.out.println("정수2입력: ");
		int 정수2 = sc.nextInt();
		
		// 제어
		if( 정수1 > 정수2 ) System.out.println(" 더 큰수 : " + 정수1 );
		// 만약에 입력받은 값이 트루이면 정수1을 출력 아니면 아래로
		else if ( 정수1 < 정수2 ) System.out.println(" 더 큰수 : " + 정수2);
		// 입력받은 값이 트루이면 정수2를 출력 아니면 아래로
		else System.out.println(" 같다 ");
		// 위의 모든 조건이 부합됫다면 실행
		
		// 문제2 : 3개의 정수를 입력받아서 가장 큰 수 출력
		System.out.println("정수1입력: ");
		int 정수3 = sc.nextInt(); // 변수명 중복x
		System.out.println("정수1입력: ");
		int 정수4 = sc.nextInt();
		System.out.println("정수1입력: ");
		int 정수5 = sc.nextInt();
		int max = 정수3; //가장 큰수를 저장하는 변수의 저장공간
			// max에 첫번째 값 넣어두기
		if( max < 정수4 ) { max = 정수4; }
			// 만약에 max 보다 정수4가 더 크면 교체
		if( max < 정수5 ) { max = 정수5; }
		System.out.println(" 가장 큰수 : " + max );
		
		// 문제 3 : 4개의 정수를 입력받아서 가장 큰 수 출력
		System.out.println("정수1입력: ");
		int 정수6 = sc.nextInt(); // 변수명 중복x
		System.out.println("정수1입력: ");
		int 정수7 = sc.nextInt();
		System.out.println("정수1입력: ");
		int 정수8 = sc.nextInt();
		System.out.println("정수1입력: ");
		int 정수9 = sc.nextInt();
		int max2 = 정수6;
		if( max < 정수7 ) { max = 정수7; }
		if( max < 정수8 ) { max = 정수8; }
		if( max < 정수9 ) { max = 정수9; }
		System.out.println(" 가장 큰수 : " + max2 );
		
		// 문제 4 : 3개의 정수를 입력받아서 오름차순
		System.out.println("정수1입력: ");
		int 정수10 = sc.nextInt(); // 변수명 중복x
		System.out.println("정수1입력: ");
		int 정수11 = sc.nextInt();
		System.out.println("정수1입력: ");
		int 정수12 = sc.nextInt();
		
		if( 정수10 > 정수11 ) {		// > : 오름차순	< : 내림차순
			// 교체[ 스왑 = 두개의 변수의 값 교체 ]
			int temp = 정수10; // 임시변수 = 변수1;
			정수10 = 정수11; // 변수1 = 변수2;
			정수11 = temp; // 변수2 = 임시변수;
		}
		if( 정수10 > 정수12 ) { int temp = 정수10; 정수10 = 정수12; 정수12 = temp; }
		if( 정수11 > 정수12 ) { int temp = 정수11; 정수11 = 정수12; 정수12 = temp; }
		System.out.printf(" 입력한 값 오름차순 : %d %d %d ", 정수10, 정수11, 정수12);
		// System.out.println(" 입력한 값 오름차순 : " + 정수10 + 정수11 + 정수12 );
		
		// 문제 5 : 4개의 정수를 입력받아서 오름차순 
		System.out.println("정수1입력: ");
		int 정수13 = sc.nextInt(); // 변수명 중복x
		System.out.println("정수1입력: ");
		int 정수14 = sc.nextInt();
		System.out.println("정수1입력: ");
		int 정수15 = sc.nextInt();
		System.out.println("정수1입력: ");
		int 정수16 = sc.nextInt();
		
		// 첫번째 값 기준 으로 비교
		if( 정수13 > 정수14 ) { int temp = 정수13 ; 정수13 = 정수14; 정수14 = temp; }
		if( 정수13 > 정수15 ) { int temp = 정수13 ; 정수13 = 정수15; 정수15 = temp; }
		if( 정수13 > 정수16 ) { int temp = 정수13 ; 정수13 = 정수16; 정수16 = temp; }
		// 두번째 값 기준 으로 비교
		if( 정수14 > 정수15 ) { int temp = 정수14 ; 정수14 = 정수15; 정수15 = temp; }
		if( 정수14 > 정수16 ) { int temp = 정수14 ; 정수14 = 정수16; 정수16 = temp; }
		// 세번째 값 기준 으로 비교
		if( 정수15 > 정수16 ) { int temp = 정수15 ; 정수15 = 정수16; 정수16 = temp; }
		// 네번째 값 기준 으로 비교 x
			System.out.printf(" 오름차순 : %d %d %d %d ", 정수13, 정수14, 정수15, 정수16 );
			
	} // m e

} // c e
