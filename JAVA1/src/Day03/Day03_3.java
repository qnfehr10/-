package Day03;

import java.util.Scanner;

public class Day03_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int score = sc.nextInt();
//		
//		//문제6
//		// 점수를 입력받아 점수 90 이상이면 합경 아니면 불합격
//		if(score>=90) {
//			System.out.println("합격");
//		}else
//			System.out.println("불합격");
//		//문제7
//		// 점수를 입력받아 90점 이상이면 A 80은 B 70은 C 그 외 재시험
//		if(score>=90) {
//			System.out.println("A");
//		}else if(score>=80) {
//			System.out.println("B");
//		}else if(score>=70) {
//			System.out.println("C");
//		}else
//			System.out.println("재시험");
		//문제8 로그인페이지
				// [ 입력 ] : 아이디와 비밀번호를 입력받기
				// [ 조건 ] : 회원아이디가 admin 이고 
				//           비밀번호가 1234 일 경우에는 
				//          로그인 성공 아니면 로그인 실패 출력
		System.out.println("아이디와 비밀번호를 입력해주세요");
		System.out.println("아이디 : ");
		String id = sc.next();
		System.out.println("비밀번호 : ");
		int pw = sc.nextInt();
			// 객체는 연산불가
				// 자료형 사용하는 변수는 연산자 사용 가능
				// 클래스 사용하는 객체는 연산자 사용 불가 -> 메소드
					// 문자열 비교시 .equals
					// 문자열1.equals( 문자열2 )
		boolean 로그인성공 = false;
			// boolean : 1비트 true or false 저장
		if( id.equals("admin") ) { // id 는 클래스 객체이기 때문에 == 불가능 // 객체비교시에는 .equals() 사용
			// 입력한 id가 admin 이면
			if( pw == 1234) { // pw 는 자료형변수이기 때문에 == 가능
				// 입력한 pw가 1234 이면
			System.out.println("로그인 성공");
			로그인성공 = true; // id, pw 가 모두 동일하면 변수값 변경
			}else { // 입력한 pw 1234 아니면 출력
				System.out.println("비밀번호가 틀렸습니다."); }
		}else { // 입력한 id가 admin이 아니면
			System.out.println("아이디가 틀렸습니다.");
		}if( 로그인성공 == false )
		System.out.println("로그인 실패");
			// 로그인 성공 변수가 false 이면 출력
		
//		System.out.println("아이디와 비밀번호를 입력해주세요");
//		String id = sc.next();
//		int pw = sc.nextInt();
//		
//		if(id.equals("admin")) {
//			if(pw == 1234) {
//				System.out.println("로그인 성공");
//			}else {
//					System.out.println("비밀번호가 틀렸습니다.");
//			 }
//		}
//			else 
//				System.out.println("아이디가 틀렸습니다.");
		
		//문제9 영어
			// [ 입력 ] : 국영수 입력받기
			// [ 조건 ] : 평균 90점 이상이면서 국어점수 >= 90점
		
		System.out.println("국어점수 : "); int 국어 = sc.nextInt();
		System.out.println("영어점수 : "); int 영어 = sc.nextInt();
		System.out.println("수학점수 : "); int 수학 = sc.nextInt();
		int 평균 = (국어+영어+수학)/3;
		if( 평균>=90 ) { //평균 90점 이상이면
			
			// if 중첩
			if( 국어 == 100 ) System.out.println("국어우수");
			if( 영어 == 100 ) System.out.println("영어우수");
			if( 수학 == 100 ) System.out.println("수학우수");
			
		}else if( 평균>=80 ) { // 평균 80점 이상이면
			if( 국어 >= 90 ) System.out.println("국어장려");
			if( 영어 >= 90 ) System.out.println("영어장려");
			if( 수학 >= 90 ) System.out.println("수학장려");
			
		}else { // 그 외 이면
			System.out.println("재시험");
		}
		
			
		
	}

}
