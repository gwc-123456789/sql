package 成语消消乐;

import java.util.Random;

public class zhengxun {
	public static String sqstring(String[] aq,int a) {
		char t = 0;
		int k=0;
		Random d=new Random();
		int ind = d.nextInt(aq.length);
		String code="" ;
		String code1="" ;
	    for(int i=0;i<a;i++) {//随机获取a位数“成语字符”
			//每次产生一个随机下标。
			int in = d.nextInt(aq.length);
			//从数组取出随机下标对应的字符。
			code = aq[in];
			code1+=aq[in];
//			System.out.println(code);
	}	
//	  System.out.print(code1);
	  return code1;
}
}
