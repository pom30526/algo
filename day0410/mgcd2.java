package day0410;

import java.util.ArrayList;
import java.util.Scanner;

public class mgcd2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	ArrayList <Integer>a1 = new ArrayList();
	ArrayList <Integer>a2= new ArrayList();
	a1.add(1);
	for(int i=0; i<a;i++){
		a1.add(sc.nextInt());
	}
	for(int i=1;i<a1.size();i++){
		for(int j=1; j<=a1.get(a1.size()-1);j++){
			if(a1.get(i) % j==0){
				a2.add(j);
		}
	}
	}
	int a3[] =new int[1000];
	for(int i=0;i<a2.size();i++){
		a3[a2.get(i)]++;
	}
	int result=0;
	int result2=0;
	for(int i=0;i<a3.length;i++){
		if(a3[i]==3){
				result=i;
		}
	
	}
	
	System.out.println(result);
	
	
}
}
