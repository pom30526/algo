package day0325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class crypt {
public static void main(String[] args) throws IOException {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String line=br.readLine();
	int[] array = new int[150];
	
	for(int i=0;i<26;i++){
		int value=line.charAt(i)-97-i; //��ȣȭ�� ���� 97���� �׼���ŭ���� ,value ���� 0���� 26���� ���� ������
		array[i+65]=value; //�빮�� ��
		array[i+97]=value; //�ҹ��ڰ� �з��Ÿ� �ص�������
	}
	line=br.readLine();
	for(int i=0; i<line.length();i++){
		char c = line.charAt(i); //�۰ų� Ŭ�� ����
		if(c==' '){
			System.out.print(c);
		}
		else
			System.out.print((char)(c+array[c]));
	}
}
}
