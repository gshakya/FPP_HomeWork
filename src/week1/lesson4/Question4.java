package week1.lesson4;

public class Question4 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(SumOperation.sum(a, a.length-1));
		
	}
	
}

class SumOperation{
	public static int sum (int[] a , int n ){
		if (n ==0 ){
			return a[n];
		}
		else {
			return a[n]+sum(a,n-1);
		}
	}
}