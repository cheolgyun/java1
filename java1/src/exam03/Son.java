package exam03;

public class Son extends Father {

	public Son() { // 생성자... return 타입이 존재하지 않음... 굳이 void를 써주지 않아도 됨.. 왜? 원래 없는 애니까..

	}

	// 상속
	String house = "신림고시원";

	public void printHouse() {
		System.out.println(house);
	}

	// 오버라이딩 : 함수의 재정의

	// public void doJob() {
	// System.out.println("나 일해 바빠 임마");
	// }
	//
	// public void doSleep() {
	// System.out.println("나 피곤해 자야되");
	// }

	public static void main(String[] args) {
		Son s = new Son();

		System.out.print(s.who);

		// System.out.println(s.money);
		// System.out.println(s.car);
		// System.out.println(s.house);
		// s.printHouse();
		// s.who = "나"
		// s.doJob();
		// s.doSleep();

	}
}
