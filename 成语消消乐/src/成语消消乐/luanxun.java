package 成语消消乐;

import java.awt.List;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
public class luanxun {
//private static final int Integer = 0;

public static Map<Integer, Character> luanxu(String code) {
 //string先变char array
  String code1=code;
char[] strtoarray=code1.toCharArray();
 //new arraylist装char 
/* int label[]=new int[strtoarray.length]; 
//在这个数组里面存打乱的1-8的数字   */
  ArrayList list=new ArrayList();
  for(int j=0;j<strtoarray.length;j++) {
	 list.add(strtoarray[j]); 
  }
  Collections.shuffle(list);//list乱序
/* Iterator h=list.iterator();
 while(h.hasNext()) {  
  System.out.print( h.next());
  }
  System.out.println("");*/
  Map<Integer,Character> t=new HashMap<Integer,Character>();
  	
/*
  //t.put(label[i],strtoarray[i]);
  //label[i],t.get[label[i]];
  //String nnn="";
  //String nnn+=strtoarray[i];
   */
 for(int p=0;p<list.size();p++) { 
	  t.put(p, (Character) list.get(p));
/*	char  l=(char)(list.get(p));
	 System.out.println(p+"-------"+l);*/
 }
  for(int p=0;p<list.size();p++) { 
	  if((p+1)%4==0) {
		  System.out.println("  "+p+"  "+list.get(p)+"  ");  
	  }else {
	 System.out.print("  "+p+"  "+list.get(p)+"  ");}
 }
//  System.out.println(t.entrySet());
	return t;
}
}
