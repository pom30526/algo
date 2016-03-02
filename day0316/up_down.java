package day0316;

import java.util.Scanner;

public class up_down {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,s;
	
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	s=sc.nextInt();
	int cycle =(a+b)/s;
	int Nikky;
	int Byron;
	int left;
	if(s%(a+b)>a) 
	{ 
	Nikky=(s/(a+b))*(a-b)+a-(s%(a+b)-a); 
	if(s%(c+d)>c) 
	Byron=(s/(c+d))*(c-d)+c-(s%(c+d)-c); 
	else 
	Byron=(s/(c+d))*(c-d)+s%(c+d); 
	} 

	else 
	{ 
	Nikky=(s/(a+b))*(a-b)+s%(a+b); 
	if(s%(c+d)>c) 
	Byron=(s/(c+d))*(c-d)+c-(s%(c+d)-c); 
	else 
	Byron=(s/(c+d))*(c-d)+s%(c+d); 
	} 

	if(Byron>Nikky) {
	System.out.println("Byron");
	}
	else if(Byron<Nikky) {
		System.out.println("Nikky"); 
	}
	else {
		System.out.println("Tied");} 

	} 

}

