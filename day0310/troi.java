package day0310;

import java.util.Scanner;

public class troi {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a,b,c;
	a=sc.nextInt();
	b=sc.nextInt();
	c= sc.nextInt();
	int max=Math.max(Math.max(a, b), c);
	int min=Math.min(Math.min(a, b), c);
	int middle=(a+b+c)-max-min;
	
	if(max <(middle+min)){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
	
}
}
