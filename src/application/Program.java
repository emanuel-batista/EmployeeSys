package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        List<Employee> list = new ArrayList<>();
        Integer id;
        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1));
            System.out.print("Id: ");
            id = sc.nextInt();
            Integer finalId = id;
            Boolean aux = list.stream().anyMatch(x -> x.getId().equals(finalId));
            if (aux){
                System.out.print("Id already exists, fatal error");
                System.exit(0);
            }
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee e = new Employee(id, name, salary);
            list.add(e);
        }

        System.out.printf("%nEnter the employee id that will have salary increase : ");
        Integer eId = sc.nextInt();
        System.out.print("Enter the percentage: ");
        Double ePercent = sc.nextDouble();
        
        for(int i = 0; i < list.size(); i++){
            if (list.get(i).getId().equals(eId)) {
                list.get(i).setSalary(list.get(i).getSalary() + (list.get(i).getSalary() * ePercent / 100));
            }
        }

        System.out.printf("%nList of employees:%n");
        for (Employee x : list){
            System.out.println(x);
        }

    }
}
