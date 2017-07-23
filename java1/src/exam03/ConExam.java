package exam03;

public class ConExam {
	int age = 5;
	String name = "홍길도";

	// age의 값이 20보다 작다면 => 10대라고 출력
	// age의 값이 30보다 작다면 => 20대라고 출력
	// age의 값이 40보다 작다면 => 30대라고 출력
	// age의 값이 50보다 작다면 => 40대라고 출력
	// age의 값이 60보다 작다면 => 50대라고 출력
	// age의 값이 60이상이라면 => 우대권 받아 가세요 라고 출력

	public ConExam(int age, String name) {

		// System.out.println(age);
		// System.out.println(this.age);

		this.age = age;
		this.name = name;

		if (age < 20) {
			System.out.println("10대");
		} else if (age < 30) {
			System.out.println("20대");
		} else if (age < 40) {
			System.out.println("30대");
		} else if (age < 50) {
			System.out.println("40대");
		} else if (age < 60) {
			System.out.println("50대");
		} else if (age >= 60) {
			System.out.println("우대권 받아가세요");
		}
		
		System.out.println(age);
		System.out.println(name);
		
	}

	// public ConExam() {
	// num1 = 3;
	// str1 = "너너너";
	//
	// }

	public static void main(String[] args) {

		ConExam ce = new ConExam(20, "김길동");
//		System.out.println(ce.age);
//		System.out.println(ce.name);

		ConExam ce1 = new ConExam(40, "고길동");
//		System.out.println(ce1.age);
//		System.out.println(ce1.name);

	}

}
