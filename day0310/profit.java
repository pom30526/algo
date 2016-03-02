package day0310;

import java.util.Scanner;

public class profit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	double c;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextFloat();
	float price;
	price=(a*(1+((float)b/100)));
	double discount;
	discount=price*(((double)1-(c/100)));
	if(discount > a){
	System.out.print((int)Math.round(discount)-a);
	}
	else{
		System.out.println("loss");
	}
}
}
