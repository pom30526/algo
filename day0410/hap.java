package day0410;

import java.util.Scanner;

public class hap {
 public hap(int a, int b, int c,int d){
	 int sum=0;
	 sum =a+b+c+d;
	 System.out.println(sum);
 }
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	hap hap = new hap(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
	
}
}
