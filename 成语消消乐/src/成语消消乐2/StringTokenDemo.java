package ����������2;

import java.util.StringTokenizer;

public class StringTokenDemo {
	public static void main(String[] args) {
		String str = "12   1   5  6";
		//ϣ���Կո��#��Ϊ������
		StringTokenizer stks = new StringTokenizer(str, " #");
		while(stks.hasMoreTokens()) {
			String tk = stks.nextToken();
			int cmd = Integer.parseInt(tk);
			System.out.println("�ָ����ַ�Ϊ��"+tk);
			System.out.println("������"+stks.countTokens());
		}
	}
}
