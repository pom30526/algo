package day0309;

import java.util.Scanner;

public class saju {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int year,month,day;
	year=sc.nextInt();
	month=sc.nextInt();
	day=sc.nextInt();
	int result =year+month+day;
	
	if(result %5 ==0){
		System.out.println("운수대통");
	}
	else{
		System.out.println("노력하세요!");
	}
	
	
}
}
