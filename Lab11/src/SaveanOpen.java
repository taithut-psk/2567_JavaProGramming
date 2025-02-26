import java.util.*;
import java.io.*;

public class SaveanOpen extends Employee {

    private String name;
    private String dept;

    void insert() throws IOException {

        Scanner input = new Scanner(System.in);
        PrintStream writefile = new PrintStream(new File("src//txtFile//employee.txt"));
        String answer;

        do {

            super.header();
            System.out.print("Enter name: ");
            name = input.next();

            System.out.print("Enter department: ");
            dept = input.next();

            writefile.println(name + "\t" + dept);

            System.out.print("Do you want to input data again?:");
            answer = input.next();

        } while (answer.equalsIgnoreCase("y"));
    }

    void searchData() {

        try {

            Scanner readFile = new Scanner(new File("src//txtFile//employee.txt"));
            int i = 0;
            boolean check = false;
            super.header();

            while (readFile.hasNext()) {

                name = readFile.next();
                dept = readFile.next();

                if (dept.equalsIgnoreCase(super.getDept(dept))) {
                    i++;
                    System.out.println(i + ")" + name);
                    check = true;
                }
            }

            if (check) {
                super.header();
                System.out.print("Employee in dept " + super.getDept() + " is " + i + " person(s).");
                System.out.println();
                super.header();
            } else {
                System.out.println("\nSorry, no dept: " + super.getDept() + " in file.");
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("\nSorry, file not found...");
        }
    }
}
