package 成语消消乐;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class luanxunshuangchuxianshi {
	/*public static void main(String[] args) {
		Map<Integer,String> dbmap = new HashMap<Integer,String>();
		String str = "金玉满堂百里挑一背水一战金蝉脱壳";
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
		
		Set<Entry<Integer,Character>> entrySet = t.entrySet();// entrySet()方法返回反应map键值的映射关系，存储在set集合中
		Iterator<Entry<Integer,Character>> it = entrySet.iterator();// 使用迭代器获得每一个映射关系
		int i=0;
		while(it.hasNext()) {
			 Entry<Integer,Character> me =  it.next();// 映射关系类型为Map.Entry类型，是一个接口类型
			 Integer key = me.getKey();
			 char value = me.getValue();
			 //打印格式：  下标 字符    
			 System.out.print((key<10 ? key+" ":key) +"" +value+"     ");
			 i++;
			 if(i%4 ==0)System.out.println();
		
		}
	 
			
	}
}
