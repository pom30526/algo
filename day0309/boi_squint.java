package day0309;

import java.util.Scanner;

public class boi_squint {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long a=sc.nextLong();
	long result=(long) Math.ceil(Math.sqrt(a));
	System.out.print(result);
}
}
