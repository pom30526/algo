package day0402;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * 제곱수를 만드는 문제
 */
public class make_square {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a= sc.nextInt();
	ArrayList<Integer> a1 = new ArrayList();
	//공약수를 넣기
	for(int i=1; i<=a;i++){
		if(a %i==0 ){
			a1.add(i);
		}
	}
	
	for(int i=0; i<a1.size();i++){
		//System.out.print(a1.get(i)+" ");
		if(Math.sqrt(a*a1.get(i))%1==0 ){
			System.out.println(a1.get(i));
			break;
		}
	}
	
}
}
