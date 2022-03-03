package Day03;

import java.util.Scanner;

public class Dat03_Starquiz {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("별 개수를 입력해주세요");
//		int s3 = sc.nextInt();
//		for(int i=1; i<=s1; i++) {
//			for(int s=1; s<=i; s++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		System.out.println("별 개수를 입력해주세요");
//		int s4 = sc.nextInt();
//		for(int i=1; i<=s4; i++) {
//			for(int s=1; s<=s4-i+1; s++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		System.out.println("별 개수를 입력해주세요");
//		int s5 = sc.nextInt();
//		for(int i=1; i<=s5; i++) {
//			for(int b=1; b<=s5-i+1; b++) {
//				System.out.print(" ");
//			}for(int s=1; s<=i; s++) {
//					System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
//		System.out.println("별 개수를 입력해주세요");
//		int s6 = sc.nextInt();
//		for(int i=1; i<=s6; i++) {
//			for(int b=1; b<=i-1; b++) {
//				System.out.print(" ");
//			}
//			for(int s=1; s<=s6-i+1; s++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		System.out.println("별 개수를 입력해주세요");
//		int s7 = sc.nextInt();
//		for(int i=1; i<=s7; i++) {
//			for(int b=1; b<=s7-i+1; b++) {
//				System.out.print(" ");
//			}
//			for(int s=1; s<=i*2-1; s++) {
//				System.out.print("*"); // 8번은 "*" 을 i [ 증감연산자 영향을 받고있는 변수] 로
//			}
//			System.out.println();
//		}
		
		System.out.println("별 개수를 입력해주세요");
		int s9 = sc.nextInt();
		for(int i=1; i<=s9; i++) {
			for(int b=1; b<=i-1; b++) {
				System.out.print(" ");
			}
			for(int s=1; s<=s9*2-(i*2-1); s++) { // YEEEEEEEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAA!!!!!!!!!!!!!
				System.out.print("*");
			}
			System.out.println();
		}
		
	} // m e

} // c e
