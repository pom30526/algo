package day0317;

import java.util.Scanner;
/*
 * 약수 종합 셋트
 */
public class ft {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a;
	a=sc.nextInt();
	int count=0;
	int sum=0;
	int mult=1;
	for(int i=1;i<=a;i++){
		if(a%i==0){
			System.out.print(i+" ");
			sum+=i;
			mult=mult*i%10;
			count++;
			if(i==a){
				System.out.println();
			}
		}
	}
	System.out.println(count);
	System.out.println(sum);
	System.out.println(mult);
}
}
