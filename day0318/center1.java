package day0318;

import java.util.Scanner;

public class center1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int before=0;
	int after=0;
	int count =0;	
	for(int i=1; i<a; i++){
		before +=i;
	}
	for(int i=a+1;i<=a*a;i++){
		after +=i;
		if(before ==after){
			count++;
			break;
		}
	}

	if(count ==1){
		System.out.println("O");
	}else{
		System.out.println("X");
	}
	
}
}
