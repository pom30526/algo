package day0401;

import java.util.Scanner;
/*
 * 1+2+2+3+3+3 ..이런식으로 가는 수 구하는 문제
 */
public class gold_coin {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int a=sc.nextInt();
	
	int nth =0;
	int ans=0;
	for(int i=1; i<=a;i++){
		for(int j=1; j<=i;j++){  //i ==2 이면 2번 돌면서 2를 2번더해준다  
			ans +=i;  //총금액
			nth++;    //날짜수
			if(nth ==a){
				System.out.println(nth+" "+ans);
			}
		}
	}
}
}
