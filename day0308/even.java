package day0308;

import java.util.Scanner;
/*
 * a와 b 사이 약수의 개수가 짝수인 것을 구하시오
 */
public class even {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	a=sc.nextInt();
	b=sc.nextInt();
	//1~a까지 약수의 개수  
//	float result=(float) Math.floor((a-Math.round(Math.sqrt(a))));
//	float result2=(float)Math.floor(((b-Math.round(Math.sqrt(b)))));
//	if(a%2==0){
//	System.out.println((int)(result2-result+1));
//	}
//	System.out.println((int)(result2-result));

	float result = (float) (b-Math.floor(Math.sqrt(b)));
	float result2 =(float)(a-Math.floor(Math.sqrt(a)));
	System.out.println((int)result-(int)result2+1);
}
}
