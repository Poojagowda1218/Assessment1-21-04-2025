package Palindrome;
import java.util.Scanner;
public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr a number:");
		int num=scan.nextInt();
		int original=num;
		int reverse=0;
		while(num!=0) {
			reverse=reverse*10+num%10;
			num=num/10;
		}
		if(original==reverse) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not a palindrome");
		}
	}

}
