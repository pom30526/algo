package day0319;

import java.util.Scanner;

public class divisor1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	a=sc.nextInt();
	b=sc.nextInt();
	int count=1;
	int sum=0;
	int result;
	for(int i=a; i<=b;i++){
		result =(int)Math.sqrt(i);
			if(result%2==1){
				sum+=i;
				count++;
			}
		}
	System.out.print(count+" ");
	System.out.println((sum+1)%1000000003);
}
}

