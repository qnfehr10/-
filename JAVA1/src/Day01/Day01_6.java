package Day01;

import java.util.Scanner;

public class Day01_6 { // c s

	public static void main(String[] args) { // m s
		/* ���� 2 �ϳ��� �湮��
		[�Էº���] 1.�ۼ��� , ���� , ��¥
		[��� ��]
		-----------�湮��----------
		|����|�ۼ���| ����	|��¥ |
		| 1 |�輺��| �ȳ��ϼ���|02-28 |
		
		*/
		
		System.out.println("�ۼ��� �̸� ���� ��¥ ������ �Է����ּ���");

		Scanner scanner = new Scanner(System.in);
		/* System.out.println("�ۼ��� : "); */String �ۼ��� = scanner.next();
		/* System.out.println("���� : "); */String ���� = scanner.next();
		/* System.out.println("��¥ : "); */String ��¥ = scanner.next();
		
		System.out.println("-----------�湮��----------");
		System.out.println("|����|" + "�ۼ���" + "|" +" "+ "����" +"\t|"+ "��¥"+ " |");
		System.out.println("| 1 |" + �ۼ��� + "|" +" "+ ���� +"|"+ ��¥+ " |");
		//�輺�� �ȳ��ϼ��� 02-28
		
	} // m e
	
} // c e
