package ����������2;

import java.util.Arrays;
import java.util.Random;
/**
 * �������ɾ�Ĳ顣
 * @author Administrator
 *
 */
public class ArrayUtils {
	public static void main(String[] args) {
		int []arr = new int[] {22,33,6,55,66,9,7,8,336,1};
		massSort(arr);//����
		System.out.println(Arrays.toString(arr));
		
	}
	/**
	 * ɾ��������ָ���±��Ӧ��Ԫ�ء�
	 * @param arr
	 * @param index
	 * @return ����ɾ��������顣�Ա㸲�ǡ�
	 */
	public static int [] deleteByIndex(int []arr,int index){
		//�´���һ�����顣����Ϊԭ���鳤��-1
		int [] rs = new int[arr.length-1];
		//�������ơ������±ꡣ
		for(int i=0;i<rs.length ;i++) {
			/* if(i>=index)rs[i] = arr[i+1];
			   else   rs[i]=arr[i];*/
			//rs[i] = (i>=index)? arr[i+1]: arr[i];
			rs[i] = arr[  i>=index ? i+1 : i ];
		}
		//���������顣
		return rs;
	}
	
	/**
	 * �������е�ָ���±������һ����Ԫ�ء���Ԫ�������ĩβ��
	 * @param arr
	 * @param value
	 * @return
	 */
	public static int []add(int []arr, int value){
		return add(arr, arr.length, value);
	}
	/**
	 * �������е�ָ���±������һ����Ԫ�ء�
	 * @param arr
	 * @param index
	 * @param value
	 * @return ���������顣
	 */
	public static int []add(int []arr,int index,int value){
		if(index <0 || index > arr.length+1)
			throw new RuntimeException("�±�Խ���ˡ�");
		//1 ���������顣����ԭ���鳤�� + 1��
		int []rs = new int[arr.length+1];
		//2 ���Ԫ�ء�
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
	 * ����
	 * @param arr
	 */
	public static  void massSort(int []arr){
		 //�������顣
		 Random r = new Random();
		 for(int i=0;i<arr.length-1;i++) {
			 int index = r.nextInt( arr.length-1);
			 //�����������ݡ�
			 int oldvalue =  arr[index];
			 arr[index] = arr[arr.length-1];
			 arr[arr.length-1] = oldvalue;
		 }
//		 return ;
	}
	
	/**
	 * ����
	 * @param arr
	 */
	public static void massSort(char []arr){
		 //�������顣
		 Random r = new Random();
		 for(int i=0;i<arr.length-1;i++) {
			 int index = r.nextInt( arr.length-1);
			 //�����������ݡ�
			 char oldvalue =  arr[index];
			 arr[index] = arr[arr.length-1];
			 arr[arr.length-1] = oldvalue;
		 }
		 
	}
	
	
	/**
	 * �������л�ȡָ�������Ԫ�ء�
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	public static String [] get(String []arr,int start,int end) {
		//����һ�����顣����Ϊ��end-start
		String []rs = new String[end-start];
		//���ơ�
		for(int i=0;i<rs.length ; i++) {
			rs[i] = arr[start +i];
		}
		return rs;
	}
  
}
