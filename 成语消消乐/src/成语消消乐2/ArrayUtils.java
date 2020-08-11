package 成语消消乐2;

import java.util.Arrays;
import java.util.Random;
/**
 * 数组的增删改查。
 * @author Administrator
 *
 */
public class ArrayUtils {
	public static void main(String[] args) {
		int []arr = new int[] {22,33,6,55,66,9,7,8,336,1};
		massSort(arr);//乱序
		System.out.println(Arrays.toString(arr));
		
	}
	/**
	 * 删除数组中指定下标对应的元素。
	 * @param arr
	 * @param index
	 * @return 返回删除后的数组。以便覆盖。
	 */
	public static int [] deleteByIndex(int []arr,int index){
		//新创建一个数组。长度为原数组长度-1
		int [] rs = new int[arr.length-1];
		//跳过复制。跳过下标。
		for(int i=0;i<rs.length ;i++) {
			/* if(i>=index)rs[i] = arr[i+1];
			   else   rs[i]=arr[i];*/
			//rs[i] = (i>=index)? arr[i+1]: arr[i];
			rs[i] = arr[  i>=index ? i+1 : i ];
		}
		//返回新数组。
		return rs;
	}
	
	/**
	 * 往数组中的指定下标中添加一个新元素。新元素添加在末尾。
	 * @param arr
	 * @param value
	 * @return
	 */
	public static int []add(int []arr, int value){
		return add(arr, arr.length, value);
	}
	/**
	 * 往数组中的指定下标中添加一个新元素。
	 * @param arr
	 * @param index
	 * @param value
	 * @return 返回新数组。
	 */
	public static int []add(int []arr,int index,int value){
		if(index <0 || index > arr.length+1)
			throw new RuntimeException("下标越界了。");
		//1 创建新数组。长度原数组长度 + 1。
		int []rs = new int[arr.length+1];
		//2 添加元素。
		for(int i=0;i<rs.length;i++) {
			 if(i<index ) {
				 rs[i] = arr[i];
			 }else  if(i == index) {
				 rs[i] = value;
			 }else {
				 rs[i] = arr[i-1];
			 }
		}
		return rs;
	}
	
	/**
	 * 乱序。
	 * @param arr
	 */
	public static  void massSort(int []arr){
		 //创建数组。
		 Random r = new Random();
		 for(int i=0;i<arr.length-1;i++) {
			 int index = r.nextInt( arr.length-1);
			 //交换两个数据。
			 int oldvalue =  arr[index];
			 arr[index] = arr[arr.length-1];
			 arr[arr.length-1] = oldvalue;
		 }
//		 return ;
	}
	
	/**
	 * 乱序。
	 * @param arr
	 */
	public static void massSort(char []arr){
		 //创建数组。
		 Random r = new Random();
		 for(int i=0;i<arr.length-1;i++) {
			 int index = r.nextInt( arr.length-1);
			 //交换两个数据。
			 char oldvalue =  arr[index];
			 arr[index] = arr[arr.length-1];
			 arr[arr.length-1] = oldvalue;
		 }
		 
	}
	
	
	/**
	 * 从数组中获取指定区域的元素。
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	public static String [] get(String []arr,int start,int end) {
		//创建一个数组。长度为：end-start
		String []rs = new String[end-start];
		//复制。
		for(int i=0;i<rs.length ; i++) {
			rs[i] = arr[start +i];
		}
		return rs;
	}
  
}
