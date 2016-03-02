package day0331;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class dup {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String>list =new ArrayList();
		List<String>invalidList=new ArrayList();
		String token=br.readLine();
		StringTokenizer st = new StringTokenizer(token);
		for(int i=0; i<10;i++){
			if(st.hasMoreTokens()){
			String str= st.nextToken();
			if(list.contains(str))
				invalidList.add(str);
			else
				list.add(str);
		}
		}
		for(int i=0; i<list.size();i++){
			String str =list.get(i);
			if(!invalidList.contains(str)){
				System.out.print(str+"");
			}
		}
		
	}

}
