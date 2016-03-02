package day0310;

import java.util.Scanner;

public class rao {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	int max,min,middle;
	max=Math.max(Math.max(a,b), c);
	min =Math.min(Math.min(a, b), c);
	middle=(a+b+c)-max-min;
	
	if(Math.pow(min, 2)+Math.pow(middle, 2) == Math.pow(max, 2)){
		System.out.println("right");
	}
	else if(Math.pow(min, 2)+Math.pow(middle, 2) > Math.pow(max, 2)){
		System.out.println("acute");
	}
	else{
		System.out.println("obtuse");
	}
}
}
