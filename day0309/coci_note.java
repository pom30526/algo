package day0309;

import java.util.Scanner;

public class coci_note {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a,b,c,d,e,f,g,h;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	e=sc.nextInt();
	f=sc.nextInt();
	g=sc.nextInt();
	h=sc.nextInt();
	
	if(a<b && b<c && c<d &&d<e &&e<f &&f<g &&g<h){
		System.out.println("ascending");
	}
	else if(a>b && b>c && c>d&& d>e && e>f && f>g && g>h){
		System.out.println("descending");
	}
	else{
		System.out.println("mixed");
	}
	//�� ���� Ǫ�� �� �迭�� �޾Ƽ� ���� ���ʷ� �ö󰥋� + �������� - ���� 7�̸� ���� ���� -7 ���� �ƴϸ� mixed
}
}
