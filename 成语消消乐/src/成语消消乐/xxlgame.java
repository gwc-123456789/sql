/*目的：
 * 做一个成语消消乐游戏
 *思路：
 *1.String[] dbs = CYDB.getDB();
 *2.string[] a 为一个获取成语库的字符串
 *3.string[] b 为一个乱序的a字符的字符串Collections.shuffle(list);
 *4.string[] c 为一个一个四字成语
 *5.c从b中获得成语，拿c中内容和a中的比如果相同，匹配成功。a，b删除该成语，c 
 *继续获取匹配直到b中没有成语，结束一轮。a继续获取直到成语库没有成语。
 **/
package 成语消消乐;

import java.awt.List;
//import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import javax.xml.ws.soap.AddressingFeature;

//map<>
import com.utils.CYDB;

public class xxlgame {
	 static int count=0;
	public static void main(String[] args) {
		String[] ads = CYDB.getDB();// 获取所有字符；
		// System.out.println(Arrays.toString(ads));
		Scanner tr = new Scanner(System.in);
		System.out.println("你想闯几关");
		int w = tr.nextInt();

		for (int r = 2; r < w + 2;) {
			Scanner z = new Scanner(System.in);
			String code = zhengxun.sqstring(ads, r);// 关卡难度
			Map<Integer, Character> t = luanxun.luanxu(code);
			for (int v = 0; v < t.size() / 4 + r - 1;) {
				System.out.println("请选择四个数组成成语");
				int a = z.nextInt();
				int b = z.nextInt();
				int c = z.nextInt();
				int d = z.nextInt();
				int[] e = new int[4];
				e[0] = a;
				e[1] = b;
				e[2] = c;
				e[3] = d;
				String g = "";
				for (int i = 0; i < 4; i++) {
					g += t.get(e[i]);
				}
				System.out.print(g);
				boolean h= zhengxunchongpipei.ppsq(code, g);
				System.out.println("   "+h);
				// System.out.println("请选择"+t);
				if (h) {
					luanxunshuangchuxianshi.luanxu(e, t);										
				} else {
					System.out.println("本关失败");
					break;
				}
				v++;
			}
			r++;
		}
	}
}
