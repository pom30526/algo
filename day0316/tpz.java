package day0316;

import java.util.Scanner;

public class tpz {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int a,b,c,d;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	
	int maxpeople = Math.min(d,Math.min(b, c));
	int maxvalue =Math.max(d,Math.max(b, c));
	//int middle =b+c+d-maxpeople-maxvalue;
	int minpeople =(b+c+d)-2*a;
	if(minpeople <0){
		minpeople=0;
	}
	else{
		minpeople =(b+c+d)-2*a;
	}

	
	System.out.println(maxpeople +" "+minpeople);
}
}
