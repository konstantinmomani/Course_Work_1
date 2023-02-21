package pro.sky.java.course1.coursework1;

public class Employee {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private int department;
    private double income;
    private int id;
    public static int idCounter;

    public Employee(String lastName, String firstName, String middleName, int department, double income) {
        idCounter++;
        this.id = idCounter;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.income = income;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public double getIncome() {
        return income;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setIncome(double income) {
        this.income = income;
    }
    public String toString() {
        return "ID: " + id + " "
                + "ФИО: " + lastName + " " + firstName + " " + middleName + " "
                + "Отдел: " + department + " "
                + "Зарплата: " + income + " ";
    }
}
