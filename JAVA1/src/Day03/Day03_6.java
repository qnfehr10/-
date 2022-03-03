package Day03;

import java.util.Scanner;

public class Day03_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 별문제1 : 입력받은 수 만큼 * 출력
		System.out.println(" 문제1) 별개수 : "); int s1 = sc.nextInt();
		for( int i = 1 ; i<=s1 ; i++) {
			// * i는 1부터 입력받은 수 까지 1씩 증가
			System.out.print("*");
		}
		
		// 별문제2 : 입력받은 수 만큼 * 출력 [ 단 5개마다 줄바꿈 처리 ]
		System.out.println(" 문제2) 별개수 : "); int s2 = sc.nextInt();
		for( int i = 1 ; i<=s2 ; i++) {
			// * i는 1부터 입력받은 수까지 1씩 증가
			System.out.print("*");
			// 5개마다 줄바꿈 -> 5배수마다
			if( i%5 == 0 ) System.out.println();
		}
		// 별문제3 : 입력받은 줄 수 만큼 출력 
		System.out.println(" 문제3) 줄수 : "); int s3 = sc.nextInt();
		for( int i = 1 ; i<=s3 ; i++) {
			// * i는 1부터 입력받은 줄 수까지 1씩증가
			
			// 1. 별찍기
			for( int s = 1 ; s<=i ; s++ ) {
				System.out.print("*");
			}
			// 2. 줄바꿈처리
			System.out.println();
		}
			// 순서도
				// 예시 사용자가 3을 입력했을때
				// i = 1	i<=3 [true] -> i++
					// s = 1	1<=1 [true] -> * -> s++
					// s = 2	2<=1 [fasle] -> 반복문종료
				// 줄바꿈
				// i = 2	i<=3 [true]
					// s = 1	s<=2 [true] -> * -> s++
					// s = 2	s<=2 [true] -> * -> s++
					// s = 3	s<=2 [false] -> 반복문종료
				//줄바꿈
				// i = 3 i<=3 [true]
					// s = 1	s<=3 [true] -> * -> s++
					// s = 2	s<=3 [true] -> * -> s++
					// s = 3	s<=3 [true] -> * -> s++
					// s = 4	s<=3 [false] -> 반복문종료
				//줄바꿈
		
		// 별문제 4 줄어드는 별
		System.out.println(" 문제4) 줄수 : "); int s4 = sc.nextInt();
		for( int i = 1 ; i<=s4 ; i++) {
			for( int s = 1 ; s<=s4-i+1 ; s++ ) {
			System.out.print("*");
			}
			System.out.println();
		}
		// 별문제 5 공백이 지워지는 별
		System.out.println(" 문제5) 줄수 : "); int s5 = sc.nextInt();
		for( int i = 1 ; i<=s5 ; i++ ) {
			// 공백찍기
			for( int b = 1 ; b<=s5-i ; b++) {
				System.out.print(" "); // 공백
			}
			// 별찍기
				for( int s = 1 ; s<=i ; s++) {
				System.out.print("*");
			}
			// 줄맞춤
				System.out.println();
		}
		// 별문제 6 공백이 생겨나는 별
		System.out.println(" 문제6) 줄수 : "); int s6 = sc.nextInt();
		for( int i = 1 ; i<=s5 ; i++ ) {
			for( int b = 1 ; b<=i-1 ; b++ ) {
				System.out.print(" ");
			}
			for( int s = 1 ; s<=s6-i+1 ; s++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
		// 문제 7 ~ 8
		System.out.println(" 문제7) 줄수 : "); int s7 = sc.nextInt();
		for( int i = 1 ; i<=s7 ; i++ ) {
			for( int b = 1 ; b<=s7-i ; b++ ) {
				System.out.print(" ");
			}
			for( int s = 1 ; s<=i*2-1 ; s++ ) {
				System.out.print("*");
				// System.out.print(i); // 문제8
			}
				System.out.println();
		}
		
		
		
		
	}
	
}
