package day0305;
import java.util.Scanner;
/*
 * ���ڸ��� ��������
 */

public class thress {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	a=sc.nextInt();
	b=sc.nextInt();
	int hund=b/100; //100���ڸ�
	int decad=b%100/10; //10�� �ڸ�
	int c=b%100%10; //1���ڸ�
	System.out.println(a*c);
	System.out.println(a*decad);
	System.out.println(hund*a);
	System.out.println((c*a)+(a*decad*10)+(hund*a*100));
	
	
}
}
