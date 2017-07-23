package exam01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("반복문의 시작값을 입력해주세요.");
		String initStr = scan.nextLine();

		int initNum = Integer.parseInt(initStr);

		System.out.println("반복문의 종료값을 입력해주세요.");
		String finStr = scan.nextLine();

		int finNum = Integer.parseInt(finStr);

		int num = 0;
		for (int i = initNum; i <= finNum; i++) {
			num += i;
		}
		System.out.println(num);
	}
}

// and 조건은 && or 조건은 ||(shift + \)