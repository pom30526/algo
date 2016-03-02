package day0318;

import java.util.Scanner;

public class mmm {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a;
	int sum =0;
	int maxvalue =-1;
	int minvalue =10000;
	for(int i=0; i<10;i++){
		a=sc.nextInt();
		sum +=a;
		if(a>maxvalue){
			maxvalue =a;
		}
		if(a<minvalue){
			minvalue=a;
		}
		
	}
	System.out.println(sum+" "+maxvalue+" "+minvalue);
}
}
