package day0414;

import java.util.Scanner;
/*
 * 10진수로 변환
 */
public class todec {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a =sc.next();
	String a1[] =new String[a.length()];
	int j=0;
	int sum=0;
	int w=0;
	for(int i=0; i<a.length();i++){
		a1[i]=a.substring(i,i+1);
	}
		for(int i=0; i<a1.length;i++){
			if(Integer.parseInt(a1[i])==1){
				w=a1.length-1-i;
			j=(int)Math.pow(2, w);
			sum +=j;
			}
		}
		System.out.println(sum);
}
}
