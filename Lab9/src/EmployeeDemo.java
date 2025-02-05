import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Input employee id : ");
        String empId = scn.next();
        scn.nextLine();

        System.out.print("Input employee name : ");
        String empName = scn.next();

        System.out.print("Input employee salary : ");
        double empSalary = scn.nextDouble();

        System.out.print("Input employee sales : ");
        double empSales = scn.nextDouble();

        System.out.println();

        Sales emp1 = new Sales(empId, empName, empSalary, empSales);

        System.out.println(emp1);
    }
}
