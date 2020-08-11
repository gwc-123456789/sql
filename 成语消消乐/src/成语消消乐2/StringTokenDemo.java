package 成语消消乐2;

import java.util.StringTokenizer;

public class StringTokenDemo {
	public static void main(String[] args) {
		String str = "12   1   5  6";
		//希望以空格和#作为风格符。
		StringTokenizer stks = new StringTokenizer(str, " #");
		while(stks.hasMoreTokens()) {
			String tk = stks.nextToken();
			int cmd = Integer.parseInt(tk);
			System.out.println("分割后的字符为："+tk);
			System.out.println("快数："+stks.countTokens());
		}
	}
}
