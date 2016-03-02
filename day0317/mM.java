package day0317;

import java.util.Scanner;

public class mM {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a;
	int minvalue=10000;
	int maxvalue=-1;
	for(int i=0; i<7;i++){
		a=sc.nextInt();
		if(a>maxvalue){
			maxvalue=a;
		}
		if(a<minvalue){
			minvalue =a;
		}
	}
	System.out.println(maxvalue+" "+minvalue);
}
}
