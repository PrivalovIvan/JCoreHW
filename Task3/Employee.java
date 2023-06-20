public class Employee implements Comparable<Employee> {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String post;
    private String numberPhone;
    private int oldSalary;
    private int newSalary;
    private int age;

    public Employee(String firstName, String lastName, String patronymic, String post, String numberPhone,
            int oldSalary, int newSalary,
            int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.post = post;
        this.numberPhone = numberPhone;
        this.oldSalary = oldSalary;
        this.newSalary = newSalary;
        this.age = age;
    }

    public void showInfo() {
        System.out.printf(
                "Ф.И.О Сотрудника: %s %s %s\nДолжность: %s\nНомер телефона: %s\nЗарплата ДО: %d\nЗарплата ПОСЛЕ: %d\nВозраст: %s\n------------------------------\n",
                firstName,
                lastName, patronymic, post, numberPhone, oldSalary, newSalary, age);
    }

    @Override
    public int compareTo(Employee em) {
        if (em.newSalary - this.newSalary == 0) {
            return this.getAge() - em.getAge();
        }
        return em.getNewSalary() - this.getNewSalary();

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getOldSalary() {
        return oldSalary;
    }

    public void setOldSalary(int oldSalary) {
        this.oldSalary = oldSalary;
    }

    public int getNewSalary() {
        return newSalary;
    }

    public void setNewSalary(int newSalary) {
        this.newSalary = newSalary;
    }

}
