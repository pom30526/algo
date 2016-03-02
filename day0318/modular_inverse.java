package day0318;

import java.util.Scanner;

public class modular_inverse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x,m;
	x=sc.nextInt();
	m=sc.nextInt();
	int result=0;
	int count =0;
	for(int i=1; i<=m;i++){
		result=x*i%m;
		if(result ==1){
			count=i;
			break;
		}
	}
	if(count>0){
		System.out.println(count);
	}
	else{
		System.out.println("No such integer exists.");
	}
}
}
