package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class DataExam {

	public static void main(String[] args) {

		String data = "�ڰ���,33,����/";
		data += "�����,27,���/";
		data += "ȫ�浿,31,����/";
		data += "�����,22,�λ�";

		// System.out.println(data);

		String[] datas = data.split("/"); // ,�� ������.
		ArrayList<HashMap<String,String>> dataList = new ArrayList<HashMap<String,String>>();

		for (int i = 0; i < datas.length; i++) {
			String[] inDatas = datas[i].split(",");

			HashMap<String, String> hm = new HashMap<String, String>();

			for (int j = 0; j < inDatas.length; j++) {
				if (j == 0) {
					hm.put("�̸�", inDatas[j]);
				} else if (j == 1) {
					hm.put("����", inDatas[j]);
				}
				dataList.add(hm);
				System.out.println("���� " + hm.get("����"));
				System.out.println("�̸� " + hm.get("�̸�"));
			}

//			 for (HashMap hm : dataList) {
//			 System.out.println("�ּ�" + hm.get("�ּ�"));
//			 System.out.println("����" + hm.get("����"));
//			 System.out.println("�̸�" + hm.get("�̸�"));

		}
		// System.out.println(datas[i]);
	}
	// System.out.println(datas[3]);
}
