package day0316;

import java.util.Scanner;

public class rlpn {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int a,b,c,d,a1,b1,c1,d1;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	a1=sc.nextInt();
	b1=sc.nextInt();
	c1=sc.nextInt();
	d1=sc.nextInt();
	if(c< a1 || a>c1 ||b>d1 || d<b1){
		//분리사각형
		System.out.println("none");
	}
	else if(a>=c1||c<=a1||b>=d1||d<=b1){
		if((a==c1&&b==d1)||(c==a1&&d==b1)||(a1==c&&b==d1)||(c1==a&&b1==d)){
			System.out.println("point");
		}else{
			System.out.println("line");
		}
	}else{
		System.out.println("rectangle");
	}
}
}
