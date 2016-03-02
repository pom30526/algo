package day0401;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class coci_modulo {
	/*
	 * 문자를 입력받아 42로 나눈 나머지중에서 서로 다른 개수의 수 세기 
	 */
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List a = new ArrayList(); //중복이 안되는 수넣기
	List b = new ArrayList(); //중복수 넣기
	List c = new ArrayList(); //입력받는 줄
	for(int i=0; i<10;i++){
		c.add(sc.nextInt()%42);
		
	}
	int count=0;
	for(int i=0;i<10;i++){
		if(a.contains(c.get(i))){
			b.add(c.get(i)); //이미 있다면 중복수입니다
			
		}else{
			a.add(c.get(i)); //중복 없는수  ==서로 다른수
			count++;
		}
	}
	System.out.println(count);
	}
}
