package Day02;

import java.util.Scanner;
import java.util.Arrays;
public class Day02_5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// ����2 : ���� ���� 
		/*
		 * [ �Է����� ] 
		 * 		�ݾ� 
		 * [ ���� ] 
		 * 		�ʸ��� ���� ��� ������ ���� ���� 
		 * [ ������� ]
		 * 		��) 356789 �Է½� 
		 * 		�ʸ��� 3�� 
		 * 		���� 5��
		 * 		õ�� 6�� 
		 * 		��� 7��
		 */
		
		/*
		System.out.println("�ݾ��� �Է����ּ��� : ");
		int �ݾ� = sc.nextInt();
		System.out.println(" �ʸ��� : " + (�ݾ�/100000) + "��" );
		�ݾ� -= ( �ݾ�/100000 )*100000 ; // �ݾ׿��� �ʸ��� ���� ����
		System.out.println(" ���� : " + (�ݾ�/10000) + "��" );
		�ݾ� -= ( �ݾ�/10000 )*10000 ; // �ݾ׿��� ���� ���� ����
		System.out.println(" õ�� : " + (�ݾ�/1000) + "��" );
		�ݾ� -= ( �ݾ�/1000 )*1000 ; // �ݾ׿��� õ�� ���� ����
		System.out.println(" ��� : " + (�ݾ�/100) + "��" );
		�ݾ� -= ( �ݾ�/100 )*100 ; // �ݾ׿��� ��� ���� ����
		*/
		
		
		//����3 : �ϳ��� ������ �Է¹޾� 7�� ������� ���[ true , false ]
			
