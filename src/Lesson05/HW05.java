package Lesson05;
//4. Создать массив из 5 сотрудников.
//Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

public class HW05 {

    public static void main(String[] args) {
        /**
         * Employee[] employeeArr = new Employee[5] - Создание массива длиной 5 для объектов
         * new Employee = слово Employee есть вызов конструктора класса Employee
         */
        Employee[] employeeArr = new Employee[5];

        /**
         * Заполнение массива данными. Инициализация объектов
         */
        employeeArr[0] = new Employee("AAA", "manager1", "1@qqq.mail.ru", "+7000000001", 15001, 45);
        employeeArr[1] = new Employee("BBB", "manager2", "2@qqq.mail.ru", "+7000000002", 15002, 38);
        employeeArr[2] = new Employee("CCC", "manager3", "3@qqq.mail.ru", "+7000000003", 15003, 55);
        employeeArr[3] = new Employee("DDD", "manager4", "4@qqq.mail.ru", "+7000000004", 15004, 40);
        employeeArr[4] = new Employee("EEE", "manager5", "5@qqq.mail.ru", "+7000000005", 15005, 20);

        /**
         * Если параметр возраста объекта > 40, то вызывается метод вывода в консоль данных объекта
         */
        for (int i = 0; i < employeeArr.length; i++) {
            if(employeeArr[i].age > 40) {
                employeeArr[i].fullInfoPrint();
            }
        }
    }
}
