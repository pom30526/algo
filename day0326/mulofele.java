package day0326;

import java.util.Scanner;
/*
 * 11의 배수 판정법
 */
public class mulofele {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a= sc.next();
	String t[] = new String[a.length()];
	int result=0;
	int result2=0;
	for(int i=0;i<a.length();i++){
		t[i]=a.substring(i, i+1);
	}
	for(int i=0;i<t.length;i+=2){
		result+=Integer.parseInt(t[i]);
	}
	for(int i=1;i<t.length;i+=2){
		result2-=Integer.parseInt(t[i]);
	}
	int sum=result+result2;
	if(sum==0){
		System.out.println("yes");
	}else if(sum %11==0){
		System.out.println("yes");
	}else{
		System.out.println("no");
	}
	
}
}
