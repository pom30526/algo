package day0310;

import java.util.Scanner;

public class fill {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	float speed,weight,power;
	speed=sc.nextFloat();
	weight=sc.nextFloat();
	power=sc.nextFloat();
	int haspostion =0;
	if(speed <=4.5 && weight >=150 && power >=200){
		haspostion =1;
		System.out.print("Wide Receiver ");
	}
	 if(speed <=6.0 && weight>=300 &&power >=500){
		 haspostion =2;
		 System.out.print("Lineman ");
	}
	 if(speed <=5.0 && weight >=200 && power >=300){
		 haspostion =3;
		 System.out.print("Quarterback ");
	}
	 if(haspostion ==0){
		 System.out.println("No positons");
	 }
}

}
