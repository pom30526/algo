package day0414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class foo {
public static void main(String[] args) throws IOException {
	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	String line =null;
	ArrayList<String> a1= new ArrayList<String>();
	while((line=sc.readLine())!=null){
		a1.add(line);
	}
	for(int i=0; i<a1.size();i++){
		System.out.println(a1.get(i).replace("FOO", "OOF"));
	}
	
}
}