package pro.sky.java.course1.coursework1;


public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee(
                "Иванов",
                "Иван",
                "Иванович",
                1,
                71800);
        employees[1] = new Employee(
                "Пронин",
                "Сергей",
                "Сергеевич",
                2,
                67342);
        employees[2] = new Employee(
                "Дмитриев",
                "Дмитрий",
                "Дмитриевич",
                3,
                89342);
        employees[3] = new Employee(
                "Николаев",
                "Илья",
                "Николаевич",
                4,
                48765);
        employees[4] = new Employee(
                "Константинов",
                "Константин",
                "Константинович",
                5,
                300000);
        employees[5] = new Employee(
                "Сарафанов",
                "Алексей",
                "Евгеньевич",
                2,
                23122);
        employees[6] = new Employee(
                "Александров",
                "Александр",
                "Александрович",
                4,
                102342);
        employees[7] = new Employee(
                "Захаров",
                "Александр",
                "Савельевич",
                5,
                99900);
        employees[8] = new Employee(
                "Лоскутов",
                "Дмитрий",
                "Витальевич",
                1,
                76344);
        employees[9] = new Employee(
                "Жаров",
                "Александр",
                "Иванович",
                3,
                69300);

        printAllEmployees();
        System.out.println("Сумма всех зарплат составляет: " + sumIncome());
        minIncomeEmployee();
        maxIncomeEmployee();
        averageIncome();
        printAllFullNames();
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static double sumIncome() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getIncome();
        }
        return sum;
    }
    public static void minIncomeEmployee() {
        Employee minIncomeEmployee = null;
        for (Employee employee : employees) {
            if (minIncomeEmployee == null || employee.getIncome() < minIncomeEmployee.getIncome()) {
                minIncomeEmployee = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minIncomeEmployee.getLastName()
                + " " + minIncomeEmployee.getFirstName()
                + " " + minIncomeEmployee.getMiddleName()
                + ", получает: " + minIncomeEmployee.getIncome());
    }
    public static void maxIncomeEmployee() {
        Employee maxIncomeEmployee = null;
        for (Employee employee : employees) {
            if (maxIncomeEmployee == null || employee.getIncome() > maxIncomeEmployee.getIncome()) {
                maxIncomeEmployee = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maxIncomeEmployee.getLastName()
                + " " + maxIncomeEmployee.getFirstName()
                + " " + maxIncomeEmployee.getMiddleName()
                + ", получает: " + maxIncomeEmployee.getIncome());
    }
    public static void averageIncome() {
        double sum = sumIncome();
        double averageIncome = sum / employees.length;
        System.out.println("Средняя величина зарплаты сосотавляет: " + averageIncome);
    }
    public static void printAllFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
        }
    }
}