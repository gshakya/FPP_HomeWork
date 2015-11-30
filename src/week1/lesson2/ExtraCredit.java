package week1.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class ExtraCredit {
	public static void main (String[] args){
		System.out.println("Enter four Digit number: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		
		int [] ip =new int[4];
		for (int i=3;i>=0;i--){
			ip[i]=num%10;
			num=num/10;
		}
		
		
		System.out.println(Arrays.toString(decrypt(encrypt(ip))));
	}
	
	public static int[] encrypt (int[] ip){
		int[] encryptVal  = new int[ip.length];
		for (int i = 0 ; i< ip.length ; i++){
			encryptVal[i]=(ip[i]+7)%10;
		}
		int [] returnVal={encryptVal[2],encryptVal[3],encryptVal[0],encryptVal[1]};
		
		return returnVal;
	}
	
	public static int[] decrypt (int[] ip){
		int[] decryptVal  = new int[ip.length];
		for (int i = 0 ; i< ip.length ; i++){
			decryptVal[i]=(ip[i]+3)%10;
		}
		int [] returnVal={decryptVal[2],decryptVal[3],decryptVal[0],decryptVal[1]};
		
		return returnVal;
	}
	
}
