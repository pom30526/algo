package day0305;
import java.util.Scanner;


public class m2s {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a,b;
	a=sc.nextLine();
	int min =Integer.parseInt(a);
	System.out.println(min+" minutes is "+(min*60)+" seconds.");
}
}
