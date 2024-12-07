import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Worker("2312", "yahali", "liberman", "1235", new BirthDate(1993, 3, 31), "123", "rnd", new BirthDate(2005, 3, 14), 40, 140));
        employees.add(new SalesMan("43242", "noam", "tahar", "2144", new BirthDate(1974, 1, 7), "456", "Sales", new BirthDate(2002, 1, 7), 20000));
        employees.add(new Manager("1231", "yuval", "chen", "5332", new BirthDate(2001, 11, 16), "789", "Management", new BirthDate(1995, 8, 22), 30000));
        employees.add(new SeniorManager("4444", "liam", "turgeman", "1010", new BirthDate(2009, 8, 1), "112", "Senior Management", new BirthDate(1988, 3, 9), 35000, 40000));

        for (Employee employee : employees) {
            System.out.println(employee.getClass().getSimpleName() + " Salary: " + employee.salary());
        }
        }
    }
