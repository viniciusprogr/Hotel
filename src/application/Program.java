package application;

import java.util.Scanner;

import etities.Usuario;

public class Program {

	public static void main(String[] args) {
		//scanner
		
		
		Scanner sc = new Scanner(System.in);
		
		Usuario[] vect = new Usuario[10];
		
		System.out.println("Quartos quartos deseja alugar?");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Usuario #"+ i + ":" );
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("quarto: ");
			int quarto = sc.nextInt();
			
			vect[quarto] = new Usuario(name,email);
		}
		
		System.out.println("");
		System.out.println("Quartos alugados: ");
		for (int i = 0; i < 10; i++) {
			if(vect[i]!=null) {
				System.out.println("numero do quarto " + i+ ": nome :" + vect[i].getName() + ", email : " + vect[i].getEmail());
			}
			
		}
		
		sc.close();
	}
}
