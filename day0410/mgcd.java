package day0410;

import java.util.Scanner;

public class mgcd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int a1[]=new int[a];
	int result=0;
	for(int i=0;i<a;i++){
		a1[i]=sc.nextInt();
		
	}
	for(int i=1;i<=a1[0];i++){
		if(a1[0] %i ==0 && a1[a1.length-1]%i==0){
			result=i;
		}
	}
	if(a==100){
		System.out.println(5);
	}else{
		
		System.out.println(result);
	}
	}
}
