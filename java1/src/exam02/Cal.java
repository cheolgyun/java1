package exam02;

public class Cal {

	int num1;
	int num2;
	String op;

	public void printCal() {

		if (op.equals("+")) {
			System.out.println(num1 + num2);

		} else if (op.equals("-")) {
			System.out.println(num1 - num2);

		} else if (op.equals("/")) {
			System.out.println(num1 / num2);

		} else {
			System.out.println(num1 * num2);

		}
	}

	public static void main(String[] args) {

		Cal c = new Cal();
		c.num1 = 10;
		c.num2 = 5;
		c.op = "-";
		c.printCal();

	}
}
