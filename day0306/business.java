package day0306;

import java.util.Scanner;

public class business {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n,m,p,c; //n���� m���� p��¥�� c �Ž�����

	n=sc.nextInt();
	m=sc.nextInt();
	p=sc.nextInt();
	c=sc.nextInt();
	
	//m+c �� ���� �ݾ� m+c - p �� ��¥�� //m+c-p -c �� ���µ� 
	int result=(m+c-p-c-n);
	
	System.out.print(-result);
}
}
