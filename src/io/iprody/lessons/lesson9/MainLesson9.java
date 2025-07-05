package io.iprody.lessons.lesson9;

import com.github.javafaker.Faker;

import java.util.Locale;

public class MainLesson9 {

    private static final Faker faker = new Faker(new Locale("en-US"));

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        testFaker(employees);
    }

    public static void testFaker(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            String name = faker.name().firstName();
            String surname = faker.name().lastName();
            // для отчества метода не нашел
            String patronymic = faker.name().suffix();
            String jobTitle = faker.job().title();
            String email = faker.internet().emailAddress();
            String phoneNumber = faker.phoneNumber().cellPhone();
            int salary = faker.number().numberBetween(50_000, 100_000);
            int age = faker.number().numberBetween(18, 60);

            employees[i] =
                    new Employee(
                            name, surname, patronymic,
                            jobTitle, email, phoneNumber,
                            salary, age);
        }

        for (var employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}
