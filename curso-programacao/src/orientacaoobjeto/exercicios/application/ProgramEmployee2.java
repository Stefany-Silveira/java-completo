package orientacaoobjeto.exercicios.application;

import orientacaoobjeto.exercicios.entities.Employee2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee2> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int N = scanner.nextInt();

        for (int i=0; i<N; i++) {

            System.out.println();
            System.out.println("Emplyoee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id already taken! Try again: ");
                id = scanner.nextInt();
            }

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            Double salary = scanner.nextDouble();

            Employee2 emp = new Employee2(id, name, salary);

            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int idsalary = scanner.nextInt();

        // Integer pos = position(list, idsalary);

        Employee2 emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

        // if (pos == null) {
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = scanner.nextDouble();
            //list.get(pos).increaseSalary(percent);
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee2 e : list) {
            System.out.println(e);
        }

        scanner.close();
    }

    public static Integer position(List<Employee2> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee2> list, int id) {
        Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
