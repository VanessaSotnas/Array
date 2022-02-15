package array;

import java.util.Scanner;

public class aplicacoes {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite quantos dados serao adicionados:");
    int n = sc.nextInt();
    Produto[] vect = new Produto[n];
    	
    for (int i = 0; i < n; i++) {
    	sc.nextLine();
    	System.out.print("Nome do produto: ");
    	String name = sc.nextLine();
    	System.out.print("Preco do produto: ");
        double price = sc.nextDouble();
        vect[i] = new Produto(name, price);
    }
    
    double soma = 0;
    for (int i = 0; i < n; i++) {
    	soma += vect[i].getPrice();
    }
		
    double media = 0;
    media = soma / n;
    
    System.out.println("Soma dos produtos: " + soma);
    System.out.printf("Media dos produtos: %.2f/n" , media);
    
	}

}
