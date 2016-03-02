package day0401;

import java.util.Arrays;
import java.util.Scanner;

public class pir {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a[] = new int [20];
	for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
	}
	int temp;
	for(int i=0; i<a.length;i++){
		for(int j=0; j<a.length-1;j++){
			if(a[j]>a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	//Arrays.sort(a);
	System.out.println(a[19]+a[18]);
	System.out.println(a[19]+" "+a[18]);
}
}
