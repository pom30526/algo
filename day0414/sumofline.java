package day0414;

import java.util.Scanner;
import java.util.StringTokenizer;
/*
 * 한줄 당 합 구하기
 */
public class sumofline {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	String b;
	int a1 [] = new int[a+1];
	StringTokenizer st ;
	for(int i=0; i<=a;i++){
	b=sc.nextLine();
	st=new StringTokenizer(b," ");
	while(st.hasMoreTokens()){
		a1[i]+=Integer.parseInt(st.nextToken());
	}
	}
	for(int i=1; i<a1.length;i++){
		System.out.println(a1[i]);
	}
	
}
}
