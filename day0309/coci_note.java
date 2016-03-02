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
	//더 쉽게 푸는 법 배열로 받아서 음이 차례로 올라갈떄 + 내려갈때 - 합이 7이면 오름 합이 -7 내림 아니면 mixed
}
}
