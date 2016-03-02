package day0324;

import java.util.Scanner;

public class HQ9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String s1[]= new String[s.length()];
	for(int i=0;i<s.length();i++){
		s1[i]=s.substring(i, i+1);
		if(s1[i].equals("H")||s1[i].equals("h")){
			System.out.println("Hello, world!");
		}
		else if(s1[i].equals("9")){
			System.out.println("99 Bottles of Beer on the Wall");
		}
		else if(s1[i].endsWith("q")||s1[i].equals("Q")){
			System.out.println(s);
		}
	}
	}
}
