package day0305;
import java.util.Scanner;

public class koi_watch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Hour, min, sec, cooktime;
		Hour = sc.nextInt();
		min = sc.nextInt();
		sec = sc.nextInt();
		cooktime = sc.nextInt();
		
		int Sum=(Hour*60*60)+(min*60)+(sec)+cooktime;
		while(Sum>=86400){
			Sum-=86400;
		} //86400�ʴ� �Ϸ� �Ϸ簡 �Ѿ�� ��������  �װ� �޾Ƶ��ϼ���� ����ȯ�ؼ� ������
		System.out.printf("%d %d %d",Sum/60/60,Sum/60%60,Sum%60);

	}
}
