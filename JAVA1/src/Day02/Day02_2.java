package Day02; // ��Ű����

public class Day02_2 { // c s

	public static void main(String[] args) { // m s
		
		// ; : ���� ���� ����
		// ������ �������� ��� �� �� ����. [ �̸��� �ߺ��Ǹ� ����(���кҰ�) ]
		
		// p.40 byte : 1����Ʈ ���� +-128
		byte var1 = -128;
		System.out.println(var1);
		
		byte var2 = -30;
		System.out.println(var2);
		
		byte var3 = 30;
		System.out.println(var3);
		
		// byte ���� �����߻� 128�� �Ѿ�� ����
		Short var4 = 300;
		System.out.println(var4);
		
		byte var5 = 'j';
		System.out.println(var5);
			// byte = ���� -> ���� ��ȯ [ �ƽ�Ű�ڵ� ��Ģ ]
		
		// p.43 char : 2����Ʈ [ 1���� ���� ] : �����ڵ�(java���) vs �ƽ�Ű�ڵ�(c���)
		// �����ڵ�(2����Ʈ ������ ��� �����)
		char c1 = 'a';
		System.out.println( c1 );
		char c2 = 97;
		System.out.println( c2 );
			// char = ���� -> ���� ��ȯ		// 10���� ǥ�� : 0~9
		char c3 = '\u0041';
		System.out.println( c3 );		// 16���� ǥ��
		char c4 = '��';
		System.out.println( c4 );
		char c5 = 44032;
		System.out.println( c5 );
		char c6 = '\uac00';
		System.out.println( c6 );
		// ���� ���� ���� [ ��ǻ�Ͱ� 2������ ����ϸ� ǥ�������� ���⶧�� -> ǥ������ �پ缺�� ���� ]
			// 2���� : 0 , 1		/����(2���ڵ�) / �뷮 1��Ʈ
			// 8���� : 0 ~ 7
			// 10���� : 0 ~ 9
			// 16���� : 0 ~ 9 a b c d e f
		
		// p.44 short : 2����Ʈ ���� +-3������
		short num1 = 30000;
		System.out.println( num1 );
		/*short num2 = 40000;  *���� �߻�*
		System.out.println( num2 );
		*/
		
		// p.45 int : 4����Ʈ ���� +-20������ ( ������ �⺻Ÿ�� )
		int num2 = 10;
		System.out.println( num2 ); // 10����
		int num3 = 012;
		System.out.println( num3 ); // 8������ �տ� 0 ������
		int num4 = 0xA;
		System.out.println( num4 ); // 16������ �տ� 0x ������
		
		// p.46 long : 8����Ʈ ���� +- 20�� �̻� [ ������ �ڿ� L ]
		long num5 = 10000000000L; // Lǥ��� INT�� -> long ��
		System.out.println( num5 );
		
		// p.47~48 float[ �����͵ڿ� f ] : 4����Ʈ : �Ҽ��� 8�ڸ� ǥ�� / double(�Ǽ� �⺻Ÿ��) : 8����Ʈ : �Ҽ��� 17�ڸ� ǥ��
		double num6 = 3.14;
		System.out.println( num6 );
		
		float num7 = 3.14f;
		System.out.println( num7 );
		
		double num8 = 0.123456789012345678911111111;
		System.out.println( num8 );
		
		float num9 = 0.1234567890123456789f;
		System.out.println( num9 );
		
		// p.48 boolean : 1��Ʈ [ true Ȥ�� false ]
			// boolean = ����ġ ���� : on, off / true, false
		boolean bo1 = true;
		System.out.println( bo1 );
		
		// p.49 : Ÿ�Ժ�ȯ
			//			------->>>>>>>>---------�ڵ�����ȯ ����-------->>>>>
			// * ũ����� : byte -> short -> int -> long -> float -> double
			//          -------<<<<<<<<---------��������ȯ ����--------<<<<<
		
			// 1. �ڵ� ����ȯ : 
				//���� ���ڿ��� ū���ڷ� �̵� ����
				//ū���ڿ��� ���� ���ڷ� �̵� �Ұ�
			
			byte ����Ʈ = 10;
			int ��Ʈ = ����Ʈ; // �ڵ� ����ȯ o
			// short ��Ʈ = ��Ʈ; �ڵ� ����ȯ x ���� �߻�
			// 2. ���� ����ȯ ( ĳ��Ʈ )
				//ū���ڿ��� ���� ���ڷ� �̵� ���� ��, �����Ϳ� �ս� ����
				// (������ �ڷ���)������
			short ��Ʈ = (short)��Ʈ; // int�� ������ short�� ��ȯ ��, ������ �߸�
		
	} // m e

} // c e
