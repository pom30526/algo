package day0401;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * 서로다른수 구하기
 */
public class distinct {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int d=sc.nextInt();
	List a = new ArrayList(); //중복이 안되는 수넣기
	List b = new ArrayList(); //중복수 넣기
	List c = new ArrayList(); //입력받는 줄
	for(int i=0; i<d;i++){
		c.add(sc.nextInt());
		
	}
	int count=0;
	for(int i=0;i<c.size();i++){
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
