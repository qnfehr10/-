package Day03;

import java.util.Scanner;

public class Day03_4 {

	public static void main(String[] args) {
		
		// ��� : 1. if 2. switch��
			// if : ���˻�( true Ȥ�� false ) / ����Ǽ� ������ ���� �ʴ°��
				// >= <= > < == !=
			// switch : �����Ͱ˻�(��������)			/ ����� �� ������ �ִ� ���
				// ������ case �̸� ���๮ó�� �� -> ���� case �̵�
			// ����
				// switch( �˻��� ) {
				//		case '��' : ���๮;
				//		case '��' : ���๮;
				//		case '��' : ���๮;
				//		default : ���๮;
				// }
		
			//break
		
		// ��1) ������ 90�� �̸� A 80���̸� B 70���̸� C �� �� Ż��
		int ���� = 80;
		//---------------------------------------------
		if( ���� == 90 ) System.out.println("A");
		else if( ���� == 80) System.out.println("B");
		else if( ���� == 70) System.out.println("C");
		else System.out.println("Ż��");
		
		System.out.println("---------------------");
		
		switch( ���� ) {
		case 90 : System.out.println("A");	 break;
		case 80 : System.out.println("B");	 break;
		case 70 : System.out.println("C");	 break;
		default : System.out.println("Ż��");	 break;
		}
		
		
		// ��2)
		int ��ư = 3;
		switch( ��ư ) {
			case 1 : System.out.println("1������ �̵�"); break;
			case 2 : System.out.println("2������ �̵�"); break;
			case 3 : System.out.println("3������ �̵�"); break;
			case 4 : System.out.println("4������ �̵�"); break;
			default : System.out.println("����");
		}
		
		// ��3)
		char ��� = 'A';
		switch( ��� ) {
		case 'A' : // System.out.println("��� ȸ��");
		case 'B' : System.out.println("��� ȸ��"); break;
		case 'C' : // System.out.println("�Ϲ� ȸ��");
		case 'D' : System.out.println("�Ϲ� ȸ��"); break;
		default :  System.out.println("�մ�");
		}
		// ��4)
		String ���� = "����";
		switch( ���� ) { // ���������̱� ������ .equals ��� x
			case "����" : System.out.println("700����");	break;
			case "����" : System.out.println("500����");	break;
			default : System.out.println("300����");		
		}
		
		// ����1 ) if ��� x ������ ������ �Է¹޾� ����� 90�� �̻��̸� A��� 80�� �̻��̸� B��� ������ Ż��
		Scanner sc = new Scanner(System.in);
		System.out.println("���� :"); int ���� = sc.nextInt();
		System.out.println("���� :"); int ���� = sc.nextInt();
		System.out.println("���� :"); int ���� = sc.nextInt();
		
		int ��� = (����+����+����)/3;
		System.out.println(" ��� :" + ��� + " ������/10 " + ���/10 );
		switch( ���/10 ) { // 1�ڸ� ����
			case 9 : System.out.println("A���");		break;
			case 8 : System.out.println("B���");		break;
			default : System.out.println("Ż��");		
		}

				
				

	}

}
