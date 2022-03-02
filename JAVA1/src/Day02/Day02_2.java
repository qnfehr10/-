package Day02; // 패키지명

public class Day02_2 { // c s

	public static void main(String[] args) { // m s
		
		// ; : 실행 단위 구분
		// 동일한 변수명은 사용 할 수 없다. [ 이름이 중복되면 오류(구분불가) ]
		
		// p.40 byte : 1바이트 정수 +-128
		byte var1 = -128;
		System.out.println(var1);
		
		byte var2 = -30;
		System.out.println(var2);
		
		byte var3 = 30;
		System.out.println(var3);
		
		// byte 사용시 오류발생 128을 넘어가기 때문
		Short var4 = 300;
		System.out.println(var4);
		
		byte var5 = 'j';
		System.out.println(var5);
			// byte = 문자 -> 정수 변환 [ 아스키코드 규칙 ]
		
		// p.43 char : 2바이트 [ 1문자 저장 ] : 유니코드(java기반) vs 아스키코드(c기반)
		// 유니코드(2바이트 전세계 기반 공용어)
		char c1 = 'a';
		System.out.println( c1 );
		char c2 = 97;
		System.out.println( c2 );
			// char = 정수 -> 문자 변환		// 10진수 표현 : 0~9
		char c3 = '\u0041';
		System.out.println( c3 );		// 16진수 표현
		char c4 = '가';
		System.out.println( c4 );
		char c5 = 44032;
		System.out.println( c5 );
		char c6 = '\uac00';
		System.out.println( c6 );
		// 진법 쓰는 이유 [ 컴퓨터가 2진수만 사용하면 표현단위가 적기때문 -> 표현단위 다양성을 위해 ]
			// 2진수 : 0 , 1		/기계어(2진코드) / 용량 1비트
			// 8진수 : 0 ~ 7
			// 10진수 : 0 ~ 9
			// 16진수 : 0 ~ 9 a b c d e f
		
		// p.44 short : 2바이트 정수 +-3만정도
		short num1 = 30000;
		System.out.println( num1 );
		/*short num2 = 40000;  *오류 발생*
		System.out.println( num2 );
		*/
		
		// p.45 int : 4바이트 정수 +-20억정도 ( 정수의 기본타입 )
		int num2 = 10;
		System.out.println( num2 ); // 10진수
		int num3 = 012;
		System.out.println( num3 ); // 8진수는 앞에 0 붙히기
		int num4 = 0xA;
		System.out.println( num4 ); // 16진수는 앞에 0x 붙히기
		
		// p.46 long : 8바이트 정수 +- 20억 이상 [ 데이터 뒤에 L ]
		long num5 = 10000000000L; // L표기시 INT형 -> long 형
		System.out.println( num5 );
		
		// p.47~48 float[ 데이터뒤에 f ] : 4바이트 : 소수점 8자리 표현 / double(실수 기본타입) : 8바이트 : 소수점 17자리 표현
		double num6 = 3.14;
		System.out.println( num6 );
		
		float num7 = 3.14f;
		System.out.println( num7 );
		
		double num8 = 0.123456789012345678911111111;
		System.out.println( num8 );
		
		float num9 = 0.1234567890123456789f;
		System.out.println( num9 );
		
		// p.48 boolean : 1비트 [ true 혹은 false ]
			// boolean = 스위치 역할 : on, off / true, false
		boolean bo1 = true;
		System.out.println( bo1 );
		
		// p.49 : 타입변환
			//			------->>>>>>>>---------자동형변환 방향-------->>>>>
			// * 크기순서 : byte -> short -> int -> long -> float -> double
			//          -------<<<<<<<<---------강제형변환 방향--------<<<<<
		
			// 1. 자동 형변환 : 
				//작은 상자에서 큰상자로 이동 가능
				//큰상자에서 작은 상자로 이동 불가
			
			byte 바이트 = 10;
			int 인트 = 바이트; // 자동 형변환 o
			// short 쇼트 = 인트; 자동 형변환 x 오류 발생
			// 2. 강제 형변환 ( 캐스트 )
				//큰상자에서 작은 상자로 이동 가능 단, 데이터에 손실 있음
				// (변경할 자료형)변수명
			short 쇼트 = (short)인트; // int형 변수를 short로 변환 단, 데이터 잘림
		
	} // m e

} // c e
