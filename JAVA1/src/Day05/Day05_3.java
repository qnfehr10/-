package Day05;

import java.util.Scanner;

public class Day05_3 {

	public static void main(String[] args) {
		
		// p.181
			// 1.
			// 2.
			// 3. 2 : ��ü �񱳽� equals �޼ҵ� ���
			// 4. 2 : ���̰� ������� �� ���� �Ұ�
			// 5. 3 : bolean �ʱⰪ�� false
			// 6. 3, 5
			//		{ 1�� } , { 2�� } , { 3�� } => 3
			//		{ 78 83 93 87 88 } =>5
			// 7. 
		
		int max = 0; ; // �ִ� �����ϴ� ����
		int[] array = { 1, 5, 3, 8, 2}; // ����+�ʱⰪ ����
		
		for( int i=0; i<array.length; i++) {
			// *i�� 0 ���� �迭�� ���̱��� 1�� ���� ���� �ݺ�ó��
			if( max<array[i] ) max = array[i];
			// *���࿡ max���� i��° �ε����� ���� �� ũ�� max�� i��° �� ����
		}
		
		System.out.println("max : "+max);
		
			// 8.
		int[][] array2 = {
				{ 95 , 86 } ,
				{ 83 , 92 , 96 } ,
				{ 78 , 83 , 93 , 87 , 88 } };
		
		int sum = 0; // �հ�
		double avg = 0.0; // ���
		
		int count = 0; // ������ ���� [ ĭ ���� ]
		
		// Ǯ��
		for( int y = 0; y<array2.length; y++) {
				// * ���� 0���� �迭�� �����[3]�̸����� 1������
			for( int x=0; x<array2[y].length; x++) {
				// *���� 0���� �迭�� ������[ 2 , 3 , 5 ]�̸����� 1������
				sum += array2[y][x];
			}
			
			count += array2[y].length; // �������� �����հ�
			
		}
		
		avg = (double)sum / count;
		
		System.out.println(" sume : "+sum);
		System.out.println(" avg : "+avg);
		
		// 9.
		boolean run = true; // while�� ����ġ ����
		int studentNum = 0; // �л��� ����
		int[] scores = null;//���� �迭
		Scanner sc = new Scanner(System.in); // �Է°�ü
		
		// while( true ) {}
		while( run ) { // ���ѷ��� [ �������� : 5�� �Է½� ���� ]
			
			System.out.println("-------------------------------------");
			System.out.println("1.�л��� 2.�����Է� 3.��������Ʈ 4.�м� 5.����");
			System.out.println("-------------------------------------");
			System.out.print("���� : ");
			
			int selectno = sc.nextInt();
			
			if( selectno ==1 ) { // �л� �� �Է¹ޱ�
				System.out.println("�л���>"); studentNum = sc.nextInt();
				// �Է¹��� �л� �� ��ŭ �迭���� ����
				scores = new int[studentNum];
			}
			else if( selectno ==2 ) { // �л� ���� �Է¹ޱ�
				for( int i = 0 ; i<scores.length; i++) { // �迭 �� ��� �ε�����ŭ �ݺ�ó��
					System.out.printf(" scores[%d] :\n", i); 
					scores[i] = sc.nextInt(); // �Է¹޾� i��° �ε����� ����
				}
			}
			else if( selectno ==3 ) { // �л� ���� ����ϱ�
				for( int i = 0 ; i<scores.length; i++) {
					System.out.printf(" scores[%d] : %d \n", i, scores[i]);
				}
			}
			else if( selectno ==4 ) {
				int �ְ����� = 0;
				int ���հ� = 0;
				double ������� = 0.0;
				
				for( int i=0; i<scores.length; i++) {
					
					// �ְ����� ���ϱ�
					if( �ְ����� < scores[i] ) �ְ����� = scores[i]; // i��° �ε����� ������ ����
					// �����հ�
					���հ� += scores[i];
				}
				
				// ������� ���ϱ�
				������� = (double)���հ� / scores.length;
				
				System.out.println("�ְ� ���� : "+�ְ�����);
				System.out.println("��� ���� : "+�������);
			}
			else if( selectno ==5 ) {
				// break; // �ݺ��� Ż�� while�� �ϳ��� ���� �����ϳ� ��� ���ᰡ��
				run = false; // �ݺ��� ����
			}
			
			
			
		} //while end

	} // m e

}
