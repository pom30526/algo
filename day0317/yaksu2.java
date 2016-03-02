package day0317;

import java.util.Scanner;

public class yaksu2 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int a,b;
	a=sc.nextInt();
	b=sc.nextInt();
	int count =0;
	int result =0;
	for(int i=1;i<=a;i++){
		if(a%i==0){
			count++;
		}
		if(count ==b){
			System.out.println(i);
			break;
		}
	}
	if(count <b){
		System.out.println(0);
	}
	
}
}
