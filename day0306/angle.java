package day0306;

import java.util.Scanner;

public class angle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x;
	x=sc.nextInt();
	int c,d;
	c=(x-2)*180; //n각형 내각의 합
	d=360;       //n각의 외각의 합
	System.out.println(c+" "+d);
}
}
