package day0318;

import java.util.Scanner;

public class sc {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x;
	int count =0;
	int a,b,c,d,f;
	a=0;
	b=0;
	c=0;
	d=0;
	f=0;
	
	for(int i=0; i<100;i++){
		x=sc.nextInt();
		count ++;
		if(x <0){
			break;
		}
		if(x>=90 && x<=100){
			a++;
		}
		else if(x>=80 && x<=89 ){
			b++;
		}
		else if(x>=70 && x<=79){
			c++;
		}else if(x>=60 && x <=69){
			d++;
		}
		else {
			f++;
		}
		
	}
	if(count !=100){
	System.out.println(count-1);
	}
	else {
		System.out.println(count);
	}
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(f);
}
}
