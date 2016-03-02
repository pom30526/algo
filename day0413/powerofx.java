package day0413;

import java.util.Scanner;

public class powerofx {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x =sc.nextInt();
	int y=sc.nextInt();
	
	int result=(int) Math.pow(x, y);
	System.out.println(result);
}
}
