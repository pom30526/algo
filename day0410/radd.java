package day0410;

import java.util.Scanner;

/*
 * ���� ������ ���ϱ�
 */
public class radd {
	public radd(String m, String n){
		StringBuffer a=new StringBuffer(m).reverse();
		int a1 = Integer.parseInt(a.toString());
		StringBuffer b = new StringBuffer(n).reverse();
		int a2= Integer.parseInt(b.toString());
		String a3 =a1+a2+""; //���� +����+���� = ���ڿ�
		StringBuffer result = new StringBuffer(a3).reverse();
		int a4=Integer.parseInt(result.toString());
		System.out.println(a4);
		
		
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	radd a =new radd(sc.next(), sc.next());
	
}
}
