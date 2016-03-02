package day0325;

import java.util.Scanner;

public class text {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a,b;
	int c=sc.nextInt();
	for(int i=0;i<c;i++){
		a=sc.next();
		b=sc.next();
		int d=sc.nextInt();
		System.out.println("#testcase"+(i+1));
		System.out.println(a+""+b);
		System.out.println(a.substring(0, d)+b.substring(d));
		
	}
	
}
}
