package day0319;

import java.util.Scanner;

public class cha {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	a=sc.nextInt();
	b=sc.nextInt();
	int c=a-b;
	if(c>=0){
	System.out.print(a+" "+b+" "+c+" ");
	}else{
		System.out.println(a+" "+b+" ");
	}
	for(int i=0; i<=100;i++){
		 if(c>0 ){
			a=b;
			b=c;
			c=a-b;
			if(c>=0){
			System.out.print(c+" ");
			}
		}
		 if(c==0){
			 a=b;
			 b=c;
			 c=a-b;
			 System.out.print(c); 
			 break;
		 }
//		 }else if(c>0 && c>b){
//			 break;
//		 }
		
			
		}
	}
		
	}
