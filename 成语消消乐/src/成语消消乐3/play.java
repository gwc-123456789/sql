/*Ŀ�ģ�
 * дһ������������
 * ���裺
 * 1 ��ȡ��ȡ�����ַ� string[] ads
 * 2 ��ads��ȡn������
 * 3 ����ȡ�ĳ�����char��������  6 ����Ԫ��
 * 4 ����һ������װѡ�е��±�
 * 5 ɾ��ѡ���±�
 * 6 ����Ԫ��
 * 7 ѭ��ֱ������Ϊ��
 * */
package ����������3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import com.utils.CYDB;

public class play {
public static void main(String[] args) {
	String[] ads = CYDB.getDB();// ��ȡ�����ַ���
	int guanka=2;//�ؿ�
	int u=2;
	for(int k=0;k<guanka;k++) {
		int nadu=u+k;//�ؿ��Ѷ�
    String ads1Huoqu=huoqu( ads ,nadu );//��ȡ����,�����Ѷ�
    Map<Integer,Character>  list=  luanxu( ads1Huoqu);//���ҳ���
    for(int i=0;i<nadu;i++) {
    int[] index=xiabiaozu();//ѡ���±�
   boolean t= pipei( ads1Huoqu, index, list);//ƥ��
   if(t==false) {
		  System.out.println("����ʧ��"); 
		  break;
	   }else {
		   System.out.println("��ȷ");
	   }
   Map<Integer,Character> look= shanchu( list,index);//ɾ��
   }
    }
}

public  static String huoqu(String[] ads ,int t) {//��ȡ������������string��tΪ����
	String[] d=new String[t];
	Random k=new Random();   
	  for(int i=0;i<t;i++) {
		  int	index=k.nextInt(ads.length);
		d[i]=ads[index];
	}
	  
	  String ads1="";//ȫ������
		for(int i=0;i<t;i++) {
			ads1+=d[i];
		} 
   return ads1;
}

public static int[] xiabiaozu() {//ѡ���±�
	Scanner k=new Scanner(System.in);
	int[] index=new int[4];
	
	System.out.println("��ѡ����Ҫɾ�������±�");
	 index[0]=k.nextInt();
	 index[1]=k.nextInt();
	 index[2]=k.nextInt();
	 index[3]=k.nextInt();
	 return index;
} 

public static boolean pipei(String ads1,int[] index,Map<Integer,Character> list) {//ƥ��
	String k="";
	for(int t=0;t<4;t++) {
		k+=list.get(index[t]);	
	}
	boolean n = false;
	if (ads1.contains(k)) {
		return !n;
	} else {
		return n ;
	}
}

public static Map<Integer,Character> luanxu(String ads1) {//���ҳ���
	char[] ads2=ads1.toCharArray();
	
	ArrayList<Character>  list=new ArrayList();
  for(int i=0;i<ads2.length;i++) {
	list.add( ads2[i]);
  }
Collections.shuffle(list);
xianshi2(list);
Map<Integer,Character> list1=new HashMap<Integer,Character>() ;
for(int i=0;i<list.size();i++) {
	list1.put(i, list.get(i));
}

return list1;
}
public static Map<Integer,Character> shanchu(Map<Integer,Character> list1,int[] index) {//ɾ������
	
	
	for(int i=0;i<index.length;i++) {
		list1.remove(index[i]);
	}
	 xianshi1( list1);
	 System.out.println();
	return list1;
}

public static void xianshi2(ArrayList<Character> list) {//��ʾ����
	Iterator<Character> it= list.iterator();
	int i=0;
	while(it.hasNext()) {
	    char t= it.next();
	   // System.out.print(t);
	    if((i+1)%4==0) {
	    	System.out.println(i<10?i+" "+"  "+t+"  ":i+"  "+t +"  ");
	}
	    else {
		System.out.print(i<10?i+" "+"  "+t+"  ":i+"  "+t+"  " );
	}
	    i++;
	}
}

public static void xianshi1(Map<Integer,Character> look) {//��ʾ����
	Set<Entry<Integer,Character>> entrySet = look.entrySet();// entrySet()�������ط�Ӧmap��ֵ��ӳ���ϵ���洢��set������
	Iterator<Entry<Integer, Character>> iter=entrySet.iterator();
	int i=0;
	while(iter.hasNext()) {
		Entry<Integer,Character> me=iter.next();
		int key=me.getKey();
	    char value=me.getValue();
	    if((i+1)%4==0) {
		System.out.println(key<10? key+" "+"  "+value+"  ":key+"  "+value+"  "); 
		}else {
		System.out.print(key<10? key+" "+"  "+value+"  ":key+"  "+value+"  "); 
		}
	}
}
}
