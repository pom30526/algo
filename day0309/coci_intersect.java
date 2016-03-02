package day0309;

import java.util.Scanner;
/*
 * 대각 선 교차점의 수 구하기
 */
public class coci_intersect {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	
	int result=((a-3)*(a-2)*(a-1)*(a))/24; //교차점 구하는 공식!!!
	System.out.println(result);
}
}
