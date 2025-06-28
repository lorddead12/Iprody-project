package io.iprody.lessons.lesson7;

public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private int age;

    public Employee(String surname, String name, String patronymic,
                    String jobTitle, String email, String phoneNumber,
                    int age) {

        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
}
