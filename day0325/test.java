package day0325;

public class test {
public static void main(String[] args) {
	char arry[]={'L','B','C','D','A','G','F','H','I','J','K','T','S','N','E','P','R','Q','W','V','U','O','M','X','Y','Z'};
	int [] array=new int[150]; 
	for(int i=0;i<26;i++){
		 int value=i+65-arry[i];
		 array[i+65]=value;
	 }
	System.out.println(array[65]);
}
}
