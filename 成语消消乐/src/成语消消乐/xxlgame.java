/*Ŀ�ģ�
 * ��һ��������������Ϸ
 *˼·��
 *1.String[] dbs = CYDB.getDB();
 *2.string[] a Ϊһ����ȡ�������ַ���
 *3.string[] b Ϊһ�������a�ַ����ַ���Collections.shuffle(list);
 *4.string[] c Ϊһ��һ�����ֳ���
 *5.c��b�л�ó����c�����ݺ�a�еı������ͬ��ƥ��ɹ���a��bɾ���ó��c 
 *������ȡƥ��ֱ��b��û�г������һ�֡�a������ȡֱ�������û�г��
 **/
package ����������;

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
		String[] ads = CYDB.getDB();// ��ȡ�����ַ���
		// System.out.println(Arrays.toString(ads));
		Scanner tr = new Scanner(System.in);
		System.out.println("���봳����");
		int w = tr.nextInt();

		for (int r = 2; r < w + 2;) {
			Scanner z = new Scanner(System.in);
			String code = zhengxun.sqstring(ads, r);// �ؿ��Ѷ�
			Map<Integer, Character> t = luanxun.luanxu(code);
			for (int v = 0; v < t.size() / 4 + r - 1;) {
				System.out.println("��ѡ���ĸ�����ɳ���");
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
				// System.out.println("��ѡ��"+t);
				if (h) {
					luanxunshuangchuxianshi.luanxu(e, t);										
				} else {
					System.out.println("����ʧ��");
					break;
				}
				v++;
			}
			r++;
		}
	}
}
