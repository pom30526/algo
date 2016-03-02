package day0317;

import java.util.Scanner;

public class sb {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a; int maxvalue=-1;
	int count=0;
	for(int i=0; i<7;i++){
		a=sc.nextInt();
		if(a>maxvalue){
			maxvalue=a;
			count=i;
		}
	}
	//i가 0q부터 시작하므로
	System.out.println(count+1);
}
}
