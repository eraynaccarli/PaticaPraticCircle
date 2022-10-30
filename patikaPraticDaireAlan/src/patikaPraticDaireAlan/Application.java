package patikaPraticDaireAlan;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
	
		final double pi = 3.14;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter radius: ");
		double radius = sc.nextDouble();
		
		System.out.println("enter center angle : ");
		double centerAngle = sc.nextDouble();
		
		double area = pi*(radius*radius)*centerAngle;
		
		System.out.println("Circle area: " + area);
		
	}
	
	

}
