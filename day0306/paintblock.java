package day0306;

import java.util.Scanner;
//큐브 색칠하는것 2개면만 칠해진 블록의 개수구하기
public class paintblock {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a,b,c;
	a= sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	System.out.println((a+b+c-6)*4); //공식이 이렇게 됨
}
}
