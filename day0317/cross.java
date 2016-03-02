package day0317;

import java.util.Scanner;
/*
 * 두현의 교차유무
 */
public class cross {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	int temp ;
	//수 정렬
	if(a>b){
		temp =a;
		a=b;
		b=temp;
	}
	int temp2;
	if(c>d){
		temp2=c;
		c=d;
		d=temp2;
	}
	if(a<c && c<b && a<d && d<b){
		System.out.println("not cross");
	}
	else if(a<c && c<b){
		System.out.println("cross");
	}
	else if(a<d && d<b){
		System.out.println("cross");
	}
	else{
		System.out.println("not cross");
	}
	
	
}
}
