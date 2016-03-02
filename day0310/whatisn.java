package day0310;

import java.util.Scanner;

public class whatisn {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float a=sc.nextFloat();
	double result= Math.ceil((a+1)/2);
	if(a <=5){
	System.out.println((int)result);
	}
	else if(a==6){
		System.out.println((int)result-1);
	}
	else if(a==7) {
		System.out.println((int)result-2);
	}
	else if(a==8){
		System.out.println((int)result-3);
	}
	
	else if(a==9 ){
		System.out.println((int)result-4);
	}
	else if(a ==10){
		System.out.println((int)result-5);
	}
}
}
