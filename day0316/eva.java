package day0316;

import java.util.Scanner;

public class eva {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	int result;
	//등차수열
	if((d-c)==(b-a)){
	result=	a+4*(d-c);
	System.out.println(a+" "+b+" "+c+" "+d+" "+result);
	}
	else if((c/d)==(a/b)){
		result =d*(d/c);
		System.out.println(a+" "+b+" "+c+" "+d+" "+result);
	}
	else{
		System.out.println(a+" "+b+" "+c+" "+d+" "+a);
		
	}
}
}
