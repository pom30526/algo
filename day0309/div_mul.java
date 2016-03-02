package day0309;

import java.util.Scanner;

public class div_mul {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int a,b;
	a=sc.nextInt();
	b=sc.nextInt();
	if(a==0 ){
		System.out.println(a+" !| "+b);
	}
	else if(b==0){
		System.out.println(a+ " | "+b);
	}
	else if( b%a ==0){
		System.out.println(a+" | "+b);
	}
	else if(b%a !=0){
		System.out.println(a+" !| " +b);
		
	}
}
}
