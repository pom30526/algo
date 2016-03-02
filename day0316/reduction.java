package day0316;

import java.util.Scanner;

public class reduction {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	
	int copy=a*b;
	int paper =c*d;
	if(copy<paper){
		System.out.println("100%");
	}
	else if((copy/16)>paper){
		copy/=32;
		System.out.println("3%");
	}
	else if((copy/8)>paper){
		copy/=16;
		System.out.println("6%");
	}
	else if((copy/4)>paper){
		copy /=8;
		System.out.println("12%");
	}
	else if((copy/2)>paper){
		copy/=4;
		System.out.println("25%");
	}
	else if(copy>paper){
		copy/=2;
		System.out.println("50%");
	}
	else{
		System.out.println("1%");
	}
	
}
}
