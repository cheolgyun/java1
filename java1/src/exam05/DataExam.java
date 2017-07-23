package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class DataExam {

	public static void main(String[] args) {

		String data = "박경훈,33,서울/";
		data += "김경훈,27,경기/";
		data += "홍길동,31,광주/";
		data += "김경훈,22,부산";

		// System.out.println(data);

		String[] datas = data.split("/"); // ,는 구분자.
		ArrayList<HashMap<String,String>> dataList = new ArrayList<HashMap<String,String>>();

		for (int i = 0; i < datas.length; i++) {
			String[] inDatas = datas[i].split(",");

			HashMap<String, String> hm = new HashMap<String, String>();

			for (int j = 0; j < inDatas.length; j++) {
				if (j == 0) {
					hm.put("이름", inDatas[j]);
				} else if (j == 1) {
					hm.put("나이", inDatas[j]);
				}
				dataList.add(hm);
				System.out.println("나이 " + hm.get("나이"));
				System.out.println("이름 " + hm.get("이름"));
			}

//			 for (HashMap hm : dataList) {
//			 System.out.println("주소" + hm.get("주소"));
//			 System.out.println("나이" + hm.get("나이"));
//			 System.out.println("이름" + hm.get("이름"));

		}
		// System.out.println(datas[i]);
	}
	// System.out.println(datas[3]);
}
