package io.iprody.lessons.lesson9;

public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String surname, String patronymic,
                    String jobTitle, String email, String phoneNumber,
                    int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee {" + " name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", patronymic='" + patronymic + '\''
                + ", jobTitle='" + jobTitle + '\''
                + ", email='" + email + '\''
                + ", phoneNumber='" + phoneNumber + '\''
                + ", salary=" + salary
                + ", age=" + age + '}';
    }
}
