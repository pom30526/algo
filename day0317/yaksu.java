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
			//��� ����Ȯ��
			yaksucount++;
			//����� �̹� ���ĵǾ��ִ�
			//����� ��������
			number.add(i);
			
		}
	}
	if(b>yaksucount){
		System.out.println(0);
	}
	else{
		//+1�ϴ� ������ for���� 1���� ���۵ǹǷ� -1������Ѵ�
		System.out.println(number.get(b-1));
	}
	
}
}
