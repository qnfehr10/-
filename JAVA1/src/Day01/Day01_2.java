package Day01;

public class Day01_2 { // c s
	
	// 1. ���
			// 1 . print() : ��¸�
			// 2 . printf() : ��¿� �ٹ̱�
			// 3 . println() : ����� �ٹٲ� ����
				// ����
					// %s �������
					// %d �������
					// %f �Ǽ����
	
			// ����� [ \ : �������� ��ȭ��ȣ
				// \t : 5ĭ ���
				// \n : �ٹٲ�
				// \\ : "\" ���
				// \" : 
	
		// System : �ý��� Ŭ���� [ ����� ���� ������� �ڵ� ���� ]
		// 2. out : ��� ��Ʈ��
		// 3. print() : ����Լ�
		// 4. ; : ���� �ڵ� ���˸�
		// * �ý��� Ŭ���� �� out �̶�� ��½�Ʈ���� ���� print �Լ��� ����ؼ�
		//	 console�� ���ϴ� ��� ��� �� �� �ִ�. 
	
	public static void main(String[] args) { // m s
		
		// 1. �⺻���
		System.out.print("�ϰ������");	// ; : �ڵ� ���� ����
		System.out.print("java 1����");  // ����ó�� " " ó��
		System.out.print(123);		// ���� " " ó�� X
			// * �̸� ������� �ܾ�[ ����� ] �� ������ ��� ���ڴ� " " ó��
		// 2. �ڵ��ϼ� ( syso + ctrl + �����̽��� )
		System.out.println("�ڹٴ� ��ü�����̴�.");
		System.out.println("jdk8");
		System.out.println(123);
		
		// 3. �������
		System.out.printf("%s" , "�ϰ������\n");
		System.out.printf("java %d����%n" , 1);
		System.out.printf("%d" , 123);
		
		// ����1 [ �⼮�� ]
		System.out.println("\n\t\t[[�⼮��]]");
		System.out.println("------------------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����\t���");
		System.out.println("��ȣ��\t�⼮\t�Ἦ\t�⼮");
		System.out.println("���缮\t�⼮\t�Ἦ\t�⼮");
		System.out.println("------------------------------------------");
		
		// ����2 [ ����1 -> printf ]
		System.out.printf("\n\t\t%s" , "[[�⼮��]]");
		System.out.printf("\n%s", "------------------------------------------");
		System.out.printf("\n%s \t%s \t%s \t%s \t%s" , "�̸�", "1����", "2����", "3����", "���");
		System.out.printf("\n%s \t%s \t%s \t%s \t%s " , "��ȣ��", "�⼮", "�Ἦ", "�⼮", "	");
		System.out.printf("\n%s \t%s \t%s \t%s \t%s" , "���缮", "�⼮", "�Ἦ", "�⼮", "	");
		System.out.printf("\n%s", "------------------------------------------\n");
	
		// ����1 : �����
		//	\     /\
		//	 )   ( ')
		//  (   /  )
		//   \ (__)��
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|"); // | : shift + \
		
		/* ����2 : ������
		|\_/|
		|q p|   /}
		( 0 )"""\
		|"^"`
		||_/=\\__|
		*/
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`");
		System.out.println("||_/=\\\\__|");
		
					 
	} // m e
	
} // c e
