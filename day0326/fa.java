package day0326;

import java.util.Scanner;

public class fa {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a=sc.next();
	int a2[] = new int [123]; //���ĺ� �ҹ��� �ƽ�Ű �ڵ� ������ 122�̹Ƿ�
	
	for(int i=0;i<a.length();i++){
		a2[a.charAt(i)]++;  //�迭���� �󵵼� ���ϴ� �� 
	}
	for(int i=97;i<123;i++){
		if(a2[i]!=0){
		System.out.print((char)i+""+a2[i]);
		}
	}
	}
}
