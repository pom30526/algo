package day0318;

import java.util.Scanner;
/*
 * ¸øÇ° ¤Ì¤Ì
 */
public class rounders {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a= sc.nextInt();
	int ten=1;
	while(a>9){
		if(a%10>4){
			a +=10;
			
			 a/=10;
			 ten*=10;
		}
	}
	System.out.println(a*ten);
}
}
