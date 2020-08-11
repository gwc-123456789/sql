package 成语消消乐2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.utils.CYDB;

/**
 * 软件开发模型：
 * 瀑布模型：需求分析->文档-->编码-->测试-->部署
 * 		适用于需求变更不频繁的项目。
 * 快速实现原型 
 * 		确定一个能够运行起来的核心版本，不断迭代和修改。
 * 		适用于需求变更频繁的项目。
 * @author Administrator
 *
 */
public class XXLGame {
	public static void main(String[] args) {
		//最简单的原型：
		//有关卡。并且能够打印当前关卡的成语。可以通过数字选择成语。
		//可以判断是否选择正确。
		int level = 0;//关卡。
		String [] dbs = CYDB.getDB();//成语库。
		String []current_db = null;//当前关卡的成语。
		current_db = ArrayUtils.get(dbs, 0, 1);
		char []printChar = toChar(current_db);//字符串转字符。
		char []backup = new char[printChar.length];//字符数组备份。
		System.arraycopy(printChar, 0, backup, 0, backup.length);
		ArrayUtils.massSort(printChar);//乱序。
		for(int i=1;i<=printChar.length;i++) {
			char ch = printChar[i-1];
			String str = "";//下标 + 字符
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
		int []cmd = getNumFromStr(line);//从控制台获取下标。
		//拿着下标到字符数组中去字符。取4个。
		String str = getStrFromBackup(cmd,printChar);
		System.out.println("您选择的是："+str);
		
	}
	private static String getStrFromBackup(int[] cmd,char []backup) {
		String str = "";
		for(int i=0;i<cmd.length;i++) {
			 int index = cmd[i];//下标。
			 str+= backup[index-1];
		 }
		return str;
	}
	/**
	 * 根据空格分割数字。将数字放入数组中。返回该数组。
	 * @param line
	 * @return
	 */
	private static int[] getNumFromStr(String line) {
		int []nums = new int[4];
		StringTokenizer stks = new StringTokenizer(line);
		if(stks.countTokens()!=4) {
			throw new RuntimeException("输入的下标必须是4个");
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
	 * 将字符串数组转成字符数组。
	 * @param current_db
	 * @return
	 */
	private static char[] toChar(String[] current_db) {
		char []chs = new char[current_db.length*4];
		for(int i=0;i<current_db.length;i++) {
			String str = current_db[i];//每次遍历出来的成语。
			for(int j=0;j<4;j++) {//每个成语有四个字符。
				char ch = str.charAt(j);
				chs[ i*4 + j ] = ch;
			}
		}
		return chs;
	}
}
