package Day02;

import java.util.Scanner;

public class Day02_5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
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
		 */
		
		/*
		System.out.println("금액을 입력해주세요 : ");
		int 금액 = sc.nextInt();
		System.out.println(" 십만원 : " + (금액/100000) + "장" );
		금액 -= ( 금액/100000 )*100000 ; // 금액에서 십만원 단위 제외
		System.out.println(" 만원 : " + (금액/10000) + "장" );
		금액 -= ( 금액/10000 )*10000 ; // 금액에서 만원 단위 제외
		System.out.println(" 천원 : " + (금액/1000) + "장" );
		금액 -= ( 금액/1000 )*1000 ; // 금액에서 천원 단위 제외
		System.out.println(" 백원 : " + (금액/100) + "장" );
		금액 -= ( 금액/100 )*100 ; // 금액에서 백원 단위 제외
		*/
		
		
		//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
			
//			System.out.println("3번 7의 배수를 입력해 주세요 : ");
//			int i3 = sc.nextInt();
//			System.out.println(i3%7 == 0);
//		
//		//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
//			// 홀짝 찾기
//				// 홀수 : 값 % 2 했을때 나머지가 1 이면 값은 홀수
//				// 짝수 : 값 % 2 했들때 나머지가 0 이면 값은 짝수
//			
//			System.out.println("4번 홀수를 입력해 주세요 : ");
//			int i4 = sc.nextInt();
//			System.out.println(i4%2 != 0); // System.out.println(i4%2 == 1);
//		
//		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
//			
//			System.out.println("5번 7의 배수 이면서 짝수인 수를 입력해 주세요 : ");
//			int i5 = sc.nextInt();
//			System.out.println(i5%7 == 0 && i5%2 == 0);
//		
//		//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
//			
//			System.out.println("6번 두개의 정수를 입력해주세요 : ");
//			int i6_1 = sc.nextInt();
//			int i6_2 = sc.nextInt();
//			
//			int 큰수 = i6_1 > i6_2 ? i6_1 : i6_2;
//			System.out.println("왼쪽이 더 큰가? : " + (i6_1 > i6_2) );
//		
//		//문제7 : 반지름을 입력받아 원 넓이 출력하기 
//				// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
//			
//			System.out.println("7번 반지름을 입력해주세요 : ");
//			int i7 = sc.nextInt();
//			System.out.println("원의 넓이는 : " + (i7 * i7 * 3.14) + " 입니다." );
//		
//		//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
//				// 예) 54.5   84.3 이면    64.285714%
//			
//			System.out.println("8번 두 실수를 입력해주세요 : ");
//			double i8_1 = sc.nextDouble();
//			double i8_2 = sc.nextDouble();
//			double 비율 = (i8_1/i8_2)*100;
//			System.out.println("앞 실수의 값이 뒤의 값의 " + 비율 + "%");
//			System.out.printf(" 백분율 : %.2f %%%n ", 비율);
//		
//		//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
//				//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
//			
//			System.out.println("9번 사다리꼴의 윗변과 밑변 높이를 입력해주세요 : ");
//			double i9_1 = sc.nextDouble();
//			double i9_2 = sc.nextDouble();
//			double i9_3 = sc.nextDouble();
//			System.out.println("사다리꼴의 넓이는 = " + ((i9_1*i9_2) * i9_3/2 ));
//			
//		//문제10: 키를 정수를 입력받아 표준체중 출력하기
//				//표준체중 계산식 = > (키 - 100) * 0.9
//			
//			System.out.println("10번 키를 적어주세요 : ");
//			int i10 = sc.nextInt();
//			System.out.println("표준체중 = " + ((i10 - 100)*0.9));
//		
		//문제11: 키와 몸무게를 입력받아 BMI 출력하기
				//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
			
			System.out.println("11번 키와 몸무게를 입력해주세요 : ");
			int i11_1 = sc.nextInt();
			int i11_2 = sc.nextInt();
			System.out.println("BMI : " + (i11_2/((i11_1/100)*(i11_1/100))));
		
		//문제12: inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ] 
			
			System.out.println("12번 inch를 입력해주세요 : ");
			int i12 = sc.nextInt();
			System.out.println("입력해 주신 값은 " + i12*2.54 + " cm 입니다.");
		
		//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
				//소수 둘째 자리 까지 점수 출력하기
				//중간고사 반영비율 => 30 %
				//기말고사 반영비율 => 30 %
				//수행평가 반영비율 => 40 %
			
			
			System.out.println("13번 중간, 기말, 수행평가 점수를 입력해주세요 : ");
			double i13_1 = sc.nextDouble();
			double i13_2 = sc.nextDouble();
			double i13_3 = sc.nextDouble();
			double 중간비율 = i13_1*0.3; 
			double 기말비율 = i13_2*0.3;
			double 수행비율 = i13_3*0.3;
			
			System.out.printf("중간고사 반영비율 %.2f%n ", 중간비율);
			System.out.printf("기말고사 반영비율 %.2f%n ", 기말비율);
			System.out.printf("수행평가 반영비율 %.2f%n ", 수행비율);
			
			//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
		 	//int x = 10;
			//int y = x-- + 5 + --x;
			//printf(" x의 값 : %d , y의값 :  %d ", x, y)
			
			System.out.println("14번 연산 순서 나열");
			int x = 10;
			int y = x-- + 5 + --x;
			System.out.printf(" x의 값 : %d , y의값 : %d%n ", x, y);
		
		//문제15 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
			
			System.out.println("15번 나이를 입력해주세요 : ");
			int i15 = sc.nextInt();
			String 나이 = i15 >=40 ? "중년" : i15 >= 20 ? "성인" : i15 >=10 ? "학생" : "해당없음";
			System.out.println("당신은 : " + 나이 + " 입니다.");
		
		//문제16 : 3개의 정수를 입력받아 오름차순으로 정렬 
		
		//문제17 : 4개의 정수를 입력받아 내림차순으로 정렬 
		
		// p. 102 확인문제
		
	}

}








