package day0320;

import java.util.Scanner;

public class dwarf {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a[]= new int[9];
	int sum =0;
	for(int i=0; i<9;i++){
		a[i]=sc.nextInt();
		sum+=a[i];
		
	}
	int minus=sum-100;
	int sum2=0;
	int b1=0; //두개의 수를 뺴야함
	int b2=0; //두개의 수를 빼야함
	for(int i=0; i<9;i++){
		for(int j=0; j<9;j++){
		sum2=a[i]+a[j];	
		if(sum2==minus){
			b1=i;
			b2=j;
			
		}
		}
	}
	for(int i=0; i<a.length;i++){
		if(i==b1 || i==b2){
			continue;
		}
		else{
			System.out.print(a[i]+" ");
		}
	}
	
}
}
