package exam03;

public class Son extends Father {

	public Son() { // ������... return Ÿ���� �������� ����... ���� void�� ������ �ʾƵ� ��.. ��? ���� ���� �ִϱ�..

	}

	// ���
	String house = "�Ÿ���ÿ�";

	public void printHouse() {
		System.out.println(house);
	}

	// �������̵� : �Լ��� ������

	// public void doJob() {
	// System.out.println("�� ���� �ٺ� �Ӹ�");
	// }
	//
	// public void doSleep() {
	// System.out.println("�� �ǰ��� �ھߵ�");
	// }

	public static void main(String[] args) {
		Son s = new Son();

		System.out.print(s.who);

		// System.out.println(s.money);
		// System.out.println(s.car);
		// System.out.println(s.house);
		// s.printHouse();
		// s.who = "��"
		// s.doJob();
		// s.doSleep();

	}
}
