package exam01;

public class Exam07 {
	public static void main(String[] args) {
		
		//자기 자신하테 하나씩 더해주는 애들
		int num = 1;
		System.out.println(num);
		num = num + 1;
		System.out.println(num);
		num++;
		System.out.println(num);
		num += 1;
		System.out.println(num);
		
		//반복문 - 반복문 안에 if 사용가능 반대도 가능 단, 문법을 지켜야함
		//나머지 계산은  4%2 즉, %가 모드 연산자가 된다.
		for(int i=0;i<10;i++) {
			System.out.println(i);
			}
		
		for(int i=0;i<10;i+=2) {
			System.out.println(i);
		    }
		
		// &&는 and 조건
		for(int i=0;i<10;i++) {
			if(i!=0) {
			 if(i%3==0) {
			 System.out.println("3의배수" + i);
			 }
			 if(i%2==0) {
			 System.out.println("2의배수" + i);
			 }
   		 	}
			
			
		}
	}

}
