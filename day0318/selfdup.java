package day0318;


public class selfdup {
public static void main(String[] args) {
	for(int i=1; i<=10000;i++){
		/* 
		 * 정규식방법
		 */
		 if (Integer.toString(i*i).matches(".*" + Integer.toString(i) + "$")) {
             System.out.println(i);
         }
//자기 자신을 제곱하여 끝자리수가 자기자신이 나오는 것 찾기
	
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

