package day0318;

import java.util.Scanner;
/*
 * ���� �Ųܷ� ���� ���ϱ�
 */
public class oddddo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt(); //������ ����
	int reverse =a*2+1; //Ȧ�� �ѹ��� ������
	int inverse=-1;     //+1���� �����ϱ� ���� �����̴�
	int result=1;
	
	for(int i=1 ;i<=a; i++){
		inverse +=2;
		reverse -=2;
		result +=(inverse*reverse);
	
		
		}
	System.out.println(result-1);
	
}
}
