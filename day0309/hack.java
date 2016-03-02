package day0309;

import java.util.Scanner;
/*
 * ±¤°í½Ã ÀÌµæÀÎ°¡ ¾Æ´Ñ°¡
 */
public class hack {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	int a,b,c;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	int d=b-c;
	if(a>d){
		System.out.println("do not advertise");
	}
	else if(a<d){
		System.out.println("advertise");
	}else{
		System.out.println("does not matter");
	}
	
}
}
