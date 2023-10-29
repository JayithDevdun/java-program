import java.util.*;

public class calculatearea{

	public static void main(String[] args){

	calculatearea();



	}

	public static void calculatearea(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter width");

	        int width = sc.nextInt();

		

		System.out.println("Enter length");

	        int length = sc.nextInt();

		

		int area = width*length;

		System.out.println("area is"+" "+area);

		sc.close();

		

		

	}

}
