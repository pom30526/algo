package day0306;

import java.util.Scanner;
//�������ϱ�
public class flr {
 //�α�2��� �����
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
	//���� ����Ʈ�� ���̴� log2n +1;
}
}
