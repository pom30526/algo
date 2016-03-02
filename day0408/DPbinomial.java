package day0408;

public class DPbinomial {
public static void main(String[] args) {
	int n=6;
	int k=2;
	System.out.print(dynBinomial(n, k));
}
public static long dynBinomial(int n,int k){
	if(n-k<k)
		k=n-k; //c부분 작은 값 선택
		
	int [][]b=new int[n+1][k+1];
	for(int i=0; i<=n;i++)
		for(int j=0;j<=Math.min(i, k);j++){
			if(j==0 || j==i)
				b[i][j]=1;
			else
				b[i][j]=b[i-1][j-1]+b[i-1][j];
		}
	return b[n][k];
	
}
}
