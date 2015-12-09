package week3.lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Marketing {
	private String employeeName;
	private String productName;
	private double salesAmount;
	private static boolean ignoreCase = true;

	public static void setIgnoreCase(boolean b) {
		ignoreCase = b;
	}

	public static enum SortMethod {
		BY_EMP_NAME, BY_SALES_AMT
	};

	Marketing(String employeeName, String productName, double salesAmount) {
		this.employeeName = employeeName;
		this.productName = productName;
		this.salesAmount = salesAmount;
	}

	@Override
	public String toString() {
		return "\nEmployee Name=" + employeeName + "\nProduct Name=" + productName + "\nSales Amount=" + salesAmount;
	}

	public static void  sort(List<Marketing> mars, SortMethod method){
		Collections.sort(mars,(e1,e2)->
		{
			if(method == SortMethod.BY_EMP_NAME) {
				//instance vble ignoreCase does not need to be effectively final
				if(ignoreCase) return e1.employeeName.compareToIgnoreCase(e2.employeeName);
				else return e1.employeeName.compareTo(e2.employeeName);
			} else {
				if(e1.salesAmount == e2.salesAmount) return 0;
				else if(e1.salesAmount < e2.salesAmount) return -1;
				else return 1;
			}
		});
	}

}

public class Question2 {
	public static void main(String[] args) {
		ArrayList<Marketing> marketingLists = new ArrayList<>();
		Marketing m1 = new Marketing("Gunjan", "Sony", 300);
		Marketing m2 = new Marketing("Prabhat", "LG", 400);
		Marketing m3 = new Marketing("Samrat", "Acer", 250);

		marketingLists.add(m1);
		marketingLists.add(m2);
		marketingLists.add(m3);

		System.out.println("-------AFTER ADDITION--------");
		System.out.println(marketingLists);

		marketingLists.remove(new Marketing("Prabhat", "LG", 400)); // Removes
																	// if equals
																	// Method is
																	// overridden
		System.out.println("-------AFTER REMOVING USING NEW OBJECT--------");
		System.out.println(marketingLists);

		marketingLists.remove(m1);
		System.out.println("-------AFTER REMOVING USING OBJECT REFRENCE--------");
		System.out.println(marketingLists);

		marketingLists.remove(0);
		System.out.println("-------AFTER REMOVING USING INDEX--------");
		System.out.println(marketingLists);

		marketingLists.set(0, new Marketing("Madan", "Toshiba", 500));
		System.out.println("-------AFTER SETTING EXISTING ELEMENT--------");
		System.out.println(marketingLists);
		
		marketingLists.add(m1);
		marketingLists.add(m2);
		marketingLists.add(m3);
		
		Marketing.sort(marketingLists, Marketing.SortMethod.BY_EMP_NAME);
		System.out.println("-------AFTER SORTING USING EMPLOYEE NAME--------");
		System.out.println(marketingLists);
		
		Marketing.sort(marketingLists, Marketing.SortMethod.BY_SALES_AMT);
		System.out.println("-------AFTER SORTING USING SALES AMOUNT--------");
		System.out.println(marketingLists);

	}

}
