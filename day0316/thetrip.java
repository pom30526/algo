package day0316;

import java.util.Scanner;

public class thetrip {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int people =sc.nextInt();
	
	int money_spend[] = new int [people];
	int money_muset_spend[] = new int[people];
	
	int all_money_spend=0;
	int each_money_spend=0;
	int money_exchange=0;
	
	for(int i =0; i<people;i++){
		double temp;
		temp =sc.nextDouble();
		money_spend[i]=(int) temp;
		all_money_spend +=money_spend[i];
	}
	each_money_spend= all_money_spend/people;
	for(int i=0; i<people;i++){
		money_muset_spend[i]=each_money_spend;
	}
	all_money_spend %=people; //차액
	for(int i=0; i<people;i++){
		money_exchange +=Math.abs(money_spend[i]-money_muset_spend[i]);
	}
	money_exchange/=2; //두개로 나눠서 높은데준다
	System.out.println(money_exchange/100.0);
	
}
}
