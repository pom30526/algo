package day0406;

import java.util.Scanner;

public class selectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,min;
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int []a =new int[a1];
		for(int k=0; k<a.length;k++){
			a[k]=sc.nextInt();
		}
		for(i=0;i<a.length-1;i++){
			min =i;
			for(j=i+1;j<a.length;j++){
				if(a[j]<a[min]){
					int temp =a[min];
					a[min]=a[j];
					a[j]=temp;
				}
			}
			//System.out.print(a[i]+" ");
			if(i==a2-1){
			for(j=0;j<a.length;j++){
				System.out.print(a[j]+" ");
			}
			}
		}
	}
}
