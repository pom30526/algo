package day0305;
	import java.util.Scanner;
	
	/*
	 *  ������ ȭ�÷� ��ȯ�ϴ� ����
	 */
	public class Ctof {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		a= sc.nextInt();
		if(a>100){
			return;
		}
		else
		{	
			float b=9/5f;
			float result=b*a+32;
			System.out.println(String.format("%.1f", result));
		}
	}
	}
