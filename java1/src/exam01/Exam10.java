package exam01;

public class Exam10 {

	public static void main(String[] args) {

		int[] nums = new int[5];

		// int nums[0] = 10;
		// int nums[1] = 20;
		// int nums[2] = 30;
		// int nums[3] = 40;
		// int nums[4] = 50;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (i + 1) * 10;
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);

		}

	}

}
