package day0310;

import java.util.Scanner;

public class kangaroo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	if(c-b>b-a){
		System.out.println(c-b-1);
	}
	else{
		System.out.println(b-a-1);
	}
}
}
