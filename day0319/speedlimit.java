package day0319;

import java.util.Scanner;

public class speedlimit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	a=sc.nextInt();
	int result=0;
	int prev=0;
	for(int i=0;i<a;i++){
		b=sc.nextInt();
		c=sc.nextInt();
		if(i==0){
		result +=b*(c);
		prev=c;
		}
		else{
			result +=b*(c-prev);
			prev=c;
		}
	}
	System.out.println(result+" miles");
}
}
