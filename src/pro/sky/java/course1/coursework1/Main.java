package pro.sky.java.course1.coursework1;

import java.util.Scanner;

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
                169300);


        printAllEmployees();
        System.out.println("==========================================================================");
        System.out.println("Сумма всех зарплат составляет: " + sumIncome());
        System.out.println("==========================================================================");
        minIncomeEmployee();
        System.out.println("==========================================================================");
        maxIncomeEmployee();
        System.out.println("==========================================================================");
        System.out.println("Средняя величина зарплаты сосотавляет: " + averageIncome());
        System.out.println("==========================================================================");
        printAllFullNames();
        System.out.println("==========================================================================");

//        Добавил ввод из консоли значения процента индексации зарплаты

        System.out.println("Введите процент индексации");
        Scanner scanner = new Scanner(System.in);

        double percentIncomeIncrease = scanner.nextDouble();
        increaseTenPercent(percentIncomeIncrease);
        System.out.println("==========================================================================");
        System.out.println("Введите номер отдела");
        int department = scanner.nextInt();
        minIncomeInDepartment(department);
        System.out.println("==========================================================================");
        maxIncomeInDepartment(department);
        System.out.println("==========================================================================");
        System.out.println("Сумма зарплат по отделу № " + department
                + " составляет: " + sumIncomeInDepartment(department));
        System.out.println("==========================================================================");
        System.out.println("Средняя величина зарплаты сосотавляет: " + averageIncomeInDepartment(department));
        System.out.println("==========================================================================");
        printEmployeesInDepartment(department);
    }
//    Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString))
    public static void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
//    Посчитать сумму затрат на зарплаты в месяц.
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
//    Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    public static double averageIncome() {
        double sum = sumIncome();
        double averageIncome = sum / employees.length;
        return averageIncome;
    }
//    Получить Ф. И. О. всех сотрудников (вывести в консоль).
    public static void printAllFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());
        }
    }
//    Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
    public static double increaseTenPercent(double percentIncomeIncrease) {

        double incomeIncrease = 0.0;
        double incomeWithIncrease = 0.0;
        for (Employee employee : employees) {
            incomeIncrease = employee.getIncome() / 100.0 * percentIncomeIncrease;
            incomeWithIncrease = employee.getIncome() + incomeIncrease;
            System.out.println("Зарплата сотрудника " + employee.getLastName()
                    + " " + employee.getFirstName()
                    + " " + employee.getMiddleName()
                    + " выросла на " + incomeIncrease
                    + " и составляет " + incomeWithIncrease);
        }
        return percentIncomeIncrease;
    }
//  Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
//    Сотрудника с минимальной зарплатой.
    public static void minIncomeInDepartment(int department) {
        Employee minIncomeEmployee = null;
        int numb = department;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numb) {
                if (minIncomeEmployee == null || employee.getIncome() < minIncomeEmployee.getIncome()) {
                    minIncomeEmployee = employee;
                }
            }
        }
        System.out.println("В отделе № " + numb
                + " сотрудник с минимальной зарплатой: " + minIncomeEmployee.getLastName()
                + " " + minIncomeEmployee.getFirstName()
                + " " + minIncomeEmployee.getMiddleName()
                + ", получает: " + minIncomeEmployee.getIncome());
    }
//   Сотрудника с максимальной зарплатой.
    public static void maxIncomeInDepartment(int department) {
        Employee maxIncomeEmployee = null;
        int numb = department;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numb) {
                if (maxIncomeEmployee == null || employee.getIncome() > maxIncomeEmployee.getIncome()) {
                    maxIncomeEmployee = employee;
                }
            }
        }
        System.out.println("В отделе № " + numb
                + " сотрудник с максимальной зарплатой: " + maxIncomeEmployee.getLastName()
                + " " + maxIncomeEmployee.getFirstName()
                + " " + maxIncomeEmployee.getMiddleName()
                + ", получает: " + maxIncomeEmployee.getIncome());
    }
//   Сумму затрат на зарплату по отделу.
    public static double sumIncomeInDepartment(int department) {
        double sum = 0;
        int numb = department;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numb) {
                sum += employee.getIncome();
            }
        }
        return sum;
    }
//   Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length)
    public static double averageIncomeInDepartment(int department) {
        double sum = 0;
        int numb = department;
        int counter = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numb) {
                sum += employee.getIncome();
                counter++;
            }
        }return sum / counter;
    }
//   Напечатать всех сотрудников отдела (все данные, кроме отдела).
    public static void printEmployeesInDepartment(int department) {
        int numb = department;
        System.out.println("В отделе № " + numb + " числятся следующие сотрудники:");
        for (Employee employee : employees) {
            if (employee.getDepartment() == numb) {
                System.out.println(employee.getLastName() + " "
                        + employee.getFirstName() + " "
                        + employee.getMiddleName()
                        + " с зарплатой: " + employee.getIncome());
            }
        }
    }
}