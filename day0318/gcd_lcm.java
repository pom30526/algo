package day0318;

import java.util.Scanner;
/*
 * �ִ� ����� �ּ� ����� ���ϱ�
 */
public class gcd_lcm {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a= sc.nextInt();
	int b= sc.nextInt();
	int gcd=0; int lcm=1;
	for(int i=1; i<=Math.max(a, b); i++){
		if(a%i ==0 && b%i==0){
			gcd=i;
			//������ ���鼭 �Ѵ� ������ �������°� �ᱹ �ִ밪�� ����
		}
		//�ּҰ������ �μ� ���Ѱ� ������ �ִ�����
		lcm =a*b/gcd;
	}
	System.out.println(gcd+" "+lcm);
}
}
