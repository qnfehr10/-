package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_5 {

	public static void main(String[] args) {
		
		//로또 판별기
			// 1. 사용자 6개 수 입력받기 -> 배열 저장
				// 1. 1~45 사이 수 만 입력받고 아니면 재입력
				// 2. 중복이면 재입력
			// 2. 추점번호 컴퓨터 난수 6개 발생
				// 1. 1~45 사이
				// 2. 중복x
			// 3. 사용자 추첨번호 와 컴퓨터 추첨번호와 동일 수의 개수
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random(); // 난수객체
		
		// 준비
		int[] 사용자번호 = new int[6]; // 사용자가 선택한 번호 목록
		int[] 추첨번호 = new int[6]; // 컴퓨터의  난수 번호 목록
		
		// 1. 사용자에게 입력받기
		for( int i = 0 ; i<6 ; i++ ) {
			// i는 0부터 5까지 1씩증가반복 => 6회반복
			System.out.println(" 1~45 사이 입력 : ");
			int 번호 = sc.nextInt();
			
			boolean 통과 = true; // 저장 되는 조건 변수
			
			// 조건1 : 유효성검사
			if( 번호 <=0 || 번호>=46 ) {
				System.out.println(" 알림)) 선택할 수 없는 번호 입니다.[재입력] ");
				// 1보다 작거나 45보다 크면 선택할 수 없는 번호입력시 재입력
				i--; // 현재 i는 정상입력x
				통과 = false; // 저장 x
			} // if end
			
			// 조건2 : 중복체크 
				// 1. 배열내 모든 인덱스 호출
				// 2. 입력받은 갑과 같은지 비교
			for( int j = 0 ; j<6 ; j++) {
				if(번호 == 사용자번호[j]) {
					// 2. 입력받은 값과 j번째 인덱스값이 같은지 비교
					System.out.println(" 알림)) 이미 선택한 번호 입니다.[재입력] ");
					i--; // 현재 i는 정상입력x
					통과 = false; // 저장x
				} // if end
			} // for2 end
			
			// 정상입력 이면 배열에 저장하기
			if( 통과 == true ) 사용자번호[i] = 번호;
			
		} // for end
		
		System.out.print("사용자가 선택한 번호 : ");
		// * 사용자 배열 내 모든 인덱스 출력
		for( int temp : 사용자번호 ) {
			System.out.print( temp + " ");
		}
		
		// 2. 컴퓨터가 난수생성
		for( int i=0 ; i<6 ; i++) {
			
			int 추첨= random.nextInt(45)+1; // 난수를 int형으로 가져오기
								// random.nextInt() : +-20억 사이중 난수 발생
								// random.nextInt(수) : 0~수 전까지 사이중 난수 발생
								// random.nextInt(수)+시작번호 : 시작번호 ~ 수 사이중 난수 발생
			// 조건1 : 중복체크
			boolean 통과 = true;
			
			for(int temp : 추첨번호 ) {
				if( 추첨 == temp ) {
					i--; // 중복이 있을경우 현재 i 예외
					통과 = false;
				}
			}
			if( 통과 ) 추첨번호[i] = 추첨;
		}
		
		System.out.print("\n 추첨번호 : ");
		// * 사용자 배열 내 모든 인덱스 출력
		for( int temp : 추첨번호 ) {
			System.out.print( temp + " ");
		}
		
		// 3. 비교 = 총 두 배열간 동일한 수 찾기
			// 3 5 2
			// 8 3 1
				// 3 -> 8	5 -> 8	2 -> 8
				// 3 -> 3	5 -> 3	2 -> 3
				// 3 -> 1	5 -> 1	2 -> 1
		int 동일한수 = 0;
//		for( int i = 0 ; i<사용자번호.length ; i++ ) {
//			// i 비교 기준점
//			for ( int j = 0 ; j<추첨번호.length ; j++ ) {
//				// j 비교 대상
//				if( 사용자번호[i] == 추첨번호[j] ) {
//					// 사용자 배열내 i번째 인덱스와
//					// 컴퓨터 배열내 j번째 인덱스의 수가 동일하면
//					동일한수++;
//				}
//			}
//		}
		
		//방법2
		for( int 비교기준 : 사용자번호 ) {
			// 사용자번호 배열내 하나씩 비교기준 대입
			for( int 비교대상 : 추첨번호 ) {
				// 추첨번호 배열내 하나씩 비교대상 대입
				if( 비교기준 == 비교대상 ) 동일한수++;
			}
		}
		
		System.out.println(" \n동일한 수 : " + 동일한수 );
		

	} // m e

}
