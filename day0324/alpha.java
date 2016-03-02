package day0324;

public class alpha {
public static void main(String[] args) {
	String a[] = {"A","B","C","D","E","F","G","H","I","J","K"
			,"L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a.length;j++){
			for(int z=0; z<a.length;z++){
				System.out.print(a[i]+""+a[j]+""+a[z]+" ");
			}
		}
	}
}
}
