package Day03;

import java.util.Scanner;

public class Day03_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int score = sc.nextInt();
//		
//		//����6
//		// ������ �Է¹޾� ���� 90 �̻��̸� �հ� �ƴϸ� ���հ�
//		if(score>=90) {
//			System.out.println("�հ�");
//		}else
//			System.out.println("���հ�");
//		//����7
//		// ������ �Է¹޾� 90�� �̻��̸� A 80�� B 70�� C �� �� �����
//		if(score>=90) {
//			System.out.println("A");
//		}else if(score>=80) {
//			System.out.println("B");
//		}else if(score>=70) {
//			System.out.println("C");
//		}else
//			System.out.println("�����");
		//����8 �α���������
				// [ �Է� ] : ���̵�� ��й�ȣ�� �Է¹ޱ�
				// [ ���� ] : ȸ�����̵� admin �̰� 
				//           ��й�ȣ�� 1234 �� ��쿡�� 
				//          �α��� ���� �ƴϸ� �α��� ���� ���
		System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
		System.out.println("���̵� : ");
		String id = sc.next();
		System.out.println("��й�ȣ : ");
		int pw = sc.nextInt();
			// ��ü�� ����Ұ�
				// �ڷ��� ����ϴ� ������ ������ ��� ����
				// Ŭ���� ����ϴ� ��ü�� ������ ��� �Ұ� -> �޼ҵ�
					// ���ڿ� �񱳽� .equals
					// ���ڿ�1.equals( ���ڿ�2 )
		boolean �α��μ��� = false;
			// boolean : 1��Ʈ true or false ����
		if( id.equals("admin") ) { // id �� Ŭ���� ��ü�̱� ������ == �Ұ��� // ��ü�񱳽ÿ��� .equals() ���
			// �Է��� id�� admin �̸�
			if( pw == 1234) { // pw �� �ڷ��������̱� ������ == ����
				// �Է��� pw�� 1234 �̸�
			System.out.println("�α��� ����");
			�α��μ��� = true; // id, pw �� ��� �����ϸ� ������ ����
			}else { // �Է��� pw 1234 �ƴϸ� ���
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�."); }
		}else { // �Է��� id�� admin�� �ƴϸ�
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}if( �α��μ��� == false )
		System.out.println("�α��� ����");
			// �α��� ���� ������ false �̸� ���
		
//		System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
//		String id = sc.next();
//		int pw = sc.nextInt();
//		
//		if(id.equals("admin")) {
//			if(pw == 1234) {
//				System.out.println("�α��� ����");
//			}else {
//					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
//			 }
//		}
//			else 
//				System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		
		//����9 ����
			// [ �Է� ] : ������ �Է¹ޱ�
			// [ ���� ] : ��� 90�� �̻��̸鼭 �������� >= 90��
		
		System.out.println("�������� : "); int ���� = sc.nextInt();
		System.out.println("�������� : "); int ���� = sc.nextInt();
		System.out.println("�������� : "); int ���� = sc.nextInt();
		int ��� = (����+����+����)/3;
		if( ���>=90 ) { //��� 90�� �̻��̸�
			
			// if ��ø
			if( ���� == 100 ) System.out.println("������");
			if( ���� == 100 ) System.out.println("������");
			if( ���� == 100 ) System.out.println("���п��");
			
		}else if( ���>=80 ) { // ��� 80�� �̻��̸�
			if( ���� >= 90 ) System.out.println("�������");
			if( ���� >= 90 ) System.out.println("�������");
			if( ���� >= 90 ) System.out.println("�������");
			
		}else { // �� �� �̸�
			System.out.println("�����");
		}
		
			
		
	}

}
