package day0305;
import java.util.Scanner;

/*
 * 거스름 돈 건내주는문제
 */
public class change {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt(); //물건값
	int b= 1000;  //내가 내는 돈
	int c=b-a;    //내가낸돈 - 물건값 거슬러줄 돈 총액 
	int d=c/100;  // 거스름돈 100의 자리수
	int e =c%100/50; //거스름돈 50원짜리
	int f =c%100%50/10; //거스름돈 10원짜리
	System.out.println(d+" "+e+" "+f+" ");
	
}
}
