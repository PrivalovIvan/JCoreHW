import java.util.List;

public class Manager extends Employee {

    public Manager(String firstName, String lastName, String patronymic, String post, String numberPhone, int oldSalary,
            int newSalary, int age) {
        super(firstName, lastName, patronymic, post, numberPhone, oldSalary, newSalary, age);
    }

    public static void salaryUpExceptForManagers(List<Employee> employees, int percent) {
        for (int i = 0; i < employees.size(); i++) {
            if (!(employees.get(i) instanceof Manager)) {
                employees.get(i).setNewSalary(
                        employees.get(i).getOldSalary() / 100 * percent + employees.get(i).getOldSalary());
            } else {
                employees.get(i).setNewSalary(employees.get(i).getOldSalary());
            }
        }

    }

}