package day0306;

import java.util.Scanner;
// Math.ceil,floor,round �� �Ҽ��� �����ҋ��� ������ �ش�
public class titls {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a;
	int b;
	a=sc.nextInt();
	b=sc.nextInt();
	double c,d;
	c=Math.floor(a/8)*Math.floor(b/8);//�ڸ��� �ʰ� ����Ѱ�
	d=Math.ceil((double)a/8)*Math.ceil((double)b/8); //��ü
	
	System.out.println("The number of whole tiles is "+(int)(d-(d-c))+" part tiles is "+(int)(d-c) );
}
}
