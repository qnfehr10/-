package Day05;

import java.util.Scanner;

public class Day05_4�����뿩 {

	public static void main(String[] args) {
		
		//���� �뿩 ���α׷�
		// 1. �迭 ����
			// 1. ȸ�� [ ���̵�(�ߺ�x), ��й�ȣ ]
			// 2. ���� [ ������(�ߺ�x), �����뿩����(�뿩����, �뿩��), �뿩��(�α��� ���̵�) ]
		
		// 2. �ʱ�޴�
			// 1. ȸ������ 2. �α���
		
		// 3. �α��ν� �޴�
			// 1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5.�α׾ƿ�(break;)
					// 1. �����˻��� �������� ��ġ�ϸ� ������� �����뿩���� ��� �ƴϸ� ����
					// 2. ������Ͻ� ��� ������ ���
					// 3. �����뿩�� �����뿩���ΰ� �����Ҷ� �����뿩 ó��
					// 4. �����ݳ��� ������ �뿩�� ������ �ݳ� ó��
					// 5. �α׾ƿ�
		
		// 4. �α��ν� ���̵� admin �̸� �����ڸ޴�
				// 1. ������� 2. ������� 3. �α׾ƿ�
						// 1. ������Ͻ� �������� �Է¹޾� ���� ���ó��
						// 2. ������Ͻ� ��� ������ ���
						// 3. ���������� ������ �������� �Է¹޾� ������ ������ ����[ null ]
						// 4. �α׾ƿ��� �ʱ�޴���
		
		// ���� ������
		// 
		// 
		//
		
		Scanner sc = new Scanner(System.in);
		
		String[][] member = new String[10][2]; // �ϴ� ���� 0=id 1=pw
		String[][] book = new String[10][2]; // å ���� 0=������[null] 1=�뿩����?
		
		while(true) {
			System.out.println("1.ȸ������ 2.�α��� : "); // ù ����â
			int ch1 = sc.nextInt(); // ù ���� �Է¹ޱ� 1or2
			
			if( ch1==1 ) {
				System.out.println("-------- ȸ������ ������ ---------");
				System.out.print(" ����Ͻ� ID�� �Է� : "); 	
				String id = sc.next();
				System.out.print(" ����Ͻ� PW�� �Է� : "); 
				String pw = sc.next();
			
			
				boolean idcheck = true;
				for(int i=0; i<member.length; i++) {
					if( member[i][0] !=null && member[i][0].equals(id) ) {
						System.err.println("�̹� ���� ���̵�");
						idcheck = false; // ȸ������ �Ұ���
						break;
					} // if ���� ������ ���̵� ������
				} // for ������ ���̵� �ִ��� �ݺ�ã��
				
				if( idcheck ) { // true�� ȸ������ 
					for( int i=0 ; i<member.length ; i++ ) {
						if( member[i][0] == null ) {
							member[i][0] = id;
							member[i][1] = pw; 
							System.out.println("ȸ�������� �Ǿ����ϴ�.");
							break;
						} // if �������
					} // for �������
				} // if ���̵�üũ
			} // if ch1 ==1
			else if( ch1==2 ) {
				System.out.print(" ID �Է� : "); 	
				String id = sc.next();
				////////////////////////������ ���̵��϶�//////////////////////// 
			boolean run = true; // �۵��� ���� Ʈ�簪 ���� run
			while(run) {
				if( id.equals("admin")) {// ������ ���̵� ���� ������ �޴�â ����
					
					System.out.println("1.������� 2.������� 3.�α׾ƿ�");
					int adminch = sc.nextInt();
					
					if( adminch==1 ) { // ������� �ߺ��� x
						System.out.println("����� �������� �Է����ּ���");
						String bookname = sc.next();
						for( int i=0 ; i<book.length ; i++ ) {
							if( book[i][0] != null && book[i][0].equals(bookname)) { 
								System.out.println("�̹� ��ϵ� �������Դϴ�.");
								break;
							}
							else if( book[i][0] == null) {
								book[i][0] = bookname;
								book[i][1] = "�뿩����";
								System.out.println("��ϵǾ����ϴ�.");
								break; // å �ѱ� ������ ���� while���� �ʿ��Ұ����� ����
							}
						}
					} // if adminch==1
					else if( adminch==2 ) { // ������� ��� ������ ���
						for( int j = 0 ; j<book.length ; j++  ) {
							if( book[j][0] != null ) { // �Խù��� ���� �ε����� ���� 
								System.out.printf("%s \n", book[j][0] );
							}
						}
					} // if adminch==2
					else if( adminch==3 ) { // �α׾ƿ�(����ƴ�) �ʱ�޴� ȭ������ �̵�
						break;
					} // if adminch==3
				}else { // �����ڰ� �ƴϸ� 
						/////////////////////////////////////////////////////////////
				System.out.print(" PW �Է� : ");
				String pw = sc.next();
				
				boolean idpwcheck = false; // ���̵� ��� Ȯ��
				for( int i=0; i<member.length; i++) {
					if( member[i][0] !=null &&
						member[i][0].equals(id) &&
						member[i][1].equals(pw)) {
						System.out.println("�α��� �Ǿ����ϴ�.");
						idpwcheck = true;
						boolean run2 = true;
						while (run2) {
						System.out.println("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�");
						int ch2 = sc.nextInt(); // �ι�° �Է� (�α��μ����� ������)
						
						// ���� �̿ϼ� ������ ���� ���� �ۼ��Ұ�
						if( ch2==1 ) { // �����˻� �迭.equals? ==? + �뿩���ɿ���
							System.out.println("ã���ô� å�� �̸��� �Է����ּ���");
							String bookname = sc.next();
							for( int b=0; b<book.length; b++) {
								if( book[b][0].equals(bookname) ) {
									System.out.printf("%s\t%s \n", bookname, book[b][1]);
								} else { break; }
							}
						} // if ch2==1
						else if( ch2==2 ) { // ������� ��� ������ ���
							for( int j = 0 ; j<book.length ; j++  ) {
								if( book[j][0] != null ) { // �Խù��� ���� �ε����� ���� 
									System.out.printf("%s\t%s \n", book[j][0], book[j][1]);
								}
							}
						} // if ch2==2
						else if( ch2==3 ) { // �����뿩 �����뿩���ΰ� �����Ҷ� �����뿩 ó��
							
						}
						else if( ch2==4 ) { // �����ݳ� ������ �뿩�� ������ �ݳ� ó��
							
						}
						else if( ch2==5 ) { // �α׾ƿ� while ����? break or boolean ����ġ�� Ȱ��
							break;
						}
						else { System.out.println("�ùٸ� �Է��� ���ּ���"); }
						} // while run2
						
					} // if �Ƶ�����ġȮ��
				} // for �Ƶ�����ġȮ��
					
				} // else�����ڰ� �ƴϸ�
			} // while run 
			
			} // else if ch1 == 2
			
		} // while true
		
	} // m e

} // c e
