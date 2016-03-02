package day0316;

import java.util.Scanner;

public class coci_tablica {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int []mat = new int [4];
	int temp;
	for(int i=0; i<4;i++){
		temp=sc.nextInt();
		mat[i]=temp;
	}
	int currentvalue = mat[0]/mat[2]+mat[1]/mat[3]; //0¹ÙÄû
	int currentvalue2= mat[2]/mat[3]+mat[0]/mat[1]; //1¹ÙÄû
	int currentvalue3= mat[3]/mat[1]+mat[2]/mat[0]; //2¹ÙÄû
	int currentvalue4= mat[1]/mat[0]+mat[3]/mat[2]; //3¹ÙÄû
	
	int tempmax =Math.max(currentvalue, currentvalue2);
	int tempmax2=Math.max(tempmax, currentvalue3);
	int lastmax=Math.max(tempmax2, currentvalue4);
	 if(lastmax ==currentvalue4){
			System.out.println(3);
		}
	else if(lastmax ==currentvalue2){
		System.out.println(1);
	}
	else if(lastmax ==currentvalue3){
		System.out.println(2);
	}
	else if(lastmax ==currentvalue){
		System.out.println(0);
	}
	
	
	}
}
