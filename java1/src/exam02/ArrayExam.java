package exam02;

public class ArrayExam {
	public static void main(String[] args) {
		int[] arrNum = new int[20];

		// arrNum[0] = 0;
		// arrNum[1] = 1;
		// arrNum[2] = 2;
		// arrNum[3] = 3;
		// arrNum[4] = 4;
		// arrNum[5] = 5;
		// arrNum[6] = 6;
		// arrNum[7] = 7;
		// arrNum[8] = 8;
		// .
		// .
		// .
		// arrNum[19] = 19;

		for (int i = 0; i < arrNum.length; i++) {
//			System.out.println(i);
			arrNum[i] = i+1;

		}

		 System.out.println(arrNum.length);

	}

}
