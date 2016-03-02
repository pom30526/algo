package day0327;

import java.util.Scanner;

public class reverse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a =sc.nextLine();
	int a2[] = new int[a.length()];
	for(int i=0; i<a.length();i++){
		a2[i]=a.charAt(i);
	}
	for(int i=a2.length-1;i>=0;i--){
		if(a2[i]==32){
			//공백의 아스키 코드가 32
			System.out.print("");
		}else{
			System.out.print((char)a2[i]);
		}
	}
		
}
}
