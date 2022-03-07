package Day05;

import java.util.Scanner;

public class Day05_3 {

	public static void main(String[] args) {
		
		// p.181
			// 1.
			// 2.
			// 3. 2 : 객체 비교시 equals 메소드 사용
			// 4. 2 : 길이가 없을경우 값 대입 불가
			// 5. 3 : bolean 초기값은 false
			// 6. 3, 5
			//		{ 1행 } , { 2행 } , { 3행 } => 3
			//		{ 78 83 93 87 88 } =>5
			// 7. 
		
		int max = 0; ; // 최댓값 저장하는 변수
		int[] array = { 1, 5, 3, 8, 2}; // 선언+초기값 선언
		
		for( int i=0; i<array.length; i++) {
			// *i는 0 부터 배열의 길이까지 1씩 증가 실행 반복처리
			if( max<array[i] ) max = array[i];
			// *만약에 max보다 i번째 인덱스의 값이 더 크면 max에 i번째 값 대입
		}
		
		System.out.println("max : "+max);
		
			// 8.
		int[][] array2 = {
				{ 95 , 86 } ,
				{ 83 , 92 , 96 } ,
				{ 78 , 83 , 93 , 87 , 88 } };
		
		int sum = 0; // 합계
		double avg = 0.0; // 평균
		
		int count = 0; // 점수의 개수 [ 칸 개수 ]
		
		// 풀이
		for( int y = 0; y<array2.length; y++) {
				// * 행은 0부터 배열의 행길이[3]미만까지 1씩증가
			for( int x=0; x<array2[y].length; x++) {
				// *열은 0부터 배열의 열길이[ 2 , 3 , 5 ]미만까지 1씩증가
				sum += array2[y][x];
			}
			
			count += array2[y].length; // 열길이의 누적합계
			
		}
		
		avg = (double)sum / count;
		
		System.out.println(" sume : "+sum);
		System.out.println(" avg : "+avg);
		
		// 9.
		boolean run = true; // while문 스위치 변수
		int studentNum = 0; // 학생수 변수
		int[] scores = null;//점수 배열
		Scanner sc = new Scanner(System.in); // 입력객체
		
		// while( true ) {}
		while( run ) { // 무한루프 [ 종료조건 : 5번 입력시 종료 ]
			
			System.out.println("-------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택 : ");
			
			int selectno = sc.nextInt();
			
			if( selectno ==1 ) { // 학생 수 입력받기
				System.out.println("학생수>"); studentNum = sc.nextInt();
				// 입력받은 학생 수 만큼 배열길이 변경
				scores = new int[studentNum];
			}
			else if( selectno ==2 ) { // 학생 점수 입력받기
				for( int i = 0 ; i<scores.length; i++) { // 배열 내 모든 인덱스만큼 반복처리
					System.out.printf(" scores[%d] :\n", i); 
					scores[i] = sc.nextInt(); // 입력받아 i번째 인덱스에 저장
				}
			}
			else if( selectno ==3 ) { // 학생 점수 출력하기
				for( int i = 0 ; i<scores.length; i++) {
					System.out.printf(" scores[%d] : %d \n", i, scores[i]);
				}
			}
			else if( selectno ==4 ) {
				int 최고점수 = 0;
				int 총합계 = 0;
				double 평균점수 = 0.0;
				
				for( int i=0; i<scores.length; i++) {
					
					// 최고점수 구하기
					if( 최고점수 < scores[i] ) 최고점수 = scores[i]; // i번째 인덱스에 데이터 대입
					// 누적합계
					총합계 += scores[i];
				}
				
				// 평균점수 구하기
				평균점수 = (double)총합계 / scores.length;
				
				System.out.println("최고 점수 : "+최고점수);
				System.out.println("평균 점수 : "+평균점수);
			}
			else if( selectno ==5 ) {
				// break; // 반복문 탈출 while가 하나면 종료 둘중하나 모두 종료가능
				run = false; // 반복문 종료
			}
			
			
			
		} //while end

	} // m e

}
