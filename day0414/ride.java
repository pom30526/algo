package day0414;

import java.util.Scanner;

public class ride {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a = sc.next();
	String b =sc.next();
	double a2 = 1;
	double a3 =1;
	for(int i=0; i<a.length();i++){
		a2 *=a.charAt(i);
	}
	for(int i=0;i<b.length();i++){
		a3 *=b.charAt(i);
	}
	if((a2%47)==(a3%47)){
		System.out.println("GO");
	}else{
		System.out.println("STAY");
	}
	
}
}
