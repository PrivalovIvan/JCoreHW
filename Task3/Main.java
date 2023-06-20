import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> listEmp = new ArrayList<Employee>();
        listEmp.add(new Manager("ivan1", "Ivanov1", "ivanovich1", "Директор1", "89823456789", 750000, 0, 27));
        listEmp.add(new Manager("ivan2", "Ivanov2", "ivanovich2", "Зам.директора", "89823456789", 250000, 0, 45));
        listEmp.add(new Manager("ivan3", "Ivanov3", "ivanovich3", "начальник отдела", "89823456789", 70000, 0, 50));
        listEmp.add(new Employee("ivan4", "Ivanov4", "ivanovich4", "рабочий", "89823456789", 15000, 0, 35));
        listEmp.add(new Employee("ivan9", "Ivanov9", "ivanovich4", "рабочий", "89823456789", 15000, 0, 28));
        listEmp.add(new Employee("Oleg5", "Olegov", "Olegivich", "Специалист", "+789456123", 20000, 0, 27));
        listEmp.add(new Employee("Oleg6", "Olegov", "Olegivich", "Специалист", "+789456123", 15000, 0, 25));
        listEmp.add(new Employee("Oleg7", "Olegov", "Olegivich", "Специалист", "+789456123", 27000, 0, 30));
        listEmp.add(new Employee("Oleg8", "Olegov", "Olegivich", "Специалист", "+789456123", 20000, 0, 29));

        Manager.salaryUpExceptForManagers(listEmp, 10);
        Collections.sort(listEmp);

        for (Employee employee : listEmp) {
            employee.showInfo();
        }
    }

}
