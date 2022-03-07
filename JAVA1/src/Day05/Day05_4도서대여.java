package Day05;

import java.util.Scanner;

public class Day05_4도서대여 {

	public static void main(String[] args) {
		
		//도서 대여 프로그램
		// 1. 배열 변수
			// 1. 회원 [ 아이디(중복x), 비밀번호 ]
			// 2. 도서 [ 도서명(중복x), 도서대여여부(대여가능, 대여중), 대여인(로그인 아이디) ]
		
		// 2. 초기메뉴
			// 1. 회원가입 2. 로그인
		
		// 3. 로그인시 메뉴
			// 1. 도서검색 2. 도서목록 3. 도서대여 4. 도서반납 5.로그아웃(break;)
					// 1. 도서검색시 도서명이 일치하면 도서명과 도서대여여부 출력 아니면 없음
					// 2. 도서목록시 모든 도서명 출력
					// 3. 도서대여시 도서대여여부가 가능할때 도서대여 처리
					// 4. 도서반납시 본인이 대여한 도서만 반납 처리
					// 5. 로그아웃
		
		// 4. 로그인시 아이디가 admin 이면 관리자메뉴
				// 1. 도서등록 2. 도서목록 3. 로그아웃
						// 1. 도서등록시 도서명을 입력받아 도서 등록처리
						// 2. 도서목록시 모든 도서명 출력
						// 3. 도서삭제시 삭제할 도서명을 입력받아 동일한 도서명 삭제[ null ]
						// 4. 로그아웃시 초기메뉴로
		
		// 현재 문제점
		// 
		// 
		//
		
		Scanner sc = new Scanner(System.in);
		
		String[][] member = new String[10][2]; // 일단 열명 0=id 1=pw
		String[][] book = new String[10][2]; // 책 열권 0=도서명[null] 1=대여여부?
		
		while(true) {
			System.out.println("1.회원가입 2.로그인 : "); // 첫 선택창
			int ch1 = sc.nextInt(); // 첫 선택 입력받기 1or2
			
			if( ch1==1 ) {
				System.out.println("-------- 회원가입 페이지 ---------");
				System.out.print(" 사용하실 ID를 입력 : "); 	
				String id = sc.next();
				System.out.print(" 사용하실 PW를 입력 : "); 
				String pw = sc.next();
			
			
				boolean idcheck = true;
				for(int i=0; i<member.length; i++) {
					if( member[i][0] !=null && member[i][0].equals(id) ) {
						System.err.println("이미 사용된 아이디");
						idcheck = false; // 회원가입 불가능
						break;
					} // if 만약 동일한 아이디 있으면
				} // for 동일한 아이디 있는지 반복찾기
				
				if( idcheck ) { // true면 회원가입 
					for( int i=0 ; i<member.length ; i++ ) {
						if( member[i][0] == null ) {
							member[i][0] = id;
							member[i][1] = pw; 
							System.out.println("회원가입이 되었습니다.");
							break;
						} // if 멤버저장
					} // for 멤버저장
				} // if 아이디체크
			} // if ch1 ==1
			else if( ch1==2 ) {
				System.out.print(" ID 입력 : "); 	
				String id = sc.next();
				////////////////////////관리자 아이디일때//////////////////////// 
			boolean run = true; // 작동을 위한 트루값 지정 run
			while(run) {
				if( id.equals("admin")) {// 관리자 아이디가 들어가면 관리자 메뉴창 실행
					
					System.out.println("1.도서등록 2.도서목록 3.로그아웃");
					int adminch = sc.nextInt();
					
					if( adminch==1 ) { // 도서등록 중복은 x
						System.out.println("등록할 도서명을 입력해주세요");
						String bookname = sc.next();
						for( int i=0 ; i<book.length ; i++ ) {
							if( book[i][0] != null && book[i][0].equals(bookname)) { 
								System.out.println("이미 등록된 도서명입니다.");
								break;
							}
							else if( book[i][0] == null) {
								book[i][0] = bookname;
								book[i][1] = "대여가능";
								System.out.println("등록되었습니다.");
								break; // 책 한권 저장후 종료 while문이 필요할것으로 예상
							}
						}
					} // if adminch==1
					else if( adminch==2 ) { // 도서목록 모든 도서명 출력
						for( int j = 0 ; j<book.length ; j++  ) {
							if( book[j][0] != null ) { // 게시물이 없는 인덱스는 제외 
								System.out.printf("%s \n", book[j][0] );
							}
						}
					} // if adminch==2
					else if( adminch==3 ) { // 로그아웃(종료아님) 초기메뉴 화면으로 이동
						break;
					} // if adminch==3
				}else { // 관리자가 아니면 
						/////////////////////////////////////////////////////////////
				System.out.print(" PW 입력 : ");
				String pw = sc.next();
				
				boolean idpwcheck = false; // 아이디 비번 확인
				for( int i=0; i<member.length; i++) {
					if( member[i][0] !=null &&
						member[i][0].equals(id) &&
						member[i][1].equals(pw)) {
						System.out.println("로그인 되었습니다.");
						idpwcheck = true;
						boolean run2 = true;
						while (run2) {
						System.out.println("1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃");
						int ch2 = sc.nextInt(); // 두번째 입력 (로그인성공후 선택지)
						
						// 현재 미완성 관리자 끝낸 이후 작성할것
						if( ch2==1 ) { // 도서검색 배열.equals? ==? + 대여가능여부
							System.out.println("찾으시는 책의 이름을 입력해주세요");
							String bookname = sc.next();
							for( int b=0; b<book.length; b++) {
								if( book[b][0].equals(bookname) ) {
									System.out.printf("%s\t%s \n", bookname, book[b][1]);
								} else { break; }
							}
						} // if ch2==1
						else if( ch2==2 ) { // 도서목록 모든 도서명 출력
							for( int j = 0 ; j<book.length ; j++  ) {
								if( book[j][0] != null ) { // 게시물이 없는 인덱스는 제외 
									System.out.printf("%s\t%s \n", book[j][0], book[j][1]);
								}
							}
						} // if ch2==2
						else if( ch2==3 ) { // 도서대여 도서대여여부가 가능할때 도서대여 처리
							
						}
						else if( ch2==4 ) { // 도서반납 본인이 대여한 도서만 반납 처리
							
						}
						else if( ch2==5 ) { // 로그아웃 while 종료? break or boolean 스위치로 활용
							break;
						}
						else { System.out.println("올바른 입력을 해주세요"); }
						} // while run2
						
					} // if 아디비번일치확인
				} // for 아디비번일치확인
					
				} // else관리자가 아니면
			} // while run 
			
			} // else if ch1 == 2
			
		} // while true
		
	} // m e

} // c e
