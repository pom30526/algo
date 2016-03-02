package day0317;

import java.util.Scanner;

public class max {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a;
	int maxvalue=-1;
	int temp;
	for(int i=0; i<7;i++){
		a=sc.nextInt();
		if(a>maxvalue){
		maxvalue =a;
		}
	}
	System.out.println(maxvalue);
		
	}
}

