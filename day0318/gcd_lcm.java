package day0318;

import java.util.Scanner;
/*
 * 최대 공약수 최소 공배수 구하기
 */
public class gcd_lcm {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a= sc.nextInt();
	int b= sc.nextInt();
	int gcd=0; int lcm=1;
	for(int i=1; i<=Math.max(a, b); i++){
		if(a%i ==0 && b%i==0){
			gcd=i;
			//루프를 돌면서 둘다 나누어 떨어지는것 결국 최대값이 들어간다
		}
		//최소공배수는 두수 곱한거 나누기 최대공약수
		lcm =a*b/gcd;
	}
	System.out.println(gcd+" "+lcm);
}
}
