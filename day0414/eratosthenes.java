package day0414;

import java.util.Scanner;
/*
 *  에라토스테네스의 체  2부터 n 까지의 소수 출력
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
				//j는 i와 같지않고 j%i==0 공약수인 것을 0으로 채운다
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
