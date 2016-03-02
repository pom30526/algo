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
		int value=line.charAt(i)-97-i; //복호화수 에서 97빼고 그수만큼뺀다 ,value 값은 0부터 26까지 값을 가진다
		array[i+65]=value; //대문자 값
		array[i+97]=value; //소문자값 밀런거를 해독시켜줌
	}
	line=br.readLine();
	for(int i=0; i<line.length();i++){
		char c = line.charAt(i); //작거나 클수 있음
		if(c==' '){
			System.out.print(c);
		}
		else
			System.out.print((char)(c+array[c]));
	}
}
}
