package day0413;

import java.util.Scanner;
/*
 * 단어 별 역순
 */
public class esrever {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String st = sc.nextLine();	
	String sp[] = st.split(" ");
	for(int i=0;i<sp.length;i++){
		if(sp[i].length()==1){
		System.out.print(sp[i]+" ");
		}
		else if(sp[i].length() >1){
			for(int j=sp[i].length()-1;j>=0;j--){
				System.out.print(sp[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
	}
}
