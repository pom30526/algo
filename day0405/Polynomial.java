package day0405;

import java.util.LinkedList;
import java.util.ListIterator;

public class Polynomial {
public static void main(String[] args) {
	LinkedList<Term> p1 = new LinkedList<Term>();
	 p1.add(new Term(5, 5));
	   p1.add(new Term(-14, 3));
	   p1.add(new Term(2, 2));
	   p1.add(new Term(-1, 1));
	   p1.add(new Term(1, 0));
		  
	   LinkedList<Term> p2 = new LinkedList<Term>();
	   p2.add(new Term(3, 5));
	   p2.add(new Term(6, 4));
	   p2.add(new Term(14, 3));
	   p2.add(new Term(1, 2));
	   p2.add(new Term(2, 1));
	   p2.add(new Term(-1, 0));
	   
	   LinkedList<Term> result = addPolynimial(p1, p2);
	   printPolynimial(p1);
	   printPolynimial(p2);
	   printPolynimial(result);
}
public static LinkedList<Term> addPolynimial(LinkedList p1, LinkedList p2){
	int factor = 0;
	int a = p1.size();
	int temp = 0;
	int b = p2.size();
	int count = 0;
	LinkedList<Term> p3 = new LinkedList<Term>();
	//가장 높은 차수를 찾는것 
	while (a >= 0) {
		Term t = (Term) p1.get(count);
		if (t.exponent >= temp) {
			temp = t.exponent;
		}
		if (count < p1.size()) {
			break;
		}
		count++;
	}


	while (temp >= 0) {
		for (int i = 0; i < p1.size(); i++) {
			Term t = (Term) p1.get(i);
			if (t.exponent == temp)
				factor += t.factor;
		}
		for (int j = 0; j < p2.size(); j++) {
			Term t2 = (Term) p2.get(j);
			if (t2.exponent == temp)
				factor += t2.factor;
		}

		if (factor != 0) {
			p3.add(new Term(factor, temp));
			factor = 0;
		}
		temp--;

	}
	return p3;
	
	
	
}
public static void printPolynimial(LinkedList<Term> p){
	for(int i=0;i<p.size();i++){
		Term t = p.get(i);
		if(t.factor >0){
			System.out.print("+"+t.factor+"x"+t.exponent+" ");
		}else{
			System.out.print(t.factor+"x"+t.exponent+" ");
		}
			
	}
	System.out.println();
}
}
