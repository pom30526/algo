package day0401;

import java.util.Scanner;
/*
 * 1+2+2+3+3+3 ..�̷������� ���� �� ���ϴ� ����
 */
public class gold_coin {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int a=sc.nextInt();
	
	int nth =0;
	int ans=0;
	for(int i=1; i<=a;i++){
		for(int j=1; j<=i;j++){  //i ==2 �̸� 2�� ���鼭 2�� 2�������ش�  
			ans +=i;  //�ѱݾ�
			nth++;    //��¥��
			if(nth ==a){
				System.out.println(nth+" "+ans);
			}
		}
	}
}
}
