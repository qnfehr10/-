package Day03;

import java.util.Scanner;

public class Day03_7 {

	public static void main(String[] args) {
		
		boolean run = true; // ���� ���� ���� / true = ���� false = ����
		
		int balance = 0; // ���ݾ�[����ݾ�] ����
		
		Scanner sc = new Scanner(System.in); // �Է°�ü
		
		while( run ) { // while( true ) { } : ���ѷ���
			System.out.println("-----------------------");
			System.out.println("1.���� 2.��� 3.�ܰ� 4.����");
			System.out.println("-----------------------");
			System.out.print("����>");
			int ���� = sc.nextInt(); // �Է¹��� ���� ��������
			if( ���� == 1 ) { // ���࿡ �Է°��� 1 �̸�
				System.out.println(" ���ݾ� : "); int ���ݾ� = sc.nextInt();
				// �Է¹��� ���ݾ��� ���忡 �ֱ�
				balance += ���ݾ�;
			}
			else if( ���� == 2 ) { // ���࿡ �Է°��� 2 �̸�
				System.out.println(" ��ݾ� : "); int ��ݾ� = sc.nextInt();
				// ���࿡ ��ݾ��� ���ݾ׺��� �� ũ�� �ܾ׺���
				if( ��ݾ�>balance ) { System.out.println(" �˸�) �ܾ��� �����մϴ�."); }
				// �ƴϸ� ��ݽ���
				else { balance -= ��ݾ�; } // �Է¹��� ��ݾ��� ���忡�� ����
				}
			
			else if( ���� == 3 ) { // ���࿡ �Է°��� 3 �̸�
				System.out.println(" �ܰ� : " + balance);
			}
			else if( ���� == 4 ) { // ���࿡ �Է°��� 4 �̸�
				break; // while Ż�� [ ���ѷ��� ���� ]
			}else { // �׿�
				System.out.println(" �˸�) �˼� ���� ��ȣ �Դϴ�.");
			}
		} // w e
		
		System.out.println("���α׷� ����");

	} // m e

} // c e
