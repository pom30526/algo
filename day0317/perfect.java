package day0317;

import java.util.Scanner;
public class perfect {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++){
			if(a%i==0 && i!=a){
				sum+=i;
				//sum a를 제외한 약수의 합
			}
		}
		if(sum == a){
			System.out.printf("%5d",a);
			System.out.println("  "+"PERFECT");
		}
		else if(sum >a){
			System.out.printf("%5d",a);
			System.out.println("   "+"ABUNDANT");
		}
		else{
			System.out.printf("%5d",a);
			System.out.println("  "+"DEFICIENT");
		}
	}
}
