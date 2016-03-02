package day0402;

import java.math.BigInteger;
import java.util.Scanner;

public class long_sub {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	BigInteger a = new BigInteger(sc.next());
	BigInteger b = new BigInteger(sc.next());
	BigInteger c =a.subtract(b);
	System.out.println(c);
}
}
