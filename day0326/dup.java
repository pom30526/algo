package day0326;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class dup {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	List a = new ArrayList(); //중복이 안되는 수넣기
	List b = new ArrayList(); //중복수 넣기
	List c = new ArrayList(); //입력받는 줄
	for(int i=0; i<10;i++){
		c.add(sc.next());
		
	}
	for(int i=0;i<10;i++){
		if(a.contains(c.get(i))){
			b.add(c.get(i)); //중복 수 넣기
		}else{
			a.add(c.get(i)); // 중복이 안되는 것  넣기
		}
	}
	for(int i=0; i<a.size();i++){
		
		String str =(String) a.get(i);
		if(!b.contains(str)){
			System.out.print(str+"");
		}
	}
}
}
