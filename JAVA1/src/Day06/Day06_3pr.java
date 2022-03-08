package Day06;

import java.util.Scanner;

public class Day06_3pr {

	public static void main(String[] args) {
		
		// 회원제 프로그램 [ 클래스 ]
		
			// 0. 회원 설계 => 회원 클래스 만들기
				// 1. 필드
					// 1. 아이디 2. 비밀번호 3. 이름 4. 전화번호
		
			// 1. 초기메뉴 [ 1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기 ]
				// 1. 회원가입시 입력받아 저장
				// 2. 로그인시 아이디와 비밀번호가 동일하면 로그인처리
				// 3. 아이디찾기는 이름과 전화번호가 동일하면 아이디 출력
				// 4. 비밀번호찾기는 아이디와 전화번호가 동일하면 비밀번호 출력
		
		// 위에 선언하는 이유 " main 모든곳에서 사용하기 위해
		Scanner sc = new Scanner(System.in);
		Member[] memberlist = new Member[100];
		// Member 클래스로 만들어진 객체(id, pw, name, phone) 100개 저장할 수 있는 배열 선언
		
		// 만약에 클래스가 없었을경우에는
		// String[][] memberlist = new Member[100][4];
		
		while(true) { // 프로그램 실행 무한루프 [ 종료조건:x ]
			
			System.out.println("---------   회원제 [ 클래스버전 ]   ---------");
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기");
			System.out.println("선택 : "); int ch = sc.nextInt();
			
			if( ch==1 ) {// 회원가입
				// 1. id, password, name, phone 입력받기 => 변수4개
				System.out.println("----------- 회원가입 페이지 -----------");
				System.out.println(" 아이디 : ");	String id = sc.next();
				System.out.println(" 비밀번호 : ");	String password = sc.next();
				System.out.println(" 이름 : ");		String name = sc.next();
				System.out.println(" 연락처 : ");	String phone = sc.next();
				// 2. 객체 생성
				Member member = new Member();
				// 3. 입력받은 변수4개를 객체 내 필드에 저장하기
				member.id = id;
				// 객체 내 필드 = 입력받은 값
				member.password = password;
				member.name = name;
				member.phone = phone;
				
				// 4. 여러 객체를 저장하는 배열에 저장하기
					// 1. 공백 인덱스 찾기 [ 공백이 아니면 기존회원에 덮어씌워짐
				int i = 0;
				for( Member temp : memberlist ) {
					// * memberlist 배열 내 member 객체 하나씩 꺼내와서 temp 저장 반복
					// 2. 공백에 인덱스에 객체 저장
					if( temp == null ) { // 만약 해당 객체가 공백이면
						memberlist[i] = member; // 해당 인덱스에 새로 만들어진 객체 저장
						break; // for문 나가기 [ 안나가면 모든 공백에 저장하기때문에 ]
					}
					i++; // 인덱스 증가
				} // for 문 end
			} // 회원가입 end
			else if( ch==2 ) { // 로그인
				
				// 1. 입력받기
				System.out.println("----------- 로그인 페이지 -----------");
				System.out.println(" 아이디 : ");	String loginid = sc.next();
				System.out.println(" 비밀번호 : ");	String loginpassword = sc.next();
				
				// 2. 기존 배열 [ 회원리스트 ] 내 입력받은 값과 비교
				boolean logincheck = false; // true : 로그인성공 false : 로그인실패
				for( Member temp : memberlist ) {
					// * memberlist내 0번 인덱스부터 끝 인덱스까지 하나씩 temp에 대입
					if( temp !=null && temp.id.equals(loginid) &&
							temp.password.equals(loginpassword) ) {
						// * 객체가 null 일때는 equals 불가 [ null 아닌 상태에서만 equals 하자 ]
						System.err.println("알림)) 로그인 성공");
						logincheck = true; // 로그인 성공했다는 표시 남기기
					}
				} // for end
				// 3. 로그인 성공 유무
				if( logincheck == false ) {
					System.out.println("알림)) 동일한 회원정보가 없습니다.");
				}
				
			}
			else if( ch==3 ) {} // 아이디찾기
			else if( ch==4 ) {} // 비밀번호찾기
			else { System.out.println("알림)) 알 수 없는 번호입니다.");} // 그외
			
			
			
		} // 프로그램 실행 while true end
		
	} // m e

} // c e
