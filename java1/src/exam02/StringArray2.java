package exam02;

public class StringArray2 {

	// public StringArray2() {
	// }
	//
	// 기본생성자 -> 없으면 자바가 알아서 만들어 줁다...
	// 단, 지정해주면 지정해주는 걸 따른다.

	int num;

	public void printStr() {
		num = 2;
		System.out.println(num);
		System.out.println("함수 : printStr을 호출하셨네요");
	}

	public static void main(String[] args) {
		StringArray2 st2 = new StringArray2();
		// st2.num=3;
		// System.out.println(st2.num);
		st2.printStr();

	}

}
