package ����������;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class luanxunshuangchuxianshi {
	/*public static void main(String[] args) {
		Map<Integer,String> dbmap = new HashMap<Integer,String>();
		String str = "�������ð�����һ��ˮһս����ѿ�";
		for(int i=1;i<=str.length();i++) {
			dbmap.put(i, str.charAt(i-1)+"");
		}
		
		int []arr =new int[] {1,2,3,4};
		luanxu(arr, dbmap);
	} */
	public static void  luanxu(int[] a, Map<Integer, Character> t) {
		
		for (int i = 0; i < 4; i++) {
			
			t.remove(a[i]);
		}
		
		Set<Entry<Integer,Character>> entrySet = t.entrySet();// entrySet()�������ط�Ӧmap��ֵ��ӳ���ϵ���洢��set������
		Iterator<Entry<Integer,Character>> it = entrySet.iterator();// ʹ�õ��������ÿһ��ӳ���ϵ
		int i=0;
		while(it.hasNext()) {
			 Entry<Integer,Character> me =  it.next();// ӳ���ϵ����ΪMap.Entry���ͣ���һ���ӿ�����
			 Integer key = me.getKey();
			 char value = me.getValue();
			 //��ӡ��ʽ��  �±� �ַ�    
			 System.out.print((key<10 ? key+" ":key) +"" +value+"     ");
			 i++;
			 if(i%4 ==0)System.out.println();
		
		}
	 
			
	}
}
