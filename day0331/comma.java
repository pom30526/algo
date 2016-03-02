package day0331;

import java.util.Scanner;

public class comma {
/*
 * µ·ÀÇ ÀÚ¸´¼ö Âï±â
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s =sc.next();
		String a[] = new String[s.length()];
		
		for(int i=0;i<s.length();i++){
			a[i]=s.substring(i,i+1);
		}
		
		for(int i=0; i<a.length;i++){
			if(a.length %3 ==0){
			if(i%3==0 && i!=0){
			System.out.print(","+a[i]);
			}else{
				System.out.print(a[i]);
			}
			}
			else if(a.length %3 ==1){
				if(i%3==1 &&i!=0){
					System.out.print(","+a[i]);
					
				}else{
					System.out.print(a[i]);
				}
				
			}
			else if(a.length %3==2){
				if(i%3==2 && i!=0){
					System.out.print(","+a[i]);
				}else{
					System.out.print(a[i]);
				}
			}
		}
		}
	}

