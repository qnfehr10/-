package Day03;

import java.util.Scanner;

public class Day03_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ������1 : �Է¹��� �� ��ŭ * ���
		System.out.println(" ����1) ������ : "); int s1 = sc.nextInt();
		for( int i = 1 ; i<=s1 ; i++) {
			// * i�� 1���� �Է¹��� �� ���� 1�� ����
			System.out.print("*");
		}
		
		// ������2 : �Է¹��� �� ��ŭ * ��� [ �� 5������ �ٹٲ� ó�� ]
		System.out.println(" ����2) ������ : "); int s2 = sc.nextInt();
		for( int i = 1 ; i<=s2 ; i++) {
			// * i�� 1���� �Է¹��� ������ 1�� ����
			System.out.print("*");
			// 5������ �ٹٲ� -> 5�������
			if( i%5 == 0 ) System.out.println();
		}
		// ������3 : �Է¹��� �� �� ��ŭ ��� 
		System.out.println(" ����3) �ټ� : "); int s3 = sc.nextInt();
		for( int i = 1 ; i<=s3 ; i++) {
			// * i�� 1���� �Է¹��� �� ������ 1������
			
			// 1. �����
			for( int s = 1 ; s<=i ; s++ ) {
				System.out.print("*");
			}
			// 2. �ٹٲ�ó��
			System.out.println();
		}
			// ������
				// ���� ����ڰ� 3�� �Է�������
				// i = 1	i<=3 [true] -> i++
					// s = 1	1<=1 [true] -> * -> s++
					// s = 2	2<=1 [fasle] -> �ݺ�������
				// �ٹٲ�
				// i = 2	i<=3 [true]
					// s = 1	s<=2 [true] -> * -> s++
					// s = 2	s<=2 [true] -> * -> s++
					// s = 3	s<=2 [false] -> �ݺ�������
				//�ٹٲ�
				// i = 3 i<=3 [true]
					// s = 1	s<=3 [true] -> * -> s++
					// s = 2	s<=3 [true] -> * -> s++
					// s = 3	s<=3 [true] -> * -> s++
					// s = 4	s<=3 [false] -> �ݺ�������
				//�ٹٲ�
		
		// ������ 4 �پ��� ��
		System.out.println(" ����4) �ټ� : "); int s4 = sc.nextInt();
		for( int i = 1 ; i<=s4 ; i++) {
			for( int s = 1 ; s<=s4-i+1 ; s++ ) {
			System.out.print("*");
			}
			System.out.println();
		}
		// ������ 5 ������ �������� ��
		System.out.println(" ����5) �ټ� : "); int s5 = sc.nextInt();
		for( int i = 1 ; i<=s5 ; i++ ) {
			// �������
			for( int b = 1 ; b<=s5-i ; b++) {
				System.out.print(" "); // ����
			}
			// �����
				for( int s = 1 ; s<=i ; s++) {
				System.out.print("*");
			}
			// �ٸ���
				System.out.println();
		}
		// ������ 6 ������ ���ܳ��� ��
		System.out.println(" ����6) �ټ� : "); int s6 = sc.nextInt();
		for( int i = 1 ; i<=s5 ; i++ ) {
			for( int b = 1 ; b<=i-1 ; b++ ) {
				System.out.print(" ");
			}
			for( int s = 1 ; s<=s6-i+1 ; s++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
		// ���� 7 ~ 8
		System.out.println(" ����7) �ټ� : "); int s7 = sc.nextInt();
		for( int i = 1 ; i<=s7 ; i++ ) {
			for( int b = 1 ; b<=s7-i ; b++ ) {
				System.out.print(" ");
			}
			for( int s = 1 ; s<=i*2-1 ; s++ ) {
				System.out.print("*");
				// System.out.print(i); // ����8
			}
				System.out.println();
		}
		
		
		
		
	}
	
}
