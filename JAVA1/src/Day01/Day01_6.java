package Day01;

import java.util.Scanner;

public class Day01_6 { // c s

	public static void main(String[] args) { // m s
		/* 문제 2 하나의 방문록
		[입력변수] 1.작성자 , 내용 , 날짜
		[출력 예]
		-----------방문록----------
		|순번|작성자| 내용	|날짜 |
		| 1 |김성민| 안녕하세요|02-28 |
		
		*/
		
		System.out.println("작성자 이름 내용 날짜 순으로 입력해주세요");

		Scanner scanner = new Scanner(System.in);
		/* System.out.println("작성자 : "); */String 작성자 = scanner.next();
		/* System.out.println("내용 : "); */String 내용 = scanner.next();
		/* System.out.println("날짜 : "); */String 날짜 = scanner.next();
		
		System.out.println("-----------방문록----------");
		System.out.println("|순번|" + "작성자" + "|" +" "+ "내용" +"\t|"+ "날짜"+ " |");
		System.out.println("| 1 |" + 작성자 + "|" +" "+ 내용 +"|"+ 날짜+ " |");
		//김성민 안녕하세요 02-28
		
	} // m e
	
} // c e
