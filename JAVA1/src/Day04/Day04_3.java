package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 { // c s

	public static void main(String[] args) { // m s
		
		//가위바위보게임
			// 1. 사용자에게 가위[0] 바위[1] 보[2] 종료[3] 중에 선택
			// 2. 컴퓨터 난수발생[0~2]
			// 3. 사용자와 컴퓨터중 승리자 판단 [ 경우의수 ]
			// 4. 3번 선택하기 전까지 게임 실행
			// 5. 3번 선택시 게임종료
					// 1. 총 게임수 출력	예) 3판
					// 2. 최종 승리 출력	예) 컴퓨터 2 사용자 1
		
		//준비
		int 플레이어 ;		// 사용자가 선택한 수 저장
		int 컴퓨터 ;		// 컴퓨터가 난수를 생성한 수 저장
		int 게임수=0 ;		// 총 가위바위보 실행 횟수 저장
		int 플레이어승리수=0;	int 컴퓨터승리수=0; // 각 승리 수 저장
		Scanner sc = new Scanner(System.in);
		
		// 프로그램 실행
		while( true ) { // 프로그램 실행 [ 무한루프 종료조건 : 3번 입력시에 종료(break) ]
			System.out.println(" -------- 가위바위보 게임 --------");
			System.out.println(" 가위(0) 바위(1) 보(2) 종료(3) 선택 :");
			플레이어 = sc.nextInt(); // 입력한 수 저장
			System.out.println(" 플레이어가 낸수 : " + 플레이어 );
			
			Random random = new Random(); // 난수 객체 선언
					// random.nextInt() : int가 표현할 수 있는 범위 내 난수 발생
					// random.nextInt(수) : 0 ~ 수 전까지 범위 내 난수 발생
						// random.nextInt(10) : 0 ~ 9 범위 내 난수 발생
						// random.nextInt(11)+10 : 10 ~ 20 범위 내 난수 발생
			컴퓨터 = random.nextInt(3);	// 난수를 정수(int형)로 가져오기
			
				// 종료조건
			if( 플레이어 == 3 ) {
				System.out.println(" 알림)) 게임종료 ");
				System.out.println(" 총 게임 횟수 : "+게임수);
				if( 플레이어승리수 > 컴퓨터승리수 ) System.out.println(" 최종 승리자 : 플레이어 "+플레이어승리수);
				else if( 플레이어승리수 < 컴퓨터승리수 ) System.out.println(" 최종 승리자 : 컴퓨터 "+컴퓨터승리수);
				else System.out.println(" 최종 승리 : 무승부 ");
				break;
			}else if ( 플레이어 >=0 && 플레이어 <=2 ) { // 정상입력
				// 승리자 판단
				if((플레이어==0 && 컴퓨터==2) || (플레이어==1 && 컴퓨터==0) || (플레이어==2&&컴퓨터==1) ) { // 플레이어 승리 경우의 수
					// 플레이어가 이기는 경우의 수 // 플레이어 승리 경우의 수
					System.err.println(" 알림)) 플레이어 승리 ");
					플레이어승리수++; // 승리수 증가
				}else if((플레이어==0 && 컴퓨터==0) || (플레이어==1 && 컴퓨터==1) || (플레이어==2&&컴퓨터==2)) { // 비기는 수
					System.err.println(" 알림)) 무승부 ");
				}else { // 그 외는 컴퓨터 승리
					System.err.println(" 알림)) 컴퓨터 승리 ");
					컴퓨터승리수++;
				}
				//게임수 증가
				게임수++;
			}else {
				System.out.println(" 알림)) 알수없는 행동입니다.");
			}
			
			
			
		}
		
	} // m e

} // c e
