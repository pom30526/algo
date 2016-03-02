package day0317;

import java.util.Scanner;

public class ton1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a;
	a=sc.nextInt();
	int sum=0;
	for(int i=1;i<=a-1;i++){
		sum+=i;
		System.out.print(i+"+");
	}
	System.out.print(a+"="+(sum+a));
}
}
