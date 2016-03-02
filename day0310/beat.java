package day0310;

import java.util.Scanner;
/*
 * 합과 차를 할 때 점수 구하기
 */
public class beat {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	a=sc.nextInt(); // 두 점수의 합
	b=sc.nextInt(); // 두 점수의 차
	if(a==0 &&b==0){
		System.out.println("0 0");
	}   
	// (a-b)%2 ==0 은 점수는 소수가 불가능 (a-b)>0 은 점수는 무조건 양수여야하기 때문
	else if(a>b &&(a-b)%2==0 &&(a-b)>0){
		System.out.println((a+b)/2+" "+(a-b)/2);
	} 
	else{
		System.out.println("impossible");
	}
}
}
