package week1.lesson4;


public class Question3 {
	public static void main(String[] args) {
		int[] a = { 1, 5, 8, 9, 14, 27, 28, 33, 45 };
		System.out.println(BinarySearch.search(a, 33, a.length / 2));

	}
}

class BinarySearch {
	public static int search(int[] arr, int element, int pos) {
		if (arr[pos] == element)
			return pos;
		if (arr[pos] > element)
			return search(arr, element, ((0 + pos) / 2));
		else
			return search(arr, element, ((pos + arr.length - 1) / 2));
	}
}
