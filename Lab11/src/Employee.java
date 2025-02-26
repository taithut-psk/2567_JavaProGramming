public class Employee {
    private String dept;

    void setDept(String dept) {
        this.dept = dept;
    }

    String getDept(String dept) {
        return this.dept;
    }

    void header() {
        for (int i = 1; i < 50; i++)
            System.out.print("*");
        System.out.println();
    }
}
