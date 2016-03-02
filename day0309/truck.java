package day0309;

import java.util.Scanner;

public class truck {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int a,b,c;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	 if(a<=168 ){
	
		System.out.println("CRASH "+a);
	}
	else if(a>168 && b<=168 ){
		System.out.println("CRASH "+b);
	}
	else if(a>168 && b>168 && c<=168) {
		System.out.println("CRASH "+c);
	} else if( a>168 && b>68 &&c>168){
		System.out.println("NO CRASH");
	}
}
}
