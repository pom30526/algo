package day0305;
import java.util.Scanner;


public class salnt {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	
	int x,y;
	x=(b-d)/(a-c); //기울기 
	y=b-a*x; //기울기에서 얼마나 더받는가
	System.out.println(x+" "+y);
	
}
}
