package day0318;

import java.util.Scanner;

/*
 *  ������ ����� ���� ����� ������ Ȧ���� ���� ã�ƶ�!
 */
public class nf {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int count=0;
	for(int i=1; i<=10000;i++){
		if(a%i==0){
			count++;
		}
	}
	if(count %2 ==0){
		System.out.println("no");
	}else{
		System.out.println("yes");
	}
}
}
