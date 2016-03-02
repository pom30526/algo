package day0319;

import java.util.Scanner;


public class fou {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	int minvalue=Math.min(a, Math.min(b,c));
	int maxvalue=Math.max(a,Math.max(b, c));
	int middle=(a+b+c)-minvalue-maxvalue;

if(middle-minvalue == maxvalue-middle){
	System.out.println(maxvalue+(maxvalue-middle));
}
else if(middle -minvalue > maxvalue-middle){
	System.out.println(minvalue+(maxvalue-middle));
}
else {
	System.out.println(maxvalue -(middle-minvalue));
}
}
}
