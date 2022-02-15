package array;

import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Quantos estudades vao alugar um quarto? ");
		int n = sc.nextInt();
		
		Quartos[] vect = new Quartos[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Numero do quarto :");
			int numeroQuarto = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome do locatario: ");
			String nomeLocatario = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Preco aluguel: ");
			double precoAluguel = sc.nextDouble();
			vect[i] = new Quartos(numeroQuarto, nomeLocatario, email, precoAluguel);  
		}
		
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < n; i++) {
			if (vect[i] != null) {
				System.out.println("Quarto " + vect[i].getNumeroQuarto() + " : " + 
			                        vect[i].getNomeLocatario() + ", " +
						            vect[i].getEmail() + "." );
			}
		}
		
	sc.close();	
		
	}

}
