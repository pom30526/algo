package day0401;

import java.util.Scanner;

public class mt {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	for(int i=1;i<=a;i++){
		System.out.print(i);
	}
	for(int i=a-1;i>=1;i--){
		System.out.print(i);
	}
}
}
