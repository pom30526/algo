package day0317;

import java.util.Scanner;
/*
 * ������ �ڽ��� ������ ����� ���� �ڱ��ڽ��� �Ǵ¼�
 */
public class complete {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int a=sc.nextInt();
	int sum=0;
	for(int i=1;i<a;i++){
		if(a%i==0 ){
			sum+=i;
		}
	}
	if(sum ==a){
		System.out.println("yes");
	}else{
		System.out.println("no");
	}
}
}
