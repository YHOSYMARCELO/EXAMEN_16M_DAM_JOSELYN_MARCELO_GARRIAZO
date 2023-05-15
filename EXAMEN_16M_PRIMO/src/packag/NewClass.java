package packag;

import java.util.Scanner;

public class NewClass {
	public static void main(String args[]) {
		System.out.println("Buenos días Ceinmak, Soy Joselyn Marcelo");
		Scanner sc= new Scanner(System.in); 
		System.out.println("Introduce un numero para averiguar si es primo o no");
		int num=sc.nextInt(); 
		//System.out.println(num);
		//hariamos un while luego hariamos un if para ver si es prmo o no el numero 
		if(num==1) {
			System.out.println("Es primo");
		}
		else {
		for (int i=2; i< num;i++) {
				if(num%i!=0 ) {
				System.out.println("ES PRIMO");break;
				}
				else {
					System.out.println("no es primo");break;
				}
			}
		}}
	}

