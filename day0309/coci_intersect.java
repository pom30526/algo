package day0309;

import java.util.Scanner;
/*
 * �밢 �� �������� �� ���ϱ�
 */
public class coci_intersect {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	
	int result=((a-3)*(a-2)*(a-1)*(a))/24; //������ ���ϴ� ����!!!
	System.out.println(result);
}
}
