package day0306;

import java.util.Scanner;

public class complete_graph {
public static void main(String[] args) {


	// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	int a;
	a=sc.nextInt();
	int result;
	result=a*(a-1)/2;  // 완전 그래프 대각선의 수 공식
	System.out.println(result);
}
}

