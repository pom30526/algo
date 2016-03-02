package day0401;

import java.util.Scanner;
/*
 * 평평하게하기
 */
public class box_brick {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a=sc.nextInt();
	int a1[] =new int[a];
	int sum=0;
	int average=0;
	int sum2=0;
	for(int i=0;i<a1.length;i++){
		a1[i]=sc.nextInt();
	}
	for(int i=0;i<a1.length;i++){
		sum +=a1[i];
	}
	average=sum/a;
	for(int i=0; i<a1.length;i++){
		if(a1[i] >average){
			sum2 +=a1[i]-average;
		}
	}
	System.out.print("The minimum number of moves is "+sum2+".");
}
}
