package day0408;

public class BinomialDc {
public static void main(String[] args) {
	int n=5;
	int k=2;
	System.out.println(recBinomial(n,k));
}
//Àç±Í·Î Ç®¾î³Â½À´Ï´Ù
private static long recBinomial(int n, int k) {
	// TODO Auto-generated method stub
	if(k==0 || n==k){
		return 1;
	}
	return recBinomial(n-1, k-1)+recBinomial(n-1, k);
}
}
