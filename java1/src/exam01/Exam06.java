package exam01;

import java.util.Scanner;

public class Exam06 {
	
	public static void main(String[] args) {
		//주석
		/*주석2
		 * 
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요=>");
		String id =s.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		System.out.println("단 비밀번호는 숫자만 입력해주셔야 합니다");
		
		String pwd =s.nextLine();
		
		int pwdNum=0;
		
		try {
			pwdNum = Integer.parseInt(pwd);
		}catch(Exception e) {
			System.out.println("문자입력하지마");
		}
		
		System.out.println(id+pwd);
		System.out.println("입력하신 아이디 = " + id);
		System.out.println("입력하신 비밀번호 = " + pwd);
		System.out.println("입력하신 숫자 비밀번호 = " + pwdNum);
	}

}
