package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> lista = new ArrayList<>();
		
		int qtd;
		boolean test = false;
		int func;
		double percentage;
				
		System.out.print("How many employees will be registered? ");
		
		qtd = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= qtd; i++) {
			System.out.println();
			System.out.println("Employee #" + i);
			System.out.print("Id: ");
			int id;
			do {
				test = false;
				id = sc.nextInt();
				sc.nextLine();				
				for(Employee x : lista) {
					if(x.getId() == id) {
						System.out.println("id's already registered, try again!!");
						test = true;
					}
				}
			} while(test);
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			lista.add(new Employee(id, name, salary));
		}		
		
		System.out.println("");
		System.out.print("Enter the employee id that will have salary increase: ");
		func = sc.nextInt();
		sc.nextLine();		
		
		for(Employee x : lista) {
			if(x.getId() == func) {
				System.out.print("Enter the percentage: ");
				percentage = sc.nextDouble();
				x.increaseSalary(percentage);
				test = true;
				break;
			}			
		}
		if(test != true){
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee x : lista) {			
			System.out.printf("%d, %s, %.2f%n", x.getId(), x.getName(), x.getSalary());		
		}
		sc.close();
		
	}

}
