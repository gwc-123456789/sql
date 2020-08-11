/*目的：
 * 写一个成语消消乐
 * 步骤：
 * 1 获取获取所有字符 string[] ads
 * 2 从ads获取n个成语
 * 3 将获取的成语变成char，并打乱  6 显现元素
 * 4 定义一个数组装选中的下标
 * 5 删除选中下标
 * 6 显现元素
 * 7 循环直到成语为零
 * */
package 成语消消乐3;

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
	String[] ads = CYDB.getDB();// 获取所有字符；
	int guanka=2;//关卡
	int u=2;
	for(int k=0;k<guanka;k++) {
		int nadu=u+k;//关卡难度
    String ads1Huoqu=huoqu( ads ,nadu );//获取成语,设置难度
    Map<Integer,Character>  list=  luanxu( ads1Huoqu);//打乱成语
    for(int i=0;i<nadu;i++) {
    int[] index=xiabiaozu();//选择下标
   boolean t= pipei( ads1Huoqu, index, list);//匹配
   if(t==false) {
		  System.out.println("闯关失败"); 
		  break;
	   }else {
		   System.out.println("正确");
	   }
   Map<Integer,Character> look= shanchu( list,index);//删除
   }
    }
}

public  static String huoqu(String[] ads ,int t) {//获取成语个数并变成string，t为个数
	String[] d=new String[t];
	Random k=new Random();   
	  for(int i=0;i<t;i++) {
		  int	index=k.nextInt(ads.length);
		d[i]=ads[index];
	}
	  
	  String ads1="";//全部成语
		for(int i=0;i<t;i++) {
			ads1+=d[i];
		} 
   return ads1;
}

public static int[] xiabiaozu() {//选择下标
	Scanner k=new Scanner(System.in);
	int[] index=new int[4];
	
	System.out.println("请选择你要删除成语下标");
	 index[0]=k.nextInt();
	 index[1]=k.nextInt();
	 index[2]=k.nextInt();
	 index[3]=k.nextInt();
	 return index;
} 

public static boolean pipei(String ads1,int[] index,Map<Integer,Character> list) {//匹配
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

public static Map<Integer,Character> luanxu(String ads1) {//打乱成语
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
public static Map<Integer,Character> shanchu(Map<Integer,Character> list1,int[] index) {//删除函数
	
	
	for(int i=0;i<index.length;i++) {
		list1.remove(index[i]);
	}
	 xianshi1( list1);
	 System.out.println();
	return list1;
}

public static void xianshi2(ArrayList<Character> list) {//显示内容
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

public static void xianshi1(Map<Integer,Character> look) {//显示内容
	Set<Entry<Integer,Character>> entrySet = look.entrySet();// entrySet()方法返回反应map键值的映射关系，存储在set集合中
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
