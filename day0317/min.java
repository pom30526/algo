package day0317;

import java.util.Scanner;

public class min {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int a;
	int minvalue=10000;
	for(int i=0;i<6;i++){
		a=sc.nextInt();
		if(minvalue>a){
			minvalue=a;
		}
	}
	System.out.println(minvalue);
}
}
