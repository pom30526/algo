package day0318;

import java.util.Scanner;

public class lunacy {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	for(int i=0; i<15;i++){
		double a=sc.nextDouble();
		if(a <0 )
			break;
		System.out.printf("Objects weighing "+"%.2f"+" on Earth will weigh"+" %.2f"+" on the moon.\n",a,a*0.167);
	}
}
}
