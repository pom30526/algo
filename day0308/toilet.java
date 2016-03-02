package day0308;

import java.util.Scanner;

public class toilet {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	int a;
	a=sc.nextInt();
	float result=(float) (a%3==0? (Math.floor(a/3)):(Math.floor(a/3)+1));
	float result2=(float)(a%2==0? (Math.floor(a/2)):(Math.floor(a/2)+1));
	System.out.println((int)result2+" "+(int)result);
}
}	
