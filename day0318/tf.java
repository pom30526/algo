package day0318;

import java.util.Scanner;

/*
 *  n = o*2^p ���ϱ�  ��Ȧ���� �ٲٸ��
 */
public class tf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt(); //�̰��� n ,n������ �� o�� p�� ���ϱ�
		int p=0;
		
		while(a%2==0){
			a/=2;
			p++;
		}
		System.out.println(a+" "+p);
		
	}

}
