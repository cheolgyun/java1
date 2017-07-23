package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class ListExam {

	public static void main(String[] args) {
		
		ArrayList<integer> al; //   컨트롤 쉬프트 o 눌러주기
		al = new ArrayList<integer>(); // ArrayList al = new ArrayList();
		
		// al.add(1);
		// al.add(2);
		// al.add(3);
		// al.add(4);
		// al.add(5);
		// System.out.println(al.get(5));

		for (int i = 1; i <= 5; i++) {
			al.add(i);
		}

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
//		Vector v = new Vextor(); // Vector는 자동으로 동기화를 해준다. java1.1에서 만들어진거니까 사용하지마라. 느리다. ArrayList 사용해라.
		
		// 배열처럼 쓰고 싶은데 키값을 내가 정하고 싶을경우, 기존에 수업내용상에서는 0부터 사용만 가능하다. (key, Value)
		
//		HashMap hm = new HashMap();
//		hm.put(0, 1);
//		hm.put(0, 2);
//		hm.put(0, 3);
//		hm.put(0, 4);
//		System.out.println(hm.get(0));
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("0", "1");
		
//		HashMap<String, String> hm = new HashMap<String, String>();
//		hm.put("0", "1")
//		ArrayList<HashMap> al = new ArrayList<HashMap>();
//		al.add(hm);
		
		
	}

}
