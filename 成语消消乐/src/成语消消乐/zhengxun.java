package ����������;

import java.util.Random;

public class zhengxun {
	public static String sqstring(String[] aq,int a) {
		char t = 0;
		int k=0;
		Random d=new Random();
		int ind = d.nextInt(aq.length);
		String code="" ;
		String code1="" ;
	    for(int i=0;i<a;i++) {//�����ȡaλ���������ַ���
			//ÿ�β���һ������±ꡣ
			int in = d.nextInt(aq.length);
			//������ȡ������±��Ӧ���ַ���
			code = aq[in];
			code1+=aq[in];
//			System.out.println(code);
	}	
//	  System.out.print(code1);
	  return code1;
}
}
