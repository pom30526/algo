package day0406;

import java.util.Scanner;

public class insertSort {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a1=sc.nextInt();
	int b1=sc.nextInt();
	int i, j,t,temp;
	int a[] =new int[a1];
	for(int k=0;k<a1;k++){
		a[k]=sc.nextInt();
	}
	for(i=1;i<a.length;i++){
		temp =a[i];
		j=i;
		while((j>0) && (a[j-1]>temp)){
			a[j] =a[j-1];
			j--;
		}
		a[j]=temp;
		if(i==(b1-1)){
		for(t=0;t<a.length;t++){
			System.out.print(a[t]+" ");
		}
		
	}
}
}
}
