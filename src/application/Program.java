package application;

import java.util.Scanner;

import model.Parallelepiped;

public class Program {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter with height: (cm)  ");
	double height = sc.nextDouble();
	
	System.out.print("Enter with depth: (cm)");
	double depth = sc.nextDouble();
	
	System.out.print("Enter with width (cm) ");
	double width = sc.nextDouble();
	
	Parallelepiped p = new Parallelepiped( depth,  width,  height);
	
	
	System.out.println();
	System.out.println();

	System.out.println(p.toString());
	
	
	
	sc.close();
	
	
	}

}
