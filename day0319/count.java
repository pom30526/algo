package day0319;

import java.util.Scanner;

public class count {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int n =0 ;
	int count =1;
	int c=0,d=0;
	for(int i=1; i<=100;i++){
		n=i*(i+1)/2;
		if(n<a){
			count++;
			System.out.println(n+" "+count);
			c=n;
			d=count;
			
		}

	}
	//System.out.println(c+" "+d);
	if((c+d) %2 ==1 && (c+d)==a ){
		System.out.println(1+"/"+d);
	}
	else if((c+d) %2==1 &&(c+d)>a){
		System.out.println((c+d-a+1)+"/"+(a-d*2));
	}
	else if((c+d)%2==0 &&(c+d)==a){
		
	}
	
}
}
