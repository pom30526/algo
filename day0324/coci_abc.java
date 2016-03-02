package day0324;

import java.util.Scanner;

public class coci_abc {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	String s=sc.next();
	int min,max,middle;
	min=Math.min(a, Math.min(b,c));
	max=Math.max(a,Math.max(b, c));
	middle=a+b+c-min-max;
	if(s.equals("ABC")){
		System.out.print(min+" "+middle+" "+max);
	}
	else if(s.equals("ACB")){
		System.out.print(min+" "+max+" "+middle);
	}
	else if(s.equals("BAC")){
		System.out.print(middle+" "+min+" "+max);
	}
	else if(s.equals("BCA")){
		System.out.print(middle+" "+max+" "+min);
	}else if(s.equals("CAB")){
		System.out.print(max+" "+min+" "+middle);
	}
	else if(s.equals("CBA")){
		System.out.println(max+" "+middle+" "+min);
	}
	
}
}
