package funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner(System.in);	
		
	List<Employee> list = new ArrayList<>();
	
	System.out.print("How many employees will be registered?");
	int n = sc.nextInt();
	
    //List <Integer> id = new ArrayList<>();
    //List <String> name = new ArrayList<>();    Nao serao necessarios.
    //List <Double> salary = new ArrayList<>();  Instanciar um nome objeto com os 3 atributos. 

    for (int i = 0; i < n; i++) {
    	System.out.println();
    	System.out.println("Employee #" + (i+1) + " :");
    	System.out.print("Id: ");
        Integer id = sc.nextInt();  
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine(); 
        System.out.print("Salary: ");
        Double salary = sc.nextDouble(); 
    
   // Criar um funcionario para instanciar os objetos. Dentro do 'for'.
        
        Employee emp = new Employee (id, name, salary);
        list.add(emp);    
     }
    
   System.out.println("Enter the employee id that will have salary increase:");
   int idsalary = sc.nextInt(); 
   
   Integer pos = position(list, idsalary);
   
   // Outra forma de encontrar o id escrito em 'idsalary' dentro da lista 'list' formatada em 'Employee emp'
   // Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
   // Colocar em comentario "Integer pos = position(list, idsalary);" Linha 43.
   
   if (pos == null) {
	   System.out.println("This id does not exist! "); }
   else {
	   System.out.print("Enter the percentage: ");
	   double porcentage = sc.nextInt();
	   list.get(pos).increaseSalary(porcentage);
   }
   
		   
   System.out.println();
   System.out.println("List of employee: ");
   for (Employee emp : list) {
	   System.out.println(emp);
   }
      
    
    sc.close();    
    
}

	public static Integer position(List<Employee> list, int id) {
		for (int i=0; i < list.size(); i++) {
			if (list.get(i).getId() == id); {
			return i;
	    	}
    	}
	return null;
    }
}
