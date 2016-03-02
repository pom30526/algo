package day0318;

import java.util.Scanner;
/*
 * 수를 거꿀로 적고 곱하기
 */
public class oddddo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt(); //쓴수의 개수
	int reverse =a*2+1; //홀수 한번더 나간다
	int inverse=-1;     //+1부터 시작하기 위한 복선이다
	int result=1;
	
	for(int i=1 ;i<=a; i++){
		inverse +=2;
		reverse -=2;
		result +=(inverse*reverse);
	
		
		}
	System.out.println(result-1);
	
}
}
