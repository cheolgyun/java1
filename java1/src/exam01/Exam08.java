package exam01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("�ݺ����� ���۰��� �Է����ּ���.");
		String initStr = scan.nextLine();

		int initNum = Integer.parseInt(initStr);

		System.out.println("�ݺ����� ���ᰪ�� �Է����ּ���.");
		String finStr = scan.nextLine();

		int finNum = Integer.parseInt(finStr);

		int num = 0;
		for (int i = initNum; i <= finNum; i++) {
			num += i;
		}
		System.out.println(num);
	}
}

// and ������ && or ������ ||(shift + \)