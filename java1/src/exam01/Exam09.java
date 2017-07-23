package exam01;

public class Exam09 {

	public static void main(String[] args) {
		int a = 1;

		int[] bank = new int[20];
		for (int i = 0; i <= bank.length - 1; i++) {
			bank[i] = i + 1;
		}
		System.out.println(bank[19]);

		for (int i = 0; i <= bank.length - 1; i++) {
			System.out.println(bank[i]);
		}
		
		
		
	}
}

// int bank1 = 1;
// int bank2 = 2;
// int bank3 = 3;
// int bank4 = 4;
// int bank5 = 5;
//
// int[] bank = new int[5];
// for(int i=0;i<=bank.length-1;i++)
// bank[i] = i+1;
//
// 위 두개는 같은 말이다.