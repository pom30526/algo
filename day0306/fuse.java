package day0306;

import java.util.Scanner;

public class fuse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c;//a-> com b->print ->router;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	float result=(2*(2.5f*a+2.0f*b+0.5f*c));
	int result2=(int)(result+9)/10*10; //올림 하는것 무조건 올림
	System.out.printf("%d amperes",result2);
	
	
}
}
