package Day03; //��Ű����

import java.util.Scanner;

public class Day03_2 { // c s

	public static void main(String[] args) { // m s
		
		// �Է°�ü = { } �� 1�� ���
		Scanner sc = new Scanner(System.in);
		
		// ����1 : 2���� ������ �Է¹޾Ƽ� �� ū ���� ���
		System.out.println("����1�Է�: ");
		int ����1 = sc.nextInt();
			// int�� ���� ���� �ϰ� �Է¹��� ���� ������ �����ͼ� ����
		System.out.println("����2�Է�: ");
		int ����2 = sc.nextInt();
		
		// ����
		if( ����1 > ����2 ) System.out.println(" �� ū�� : " + ����1 );
		// ���࿡ �Է¹��� ���� Ʈ���̸� ����1�� ��� �ƴϸ� �Ʒ���
		else if ( ����1 < ����2 ) System.out.println(" �� ū�� : " + ����2);
		// �Է¹��� ���� Ʈ���̸� ����2�� ��� �ƴϸ� �Ʒ���
		else System.out.println(" ���� ");
		// ���� ��� ������ ���յ̴ٸ� ����
		
		// ����2 : 3���� ������ �Է¹޾Ƽ� ���� ū �� ���
		System.out.println("����1�Է�: ");
		int ����3 = sc.nextInt(); // ������ �ߺ�x
		System.out.println("����1�Է�: ");
		int ����4 = sc.nextInt();
		System.out.println("����1�Է�: ");
		int ����5 = sc.nextInt();
		int max = ����3; //���� ū���� �����ϴ� ������ �������
			// max�� ù��° �� �־�α�
		if( max < ����4 ) { max = ����4; }
			// ���࿡ max ���� ����4�� �� ũ�� ��ü
		if( max < ����5 ) { max = ����5; }
		System.out.println(" ���� ū�� : " + max );
		
		// ���� 3 : 4���� ������ �Է¹޾Ƽ� ���� ū �� ���
		System.out.println("����1�Է�: ");
		int ����6 = sc.nextInt(); // ������ �ߺ�x
		System.out.println("����1�Է�: ");
		int ����7 = sc.nextInt();
		System.out.println("����1�Է�: ");
		int ����8 = sc.nextInt();
		System.out.println("����1�Է�: ");
		int ����9 = sc.nextInt();
		int max2 = ����6;
		if( max < ����7 ) { max = ����7; }
		if( max < ����8 ) { max = ����8; }
		if( max < ����9 ) { max = ����9; }
		System.out.println(" ���� ū�� : " + max2 );
		
		// ���� 4 : 3���� ������ �Է¹޾Ƽ� ��������
		System.out.println("����1�Է�: ");
		int ����10 = sc.nextInt(); // ������ �ߺ�x
		System.out.println("����1�Է�: ");
		int ����11 = sc.nextInt();
		System.out.println("����1�Է�: ");
		int ����12 = sc.nextInt();
		
		if( ����10 > ����11 ) {		// > : ��������	< : ��������
			// ��ü[ ���� = �ΰ��� ������ �� ��ü ]
			int temp = ����10; // �ӽú��� = ����1;
			����10 = ����11; // ����1 = ����2;
			����11 = temp; // ����2 = �ӽú���;
		}
		if( ����10 > ����12 ) { int temp = ����10; ����10 = ����12; ����12 = temp; }
		if( ����11 > ����12 ) { int temp = ����11; ����11 = ����12; ����12 = temp; }
		System.out.printf(" �Է��� �� �������� : %d %d %d ", ����10, ����11, ����12);
		// System.out.println(" �Է��� �� �������� : " + ����10 + ����11 + ����12 );
		
		// ���� 5 : 4���� ������ �Է¹޾Ƽ� �������� 
		System.out.println("����1�Է�: ");
		int ����13 = sc.nextInt(); // ������ �ߺ�x
		System.out.println("����1�Է�: ");
		int ����14 = sc.nextInt();
		System.out.println("����1�Է�: ");
		int ����15 = sc.nextInt();
		System.out.println("����1�Է�: ");
		int ����16 = sc.nextInt();
		
		// ù��° �� ���� ���� ��
		if( ����13 > ����14 ) { int temp = ����13 ; ����13 = ����14; ����14 = temp; }
		if( ����13 > ����15 ) { int temp = ����13 ; ����13 = ����15; ����15 = temp; }
		if( ����13 > ����16 ) { int temp = ����13 ; ����13 = ����16; ����16 = temp; }
		// �ι�° �� ���� ���� ��
		if( ����14 > ����15 ) { int temp = ����14 ; ����14 = ����15; ����15 = temp; }
		if( ����14 > ����16 ) { int temp = ����14 ; ����14 = ����16; ����16 = temp; }
		// ����° �� ���� ���� ��
		if( ����15 > ����16 ) { int temp = ����15 ; ����15 = ����16; ����16 = temp; }
		// �׹�° �� ���� ���� �� x
			System.out.printf(" �������� : %d %d %d %d ", ����13, ����14, ����15, ����16 );
			
	} // m e

} // c e
