package day0320;

import java.util.Scanner;

public class tri2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	for(int i=1;i<a+1;i++){
		for(int j=a+1;j>i;j--){
			System.out.print("*");
		}
		System.out.println();
	}
}
}
