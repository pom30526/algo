package day0402;

import java.util.Scanner;

public class countersort {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int ia[] =new int[a];
	for(int i=0;i<a;i++){
		ia[i]=sc.nextInt();
	}
	int maxvalue=-1;
	for(int i=0;i<ia.length;i++){
		if(ia[i] >maxvalue){
			maxvalue=ia[i];
		}
	}
	int ib[] =new int[maxvalue+1];
	for(int i=0;i<ia.length;i++){
		ib[ia[i]]++;
		
		
	}
	int []ic = new int[a];
	for(int i=0;i<ib.length;i++){
		System.out.print(ib[i]+" ");
	}
}
}
