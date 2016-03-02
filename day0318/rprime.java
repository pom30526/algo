package day0318;

import java.util.Scanner;

/*
 *  서로소 판명문제
 */
public class rprime {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	a=sc.nextInt();
	b=sc.nextInt();
	int count=0;
	for(int i=2; i<=Math.max(a, b);i++){
		if(a%i==0 && b%i==0){
			count ++;
		}
	}
	if(count==0){
		System.out.println("yes");
	}else{
		System.out.println("no");
	}
}
}
