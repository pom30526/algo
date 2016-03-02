package day0413;

import java.util.Scanner;

public class interset {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double r,m,y;
	r=sc.nextDouble();
	m=sc.nextDouble();
	y=sc.nextDouble();
	
	double result =m*Math.pow((1+(r/100)), y);
	
	System.out.println((int)result);
}
}
