package exam03;

public class Father {

	int money = 1000;
	String car = "YF소나타";
	String house = "강남타워팰리스";
	String who = "아빠";

	public void printHouse() {
		System.out.println("아들집");
	}

	public void doJob(String who) {
		System.out.println(who + "일해 바빠 임마");
	}

	public void doSleep(String who) {
		System.out.println(who + "피곤해 자야되");
	}

}