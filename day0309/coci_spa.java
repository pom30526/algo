package day0309;

import java.util.Scanner;
/*
 * 45분전 시각구하기
 */
public class coci_spa {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b  ;// a-> Hour b->min
	a=sc.nextInt();
	b=sc.nextInt();
	int c =45;
	int result;
	if(a==0){
		a=24;
	}
	result =a*60+b-c;
	System.out.printf("%d %d",result/60,result%60);

	
}
}
