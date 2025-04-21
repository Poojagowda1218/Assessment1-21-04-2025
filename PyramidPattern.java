package Pyramid;
import java.util.Scanner;
public class PyramidPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("*");
			
		}

	}

}
