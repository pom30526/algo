package day0319;

import java.util.Scanner;

public class squre {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	a=sc.nextInt();
	b=sc.nextInt();
	int sum=0;
	int minv=10000;
	int count =0;
	for(int i=a;i<=b;i++){
		
	
      if(Math.sqrt(i)%1==0){
    	  sum +=i;
    	  if(minv >i){
    		  minv=i;
    	  }
    	count =1;
      }
      
    	  
  }
	if(count==1){
	  System.out.println(sum);
	  System.out.println(minv);
	}
	else{
		System.out.println(-1);
	}
	}
}
