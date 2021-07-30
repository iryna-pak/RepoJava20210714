package Lesson05;
//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2. Конструктор класса должен заполнять эти поля при создании объекта.
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.


public class Employee {
    /**
     * поля класса Employee
     */
    String fullName;
    String position;
    String email;
    String phoneNumber;

    int salary;
    int age;

    /**
     * Конструктор.
     * Ключевое слово this применяется для того, чтобы отличить аргумент конструктора от поля объекта.
     */
    Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    /**
     *  это метод вывода в консоль поступивших данных в конструктор
     */
    void fullInfoPrint() {
        System.out.println("fullName: " + fullName + ",  position: " + position
                + ", email: " + email + ",  phoneNumber: " + phoneNumber + ", salary: " + salary + ", age: "
                + age);
    }
}
