package day0305;
import java.util.Scanner;


public class sec {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sec,min,hour,day;
	sec= sc.nextInt();  //�ʸ� �Է� �޴´� 
	day=sec/86400;     //�Ϸ縦 ����ϰ�
	sec=sec%86400;     // ��갪�� ������ �������� �ʱ�ȭ
	hour=sec/3600;     //�ø� ���
	sec=sec%3600;     //�ø� ����ϰ� �ʱ�ȭ
	min=sec/60;       // ���� ���
	sec=sec%60;       //����ϰ� �ʱ�ȭ

	System.out.printf("%d %d %d %d",day,hour,min,sec);
	
}
}
