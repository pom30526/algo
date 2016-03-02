package day0310;

import java.util.Scanner;

public class fourth {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,a1,b,b1,c,c1,d,d1;
	a=sc.nextInt();
	a1=sc.nextInt();
	b=sc.nextInt();
	b1=sc.nextInt();
	c=sc.nextInt();
	c1=sc.nextInt();
	
	if(a==b ){
		System.out.print(c);
	}
	else if(a==c){
		System.out.print(b);
	}
	else if(b==c){
		System.out.print(a);
	}
	if(a1==b1){
		System.out.print(" "+c1);
	}
	else if(a1==c1){
		System.out.print(" "+b1);
	}
	else if(b1==c1){
		System.out.print(" "+a1);
	}
	
}
}
