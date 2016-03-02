package day0309;

import java.util.Scanner;
/*
 * 3자리수중 중위수 구하기 정렬하면 바로됨
 */
public class med {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	int a1,a2,b1,b2,c1,c2,d1,d2;
	a1=Math.min(a, b);
	a2=Math.min(a1, c);  // 최소
	b1=Math.max(a, b);
	b2=Math.max(b1, c); // 최대
	
	c1=Math.min(a, b); 
	c2=Math.max(c1,c);  //중간값의 첫번째경우
	
	d1=Math.max(a,b);
	d2=Math.min(d1, c); //중간값의 두번쨰경우
		if(c2>a2 && c2<b2){
		System.out.println(c2);
		}
		else if(a == b || a ==c ||b==c) {
			System.out.println(b);
		}
		else{
			System.out.println(d2);
		}
}
}
