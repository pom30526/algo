package day0317;

import java.util.Scanner;
//����� �������ϱ�
public class nfactor {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a; int count =0;
	a=sc.nextInt();
	for(int i=1;i<=a;i++){
			if(a%i==0){
				count++;
			}
	}
	System.out.println(count);
}
}
