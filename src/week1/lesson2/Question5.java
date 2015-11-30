package week1.lesson2;

import java.util.Arrays;

public class Question5 {
	public static void main(String args[]) {
		String[] rawArr = { "dog", "dog", "horse", "dog", "cat", "man",
				"horse", "dog" };
		String[] tempArr = new String[rawArr.length];
		int uniqueEleIndex = 0;

		for (String strElement : rawArr) {
			Boolean dupFlag = false;
			// System.out.println("strElement: "+ strElement);

			for (int i = 0; i < uniqueEleIndex; i++) {

				// System.out.println("Temp Array Element , Array Index "+
				// tempArr[i]+" : "+ i);
				if (strElement.equals(tempArr[i])) {
					dupFlag = true;
					// System.out.println("Duplicate Found: "+ strElement);
					break;
				}
			}
			if (!dupFlag) {
				tempArr[uniqueEleIndex] = strElement;
				// System.out.println("Element Added: "+
				// Arrays.toString(tempArr));
				uniqueEleIndex++;
			}
		}

		String[] finalRes = new String[uniqueEleIndex];

		System.arraycopy(tempArr, 0, finalRes, 0, uniqueEleIndex);

		System.out.println(Arrays.toString(finalRes));

	}
}
