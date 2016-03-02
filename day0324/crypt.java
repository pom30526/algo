package day0324;

import java.util.Scanner;

public class crypt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String text = sc.nextLine();
		String s1[] = new String[26];
		String a[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k","l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w","x","y","z"};
		String a1[] = new String[text.length()];
		String a2[] = new String[text.length()];
		for (int i = 0; i < s1.length; i++) {
			s1[i] = s.substring(i, i + 1);
		}

//		for (int i = 0; i < text.length(); i++) {
//			a1[i] = text.substring(i, i + 1);
//			
//		}
		for (int i = 0; i < text.length(); i++) {
			for(int j=0;j<a.length;j++){
				if(text.substring(i,i+1).equals(a[j])){
					a[j]=s1[j];
					a1[i]=a[j];
				}else if(text.substring(i,i+1).equals(" ")){
					a1[i]=" ";
				}
				if(text.substring(i,i+1).equals("null")){
					a[j]=s1[j];
					a1[i]=a[j];
				}
					
			}
			
			}
		for(int i=0;i<text.length();i++){
			System.out.print(a1[i]);
			
		}
				
			
			}
		}

