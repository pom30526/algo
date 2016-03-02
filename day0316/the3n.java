package day0316;

import java.util.Scanner;

public class the3n {
public static void main(String[] args) {
	int a,b;
	Scanner sc = new Scanner(System.in);
	b=sc.nextInt();
	int count=0;
	System.out.print(b+" ");
	while(b>1){
		if(b%2==0){
			b=b/2;
			count++;
			
		}
		else if(b%2==1){
			b=b*3+1;
			count++;
		}
		System.out.print(b+" ");
		
	}
}
}
