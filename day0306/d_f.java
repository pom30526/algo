package day0306;

import java.util.Scanner;
/*
 * ���� �Ҽ��� ���
 */
public class d_f {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a,c;
		int b;
		a = sc.nextFloat();//�Ǽ���
		b = (int) a; //������
		c = a - b;  //�Ҽ���
		if(c<0){   //���������Ѱ�
			c=c+1;
			b=b-1;
		}
		System.out.printf("%d %.2f", b, c);
	}
}
