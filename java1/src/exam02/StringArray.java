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

// �������� ���� ��ü Ÿ�Կ����� �� �� �Է½� null �� ��.