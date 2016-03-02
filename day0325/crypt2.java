package day0325;

import java.io.IOException;
import java.util.Scanner;

public class crypt2 {
public static void main(String[] args) throws IOException {
	 Scanner sc= new Scanner(System.in);
	 
	 char arry[]={'L','B','C','D','A','G','F','H','I','J','K','T','S','N','E','P','R','Q','W','V','U','O','M','X','Y','Z'};
	 int array[]=new int[150];
	 //char ar[] = new char[26];
	 String line;
	 for(int i=0;i<26;i++){
		 int value=i+65-arry[i];  //0또는 -값을 가진다
		 if(value ==0)
		 {
			 array[i+65]=value; //정상적인 위치라면 value ==0이 됩니다
		 }
		 else 
		 {
		 array[i+65-value]=value; //정상적인 위치가 아니라면 value값은 0보다 작게되지 인덱스 값은 늘어나고
		 }
		
		
	 }
	 
	 int a=sc.nextInt();
	 for(int i=0; i<a;i++){
		 System.out.println("#testcase"+(i+1));
		 line=sc.next();
		
		for(int j=0;j<line.length();j++){
			
			int c=  line.charAt(j);
			System.out.print((char)((c+array[c])));
			 
	
		}
		System.out.println();
	 }
	 
		
}
}