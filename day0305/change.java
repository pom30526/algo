package day0305;
import java.util.Scanner;

/*
 * �Ž��� �� �ǳ��ִ¹���
 */
public class change {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt(); //���ǰ�
	int b= 1000;  //���� ���� ��
	int c=b-a;    //�������� - ���ǰ� �Ž����� �� �Ѿ� 
	int d=c/100;  // �Ž����� 100�� �ڸ���
	int e =c%100/50; //�Ž����� 50��¥��
	int f =c%100%50/10; //�Ž����� 10��¥��
	System.out.println(d+" "+e+" "+f+" ");
	
}
}
