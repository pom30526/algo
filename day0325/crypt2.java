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
		 int value=i+65-arry[i];  //0�Ǵ� -���� ������
		 if(value ==0)
		 {
			 array[i+65]=value; //�������� ��ġ��� value ==0�� �˴ϴ�
		 }
		 else 
		 {
		 array[i+65-value]=value; //�������� ��ġ�� �ƴ϶�� value���� 0���� �۰Ե��� �ε��� ���� �þ��
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