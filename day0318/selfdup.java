package day0318;


public class selfdup {
public static void main(String[] args) {
	for(int i=1; i<=10000;i++){
		/* 
		 * ���ԽĹ��
		 */
		 if (Integer.toString(i*i).matches(".*" + Integer.toString(i) + "$")) {
             System.out.println(i);
         }
//�ڱ� �ڽ��� �����Ͽ� ���ڸ����� �ڱ��ڽ��� ������ �� ã��
	
//		if(Math.pow(i, 2) %10 ==i){
//			System.out.println(i);
//		}
//		else if(Math.pow(i, 2) %100 ==i){
//			System.out.println(i);
//		}
//		else if(Math.pow(i, 2) %1000 ==i){
//			System.out.println(i);
//		}
//		else if(Math.pow(i, 2) %10000 ==i){
//			System.out.println(i);
//		}
//		else if(Math.pow(i, 2) %10000 ==i){
//			System.out.println(i);
//		}
//		else if(Math.pow(i, 2) %100000 ==i){
//			System.out.println(i);
//		}
		}
		
	}
}

