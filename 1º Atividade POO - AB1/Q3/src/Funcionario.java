import java.util.Locale;
import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        
        System.out.printf("Employee: " + emp.name + ", $ %.2f", (emp.grossSalary - emp.tax));

        System.out.print("\nWhich percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        
        emp.value = ((emp.grossSalary - emp.tax) + ((emp.grossSalary) * 0.10));
        System.out.printf("Updated data: " + emp.name + ", $ %.2f", emp.value);
        sc.close();
        }
       }