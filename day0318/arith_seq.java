package day0318;

import java.util.Scanner;

public class arith_seq {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a ,d, an;
	a=sc.nextInt(); //����
	d=sc.nextInt(); //����
	an=sc.nextInt();//���°��
	int n;
	n=(an-a+d)/d;  //���� ���� Ȯ�ι� O(1)��� ���������϶� n��° ��
	if((an-a+d)%d==0){ //������ �������� ��������
		System.out.println(n);
	}
	else{
		System.out.println("X");
	}
}
}
