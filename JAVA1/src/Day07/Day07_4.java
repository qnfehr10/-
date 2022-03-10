package Day07;

public class Day07_4 {

	public static void main(String[] args) {
		
		// p.229 : 외부호출

		// 1. ***** 객체 선언 *****
		Car2 myCar = new Car2();
		// 2. 자동차 시동 걸기 메소드 호출
		myCar.keyTurnOn();
		// 3. 자동차 전진 메소드 호출
		myCar.run();
		// 4. 현재 스피드 확인 메소드 호출
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 : "+speed+" km/h");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
