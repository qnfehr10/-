

package Day01; // 패키지명 [소스파일들의 폴더]

public class Day01_1 { // class의 시작
	
	// public : 접근제한자 -> 전범위
		// class : 클래스 선언
			// Day01_1 : 클래스 이름
		// * 모든 곳에서 사용하는 Day01_1 이라는 이름을 갖는 클래스 선언
			// { : 시작        } : 끝
	
	// 1. class 안에서 코드 작성한다. [ class 밖에서 작성 불가]
		// 1. 자바 100% 객체지향 [ 클래스 -> 객체 ]
	// 2. 실행코드 main함수
		// 1. main 입력후
		// 2. ctrl 누른상태에서 스페이스바 -> 엔터
	public static void main(String[] args) {
		// public : 접근제한자 -> 전범위
			// static : 정적
				// void : 반환타입[돌려주는 값] 없다
					// main 함수 : 메인 스레드를 가지고 있는 함수[필수]
					// 스레드 : 코드를 읽어주는 흐름, 역할
		
		// * main함수 {} 안에 작성된 코드는 실행된다.
		
		// syso -> ctrl+스페이스바 : 출력 자동완성
		System.out.println("Java 출력"); // 고급언어 [ 사람이 이해하는 언어 ]
		// 컴파일[ ctrl+F11 ]
			// 저장 [ ctrl+s ]
		
	} // main end
	
} // class의 끝
