package week3.lesson12;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < numer.length; i++) {
			try {

//				if (i >= denom.length) {
//					throw (new IllegalArgumentException("No value in Denominator"));
//				}

				if (denom[i] == 0) {
					throw (new ArithmeticException("Denominator Is zero"));
				}

				System.out.println("Numer[" + i + "]/denom[" + i + "] = " + numer[i] / denom[i]);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
//			} catch (IllegalArgumentException e) {
//				System.out.println(e.getMessage());
//			}		
			catch (IndexOutOfBoundsException e){
				System.out.println("No value in Denominator");
			}
		}
	}

}
