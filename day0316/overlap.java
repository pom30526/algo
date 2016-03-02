package day0316;

import java.util.Scanner;


public class overlap {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,a1,b1,c1,d1;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	a1=sc.nextInt();
	b1=sc.nextInt();
	c1=sc.nextInt();
	d1=sc.nextInt();
	if(c< a1 || a>c1 ||b>d1 || d<b1){
		//분리사각형
		System.out.println("No overlap");
	}
	else{
		System.out.println("Overlap");
	}
}
}
