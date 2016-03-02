package day0305;
import java.util.Scanner;
/*
 * 세자리수 곱셈문제
 */

public class thress {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	a=sc.nextInt();
	b=sc.nextInt();
	int hund=b/100; //100의자리
	int decad=b%100/10; //10의 자리
	int c=b%100%10; //1의자리
	System.out.println(a*c);
	System.out.println(a*decad);
	System.out.println(hund*a);
	System.out.println((c*a)+(a*decad*10)+(hund*a*100));
	
	
}
}
