package day0326;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class dup {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	List a = new ArrayList(); //�ߺ��� �ȵǴ� ���ֱ�
	List b = new ArrayList(); //�ߺ��� �ֱ�
	List c = new ArrayList(); //�Է¹޴� ��
	for(int i=0; i<10;i++){
		c.add(sc.next());
		
	}
	for(int i=0;i<10;i++){
		if(a.contains(c.get(i))){
			b.add(c.get(i)); //�ߺ� �� �ֱ�
		}else{
			a.add(c.get(i)); // �ߺ��� �ȵǴ� ��  �ֱ�
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
