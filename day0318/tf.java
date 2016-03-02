package day0318;

import java.util.Scanner;

/*
 *  n = o*2^p 구하기  다홀수로 바꾸면댐
 */
public class tf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt(); //이값이 n ,n이있을 때 o와 p를 구하기
		int p=0;
		
		while(a%2==0){
			a/=2;
			p++;
		}
		System.out.println(a+" "+p);
		
	}

}
