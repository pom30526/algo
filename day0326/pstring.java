package day0326;

import java.util.Scanner;
/*
 * 반복주기 구하는 것
 */
public class pstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String a1[] = new String[a.length()];
		int count = 0;
		
		for (int i = 0; i < a.length(); i++) {
			a1[i] = a.substring(i, i + 1);
		}
		for (int i = 1; i < a1.length; i++) {
			if (a1[0].equals(a1[i])) {
				count = i;
				if(a1.length%count !=0){
					//count로 나눴을 때 0이되어야 딱 맞아 떨어진다
					continue;
				}
				break;
			}
		}
	
		 if(count ==0){
			System.out.println(1);
		}else{
		System.out.println(a1.length / count);
		}
		
	}
}
