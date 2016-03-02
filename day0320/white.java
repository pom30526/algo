package day0320;

import java.util.Scanner;
/*
 * 장기알 숫자 맞추는 문제
 */
public class white {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a[]={1,1,2,2,2,8};
	int b[]=new int[6];
	for(int i=0;i<6;i++){
		b[i]=sc.nextInt();
		if(a[i] !=b[i] ){
			System.out.print(a[i]-b[i]+" ");
		}
		else{
			System.out.print(0+" ");
		}
		
	}
	
}
}
