package Day06;

import java.util.Scanner;

public class Day06_6 {

	public static void main(String[] args) {
		
		// ��ȸ���� �Խ��� [ Ŭ���� ���� ]
		
			// 0. �Խù� ���� => Ŭ���� ����
				// �ʵ� : ����, ����, �ۼ���, ��й�ȣ
				// ������ : ������� ����
		
			// 1. ùȭ�� [ ��� �Խù� ��� ]
		
			// 2. �޴� [ 1. �۾��� 2. �ۺ��� ]
				// 1. �۾��� [ ����, ����, �ۼ���, ��й�ȣ => 4������ -> ��üȭ ]
				// 2. �ۺ��� [ �ش� �۹�ȣ�� �Է��� �޾� �ش� �� ��������(��ȣ, �ۼ���, ����, ����) ǥ�� ]
					// �۹�ȣ�� �迭�� ����Ǵ� ���� [ �ε��� ]
					// �ۺ��� �޴�
		
			// 3. �ۺ��� �޴� [ 1. ��Ϻ��� 2. ���� 3. ���� ]
				// 1. ������ : �ۼ��ڿ� ��й�ȣ �Է¹޾� �����ϸ� ����
				// 2. ������ : �ۼ��ڿ� ��й�ȣ �Է¹޾� �����ϸ� ����� ���븸 ����
		
		Scanner sc = new Scanner(System.in);
		Board[] boardlist = new Board[100];
		
		// ���α׷� ����
		while(true) { // ���α׷� ���� ���ѷ��� [ �������� x ]
			System.out.println("--------- Ŀ�´�Ƽ ---------");
			// ��� �Խù� ��ȸ
			System.out.println("��ȣ\t�ۼ���\t����");
				// �迭 �� ��� ��ü(�Խù�) ��� �ݺ���
				int index = 0; // �ε��� ����
				for( Board board : boardlist ) {
					if( board != null ) { // �ش� board ��ü�� ���빰�� ������ ���
					System.out.printf("%3d\t%10s\t%20s\n",
							index, // %d
							board.writer, // %s
							board.title); // %s\n
						// ���Ĺ��� : %s ���� %d ����
								// %����s : ���ڸ�ŭ �ڸ� ����
					}
							index++; // �ε��� ����
				}
			/////////////////////////////////////////////////////
			System.out.println("1.�۾��� 2.�ۺ���");
			int ch = sc.nextInt();
			if( ch==1 ) { // 1. �۾���
				// 1. 4�� ������ �Է¹޴´�
				System.out.println("------------------ �� ���� ������ -----------------");
				System.out.print("title : ");		String title = sc.next();
				System.out.print("content : ");		String content = sc.next();
				System.out.print("writer : ");		String writer = sc.next();
				System.out.print("password : ");	String password = sc.next();
				// 2. 4�� ������ ��üȭ [ ��ü�� ���� 4�� ������ ��ü �� �ʵ忡 ���� ]
				Board board = new Board( title, content, writer, password);
						// 4�� �ʵ带 ���� ������ ���
				// 3. �迭 �� ������� ã�Ƽ� ������� ��ü ����
				int i = 0;
				for( Board temp : boardlist) { // ����� ã������
					if( temp == null ) { boardlist[i] = board; // �ش� �ε����� ����
					break;
					}
					i++;
				}
			///////////////////////////////////////////////
			}
			
			else if( ch==2 ) { // �ۺ���
				System.out.println("�Խù� ��ȣ ���� : "); int bno = sc.nextInt();
				
				System.out.println("--------- �Խù� �������� ---------");
				// �ݺ��� ��� ���� X -> �������ġ[�ε���] �Է� �޾ұ� ������
				System.out.printf("�ۼ��� : %s ���� : %s \n",
						boardlist[bno].writer, boardlist[bno].title);
				
				System.out.printf("���� : %s \n", boardlist[bno].content);
				System.out.println("------------------------------------");
				System.out.println("1.��Ϻ���(�ڷΰ���) 2.�ۻ��� 3.�ۼ���");
				

				int ch2 = sc.nextInt();
				if( ch2 == 1 ) {}
				else if( ch2 == 2 ) {
////////////////////////////////////////////�� ���� ////////////////////////////////
					System.out.println(" �˸�)) �� �Խù� ��й�ȣ : " );  String password = sc.next();
					// �ݺ���X �˻�x => ������ �ε��� ��ġ�� �Է¹޾ұ� ������
					if( boardlist[bno].password.equals(password) ) { // �Խù���ü�� ��й�ȣ == �Է��� ��й�ȣ 
						System.out.println(" �˸�)) ���� ���� ");
						boardlist[bno] = null; // �ش� �Խù��� null ���� // ����ó��
						// �����Ŀ� ������ �ε��� �ڷ� ��ĭ�� ������ �̵� 
							// ��???  ���࿡ �ش� �ڵ尡 ������� �迭�� ���̻��� ���� �߻� 
						for( int i = bno ; i< boardlist.length ; i++ ) { // �迭���� = 100  �ε��� : 0~99
							// * �˻��� �Խù��� �ε������� �������ε������� 1������ 
							if( i == boardlist.length-1 ) boardlist[ boardlist.length-1 ] = null;
							// i�� �������ε��� �� ������ �������ε������� null ����
							else boardlist[i] = boardlist[i+1];// ������ �Խù� ���� �Խù�
							// ������ �ε����� �ƴϸ� �ε��� ���� 
								// *  	���࿡ 2�� �ε��� ������ 
								// 		2�ε��� = 3�ε��� 
								//	  	3�ε��� = 4�ε��� 
								//		4�ε��� = 5�ε��� 
								//      ~~~~~~~~~~~
								//		98�ε��� = 99�ε��� [ 0��~99�� -> 100�� �ε��� ]
								//		99�ε��� = null [ 99�� �ε��� : �������ε��� ] 
						}
					}else {
						System.out.println(" �˸�)) ��й�ȣ�� �ٸ��ϴ� [ �������� ]");
					}
					
///////////////////////////////////////////////////////////////////////////////////
					
				}
				else if( ch2 == 3 ) {
/////////////////////////////////////////// �� ���� //////////////////////////////////////////
					System.out.println("�˸�)) �� �Խù� ��й�ȣ : "); String password = sc.next();
																	
					if( boardlist[bno].password.equals(password) ) {
						// �ش� �Խù��� ����� ������ ���� �Է¹޾� �� �Խù� ��ü �� ����� ���뿡 ����
						System.out.println("������ ����");	boardlist[bno].title = sc.next();
						System.out.println("������ ����");	boardlist[bno].content = sc.next();
						
						System.out.println("�˸�)) ������ �����Ǿ����ϴ�. ");
					}else { // ���� ��й�ȣ�� �ٸ���
						System.out.println("�˸�)) ��й�ȣ�� �ٸ��ϴ�. [��������]");
					}
					
/////////////////////////////////////////////////////////////////////////////////////////////					
				}
				else {}
				
			}
			else {
				System.err.println(" �˸�)) �˼����� ��ȣ�Դϴ�. ");
			}
			
		} // ���α׷� while true end  
		
	} // m e 
} // c e 