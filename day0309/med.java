package day0309;

import java.util.Scanner;
/*
 * 3�ڸ����� ������ ���ϱ� �����ϸ� �ٷε�
 */
public class med {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	int a1,a2,b1,b2,c1,c2,d1,d2;
	a1=Math.min(a, b);
	a2=Math.min(a1, c);  // �ּ�
	b1=Math.max(a, b);
	b2=Math.max(b1, c); // �ִ�
	
	c1=Math.min(a, b); 
	c2=Math.max(c1,c);  //�߰����� ù��°���
	
	d1=Math.max(a,b);
	d2=Math.min(d1, c); //�߰����� �ι������
		if(c2>a2 && c2<b2){
		System.out.println(c2);
		}
		else if(a == b || a ==c ||b==c) {
			System.out.println(b);
		}
		else{
			System.out.println(d2);
		}
}
}
