package exam02;

public class StringArray {
	public static void main(String[] args) {
		String[] arrStr = new String[5];
		arrStr[0] = "a";
		for (int i = 0; i < arrStr.length; i++) {
			arrStr[i] = (i + 1) + "";
			System.out.println(arrStr[i]);
		}

		// System.out.println(arrStr.length);

	}

}

// 정해지지 않은 객체 타입에서는 값 미 입력시 null 이 됨.