package exam01;

public class Exam07 {
	public static void main(String[] args) {
		
		//�ڱ� �ڽ����� �ϳ��� �����ִ� �ֵ�
		int num = 1;
		System.out.println(num);
		num = num + 1;
		System.out.println(num);
		num++;
		System.out.println(num);
		num += 1;
		System.out.println(num);
		
		//�ݺ��� - �ݺ��� �ȿ� if ��밡�� �ݴ뵵 ���� ��, ������ ���Ѿ���
		//������ �����  4%2 ��, %�� ��� �����ڰ� �ȴ�.
		for(int i=0;i<10;i++) {
			System.out.println(i);
			}
		
		for(int i=0;i<10;i+=2) {
			System.out.println(i);
		    }
		
		// &&�� and ����
		for(int i=0;i<10;i++) {
			if(i!=0) {
			 if(i%3==0) {
			 System.out.println("3�ǹ��" + i);
			 }
			 if(i%2==0) {
			 System.out.println("2�ǹ��" + i);
			 }
   		 	}
			
			
		}
	}

}
