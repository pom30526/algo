package day0317;

import java.util.ArrayList;
import java.util.Scanner;

public class yaksu {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	a=sc.nextInt();
	b=sc.nextInt();
	int yaksucount =0;  
	ArrayList number = new ArrayList();
	for(int i=1; i<=a;i++){
		if(a%i==0){
			//약수 조건확인
			yaksucount++;
			//약수는 이미 정렬되어있다
			//약수를 저장하자
			number.add(i);
			
		}
	}
	if(b>yaksucount){
		System.out.println(0);
	}
	else{
		//+1하는 이유는 for문이 1에서 시작되므로 -1해줘야한다
		System.out.println(number.get(b-1));
	}
	
}
}
