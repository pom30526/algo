package day0305;
import java.util.Scanner;


public class average {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	
	float result=(a+b+c+d)/4.0f;
	System.out.println(String.format("%.2f", result));
}
}
