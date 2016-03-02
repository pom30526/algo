package day0318;

import java.util.Scanner;

public class arith_seq {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a ,d, an;
	a=sc.nextInt(); //초항
	d=sc.nextInt(); //공차
	an=sc.nextInt();//몇번째항
	int n;
	n=(an-a+d)/d;  //등차 수열 확인법 O(1)방법 등차수열일때 n번째 항
	if((an-a+d)%d==0){ //나누어 떨어지면 등차수열
		System.out.println(n);
	}
	else{
		System.out.println("X");
	}
}
}
