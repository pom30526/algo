package day0310;

import java.util.Scanner;
/*
 * �հ� ���� �� �� ���� ���ϱ�
 */
public class beat {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	a=sc.nextInt(); // �� ������ ��
	b=sc.nextInt(); // �� ������ ��
	if(a==0 &&b==0){
		System.out.println("0 0");
	}   
	// (a-b)%2 ==0 �� ������ �Ҽ��� �Ұ��� (a-b)>0 �� ������ ������ ��������ϱ� ����
	else if(a>b &&(a-b)%2==0 &&(a-b)>0){
		System.out.println((a+b)/2+" "+(a-b)/2);
	} 
	else{
		System.out.println("impossible");
	}
}
}
