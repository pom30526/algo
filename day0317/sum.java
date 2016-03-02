package day0317;

import java.util.Scanner;

public class sum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a;
	
	int sum=0;
	for(int i=0; i<7; i++){
		a=sc.nextInt();
		sum+=a;
	}
	System.out.println(sum);
}
}
