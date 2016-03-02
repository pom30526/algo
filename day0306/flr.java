package day0306;

import java.util.Scanner;
//층수구하기
public class flr {
 //로그2없어서 만든것
	  public static double logB(double x, double base) {
	    return Math.log(x) / Math.log(base);
	  }
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a;
	a=sc.nextInt();
	int c;
	c=(int) (logB(a,2)+1);
	System.out.println(c);
	//완전 이진트리 깊이는 log2n +1;
}
}
