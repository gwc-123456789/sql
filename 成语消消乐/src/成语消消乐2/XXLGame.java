package ����������2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.utils.CYDB;

/**
 * �������ģ�ͣ�
 * �ٲ�ģ�ͣ��������->�ĵ�-->����-->����-->����
 * 		��������������Ƶ������Ŀ��
 * ����ʵ��ԭ�� 
 * 		ȷ��һ���ܹ����������ĺ��İ汾�����ϵ������޸ġ�
 * 		������������Ƶ������Ŀ��
 * @author Administrator
 *
 */
public class XXLGame {
	public static void main(String[] args) {
		//��򵥵�ԭ�ͣ�
		//�йؿ��������ܹ���ӡ��ǰ�ؿ��ĳ������ͨ������ѡ����
		//�����ж��Ƿ�ѡ����ȷ��
		int level = 0;//�ؿ���
		String [] dbs = CYDB.getDB();//����⡣
		String []current_db = null;//��ǰ�ؿ��ĳ��
		current_db = ArrayUtils.get(dbs, 0, 1);
		char []printChar = toChar(current_db);//�ַ���ת�ַ���
		char []backup = new char[printChar.length];//�ַ����鱸�ݡ�
		System.arraycopy(printChar, 0, backup, 0, backup.length);
		ArrayUtils.massSort(printChar);//����
		for(int i=1;i<=printChar.length;i++) {
			char ch = printChar[i-1];
			String str = "";//�±� + �ַ�
			if(i<10) {
				str =(i+" ")+ch;
			}else {
				str =(i)+""+ch;
			}
			str+="    ";
			System.out.print(str);
			if(i%4==0)System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int []cmd = getNumFromStr(line);//�ӿ���̨��ȡ�±ꡣ
		//�����±굽�ַ�������ȥ�ַ���ȡ4����
		String str = getStrFromBackup(cmd,printChar);
		System.out.println("��ѡ����ǣ�"+str);
		
	}
	private static String getStrFromBackup(int[] cmd,char []backup) {
		String str = "";
		for(int i=0;i<cmd.length;i++) {
			 int index = cmd[i];//�±ꡣ
			 str+= backup[index-1];
		 }
		return str;
	}
	/**
	 * ���ݿո�ָ����֡������ַ��������С����ظ����顣
	 * @param line
	 * @return
	 */
	private static int[] getNumFromStr(String line) {
		int []nums = new int[4];
		StringTokenizer stks = new StringTokenizer(line);
		if(stks.countTokens()!=4) {
			throw new RuntimeException("������±������4��");
		}
		int index = 0 ; 
		while(stks.hasMoreTokens()) {
			String tk = stks.nextToken();
			int cmd = Integer.parseInt(tk);
			nums[index++] = cmd;
		}
		return nums;
	}
	/**
	 * ���ַ�������ת���ַ����顣
	 * @param current_db
	 * @return
	 */
	private static char[] toChar(String[] current_db) {
		char []chs = new char[current_db.length*4];
		for(int i=0;i<current_db.length;i++) {
			String str = current_db[i];//ÿ�α��������ĳ��
			for(int j=0;j<4;j++) {//ÿ���������ĸ��ַ���
				char ch = str.charAt(j);
				chs[ i*4 + j ] = ch;
			}
		}
		return chs;
	}
}