//			System.out.println("3�� 7�� ����� �Է��� �ּ��� : ");
//			int i3 = sc.nextInt();
//			System.out.println(i3%7 == 0);
//		
//		//����4 : �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ�� [ true , false ]
//			// Ȧ¦ ã��
//				// Ȧ�� : �� % 2 ������ �������� 1 �̸� ���� Ȧ��
//				// ¦�� : �� % 2 �ߵ鶧 �������� 0 �̸� ���� ¦��
//			
//			System.out.println("4�� Ȧ���� �Է��� �ּ��� : ");
//			int i4 = sc.nextInt();
//			System.out.println(i4%2 != 0); // System.out.println(i4%2 == 1);
//		
//		//����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ�� [ true , false ]
//			
//			System.out.println("5�� 7�� ��� �̸鼭 ¦���� ���� �Է��� �ּ��� : ");
//			int i5 = sc.nextInt();
//			System.out.println(i5%7 == 0 && i5%2 == 0);
//		
//		//����6 : �ΰ��� ������ �Է¹޾� �� ū�� ���  [ true , false ]
//			
//			System.out.println("6�� �ΰ��� ������ �Է����ּ��� : ");
//			int i6_1 = sc.nextInt();
//			int i6_2 = sc.nextInt();
//			
//			int ū�� = i6_1 > i6_2 ? i6_1 : i6_2;
//			System.out.println("������ �� ū��? : " + (i6_1 > i6_2) );
//		
//		//����7 : �������� �Է¹޾� �� ���� ����ϱ� 
//				// �� ���� ���� => ������ * ������ * ������[3.14]
//			
//			System.out.println("7�� �������� �Է����ּ��� : ");
//			int i7 = sc.nextInt();
//			System.out.println("���� ���̴� : " + (i7 * i7 * 3.14) + " �Դϴ�." );
//		
//		//����8 : �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�
//				// ��) 54.5   84.3 �̸�    64.285714%
//			
//			System.out.println("8�� �� �Ǽ��� �Է����ּ��� : ");
//			double i8_1 = sc.nextDouble();
//			double i8_2 = sc.nextDouble();
//			double ���� = (i8_1/i8_2)*100;
//			System.out.println("�� �Ǽ��� ���� ���� ���� " + ���� + "%");
//			System.out.printf(" ����� : %.2f %%%n ", ����);
//		
//		//����9 : ��ٸ��� ���� ���ϱ�[������ �غ� ���̸� �Է¹޾� ����ϱ�]
//				//��ٸ��� ���� = > (���� * �غ�) * ���� / 2
//			
//			System.out.println("9�� ��ٸ����� ������ �غ� ���̸� �Է����ּ��� : ");
//			double i9_1 = sc.nextDouble();
//			double i9_2 = sc.nextDouble();
//			double i9_3 = sc.nextDouble();
//			System.out.println("��ٸ����� ���̴� = " + ((i9_1*i9_2) * i9_3/2 ));
//			
//		//����10: Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
//				//ǥ��ü�� ���� = > (Ű - 100) * 0.9
//			
//			System.out.println("10�� Ű�� �����ּ��� : ");
//			int i10 = sc.nextInt();
//			System.out.println("ǥ��ü�� = " + ((i10 - 100)*0.9));
//		
//		//����11: Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
//				//BMI ���� = > ������ / ((Ű / 100) * (Ű / 100))
//			
//			System.out.println("11�� Ű�� �����Ը� �Է����ּ��� : ");
//			int i11_1 = sc.nextInt();
//			int i11_2 = sc.nextInt();
//			System.out.println("BMI : " + (i11_2/((i11_1/100)*(i11_1/100))));
//		
//		//����12: inch �� �Է¹޾� cm �� ��ȯ�ϱ� [ 1 inch -> 2.54cm ] 
//			
//			System.out.println("12�� inch�� �Է����ּ��� : ");
//			int i12 = sc.nextInt();
//			System.out.println("�Է��� �ֽ� ���� " + i12*2.54 + " cm �Դϴ�.");
//		
//		//����13:  �߰�����, �⸻����, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�
//				//�Ҽ� ��° �ڸ� ���� ���� ����ϱ�
//				//�߰����� �ݿ����� => 30 %
//				//�⸻���� �ݿ����� => 30 %
//				//������ �ݿ����� => 40 %
//			
//			
//			System.out.println("13�� �߰�, �⸻, ������ ������ �Է����ּ��� : ");
//			double i13_1 = sc.nextDouble();
//			double i13_2 = sc.nextDouble();
//			double i13_3 = sc.nextDouble();
//			double �߰����� = i13_1*0.3; 
//			double �⸻���� = i13_2*0.3;
//			double ������� = i13_3*0.3;
//			
//			System.out.printf("�߰����� �ݿ����� %.2f%n ", �߰�����);
//			System.out.printf("�⸻���� �ݿ����� %.2f%n ", �⸻����);
//			System.out.printf("������ �ݿ����� %.2f%n ", �������);
//			
//			//����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�
//		 	//int x = 10;
//			//int y = x-- + 5 + --x;
//			//printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)
//			
//			System.out.println("14�� ���� ���� ����");
//			int x = 10;
//			int y = x-- + 5 + --x;
//			System.out.printf(" x�� �� : %d , y�ǰ� : %d%n ", x, y);
//		
//		//����15 : ���̸� �Է¹޾� ���̰� 10���̻��̸� �л� , 20���̻��̸� ���� , 40���̻��̸� �߳� ���� ����ϱ�
//			
//			System.out.println("15�� ���̸� �Է����ּ��� : ");
//			int i15 = sc.nextInt();
//			String ���� = i15 >=40 ? "�߳�" : i15 >= 20 ? "����" : i15 >=10 ? "�л�" : "�ش����";
//			System.out.println("����� : " + ���� + " �Դϴ�.");
		
		//����16 : 3���� ������ �Է¹޾� ������������ ���� 
		
			System.out.println("16�� 3���� ������ �Է����ּ��� : ");
			int i16_1 = sc.nextInt(); //1
			int i16_2 = sc.nextInt(); //3
			int i16_3 = sc.nextInt(); //5
			
			int temp,min,mid,max;
			
			temp = (i16_1 > i16_2) ? i16_1 : i16_2;
			max = temp > i16_3 ? temp : i16_3;
			
			temp = (i16_1 < i16_2) ? i16_1 : i16_2;
			min = temp < i16_3 ? temp : i16_3;
			
			mid = (i16_1 > i16_2)? ((i16_1>i16_3)?(i16_2>i16_3?i16_2:i16_3):i16_1) : ((i16_2>i16_3)?((i16_1>i16_3)?i16_1:i16_3):i16_2);
			
			System.out.println("������� :"+min+" "+mid+" "+max);
		//����17 : 4���� ������ �Է¹޾� ������������ ���� 
			
			System.out.println("17�� 4���� ������ �Է����ּ��� : ");
			int a = sc.nextInt(); //1 a
			int b = sc.nextInt(); //3 b
			int c = sc.nextInt(); //2 c
			int d = sc.nextInt(); //5 d
			int tmp;
			
		    min = (a <= b && a <= c && a <= d) ? a :        // if      (a < b && a < c) return a;
	            (b <= a && b <= c && b <= d) ? b : 
	            	(c <= a && c <= b && c<=d)? c:d;   // else if (b < a && b < c) return b; else return c;
	 
	    max = (a >= b && a >= c && a>= d) ? a :        // if      (a > b && a > c) return a;
	            (b >= a && b >= c && b >= d) ? b : 
	            (c >=a && c>=b && c>=d)? c:d;   // else if (b > a && b > c) return b; else return c;
	 
	    mid = (a >= b && a <= c) ? a : 
	            (b >= a && b <= c) ? b :
	            (c >= a && c <= b) ? c : 
	            (a >= c && a <= b) ? a :
	            (b >= c && a >= b) ? b : c;
			
	    int[] arr = {1,2,3,5,4};
	    Arrays.sort(arr);
	    System.out.println(Arrays.toString(arr));
	    
	    System.out.println(min+" "+mid+" "+max);
			
		// p. 102 Ȯ�ι���
		
	}

}







