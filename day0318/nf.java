package day0318;

import java.util.Scanner;

/*
 *  제곱수 약수의 개수 약수의 개수가 홀수인 것을 찾아라!
 */
public class nf {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int count=0;
	for(int i=1; i<=10000;i++){
		if(a%i==0){
			count++;
		}
	}
	if(count %2 ==0){
		System.out.println("no");
	}else{
		System.out.println("yes");
	}
}
}
