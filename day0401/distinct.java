package day0401;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * ���δٸ��� ���ϱ�
 */
public class distinct {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int d=sc.nextInt();
	List a = new ArrayList(); //�ߺ��� �ȵǴ� ���ֱ�
	List b = new ArrayList(); //�ߺ��� �ֱ�
	List c = new ArrayList(); //�Է¹޴� ��
	for(int i=0; i<d;i++){
		c.add(sc.nextInt());
		
	}
	int count=0;
	for(int i=0;i<c.size();i++){
		if(a.contains(c.get(i))){
			b.add(c.get(i)); //�̹� �ִٸ� �ߺ����Դϴ�
			
		}else{
			a.add(c.get(i)); //�ߺ� ���¼�  ==���� �ٸ���
			count++;
		}
	}
	System.out.println(count);
	}
}
