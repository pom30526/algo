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
	x=(b-d)/(a-c); //���� 
	y=b-a*x; //���⿡�� �󸶳� ���޴°�
	System.out.println(x+" "+y);
	
}
}
