package GameStore;
import java.util.Scanner;
public class StorePurchase {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int choice=scan.nextInt();
		
		while(choice<=6) {
			System.out.println("Enetr your choice");
			switch(choice) {
			case 1:
				System.out.println("1.call of warfar");
				int a=1500;
				continue;
			case 2: 
				System.out.println("2.speed racers");
				int b=1200;
				continue;
			case 3: 
				System.out.println("3.Mystery Mansion ");
				int c=1000;
				continue;
				
			case 4: 
				System.out.println("4.Pixel Adventure");
				int d=800;
				continue;
				
			case 5: 
				System.out.println("5.Puzzle Mania");
				int e=500;
				continue;
			case 6:
				System.out.println("end shopping");
			
				System.exit(choice);
				
			}
			System.out.println("how many copies do you want");
			int num=scan.nextInt();
		}
	   	

	}

}
