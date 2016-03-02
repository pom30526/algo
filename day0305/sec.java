package day0305;
import java.util.Scanner;


public class sec {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sec,min,hour,day;
	sec= sc.nextInt();  //초를 입력 받는다 
	day=sec/86400;     //하루를 계산하고
	sec=sec%86400;     // 계산값을 제외한 나머지로 초기화
	hour=sec/3600;     //시를 계산
	sec=sec%3600;     //시를 계산하고 초기화
	min=sec/60;       // 분을 계산
	sec=sec%60;       //계산하고 초기화

	System.out.printf("%d %d %d %d",day,hour,min,sec);
	
}
}
