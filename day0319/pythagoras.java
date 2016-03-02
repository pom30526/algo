package day0319;

import java.util.Scanner;
/*
 * 문제는 맞음 여러값 인식불가능해서안됨 맞게함
 */
public class pythagoras {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int c=sc.nextInt();
	double a,b,d;
	a=0;
	d=0;
	int count=0;
	for(int i=1; i<=1000000;i++){
		b=(c*c)-(i*i);
		if(Math.sqrt(b)%1==0 && Math.sqrt(b)>0){
			count =1;
			a=i;
			d=(int)Math.sqrt(b);
			break;
		}
	
		
	}
	int temp=0;
	if(a>d){
		temp=(int)d;
		d=a;
		a=temp;
	}

	if(count ==1){
	
		System.out.println((int)a+" "+(int)d);
		
	}else{
		System.out.println("impossible");
	}
}
}
