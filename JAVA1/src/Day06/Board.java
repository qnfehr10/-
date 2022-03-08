package Day06;

public class Board {
	// * Board 클래스 선언
		// main 메소드X
	
	// 1. 필드
	String title;
	String content;
	String writer;
	String password;
	
	// 2. 생성자 [ 클래스이름과 동일하면 생성자명 ]
		// 자동 : 오른쪽클릭 source
	
		// 1. 빈생성자
	Board() {}
		// 2. 1개 필드를 받는 생성자
	Board(String title) {
		this.title = title;
		//this.필드명 => 내부변수
	}
		// 3. 2개 필드를 받는 생성자
	Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
		// 4. 3개 필드를 받는 생성자
	Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
		// 5. 4개 필드를 받는 생성자
	Board(String title, String content, String writer, String password) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
	}
	
	// 3. 메소드
	
	
}
