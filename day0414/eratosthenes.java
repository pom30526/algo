package day0414;

import java.util.Scanner;
/*
 *  �����佺�׳׽��� ü  2���� n ������ �Ҽ� ���
 */
public class eratosthenes {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int a=sc.nextInt();
	int a1[] =new int[10000];
	
	for(int i=2;i<a1.length;i++){
		a1[i]=i;
	}
	for(int i=2;i<a1.length;i++){
		for(int j=2;j<a1.length;j++){
			if(a1[j] !=i &&a1[j] % i==0){
				//j�� i�� �����ʰ� j%i==0 ������� ���� 0���� ä���
				a1[j]=0;
			}
		}
	}
	for(int i=2;i<=a;i++){
		if(a1[i] !=0){
			System.out.print(a1[i]+" ");
		}
	}
}
}
