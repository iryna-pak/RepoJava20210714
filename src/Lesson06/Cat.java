package Lesson06;

public class Cat extends Animals {
    Cat(int run_limit, int swim_limit) {
        super(run_limit, swim_limit);  // вызываю конструктор Animals
    }

    @Override
    void swim(int length) {
        System.out.println("--------------" + getClass() + "--------------");
        System.out.println("Заданная дистанция заплыва: " + length + ". Заданный лимит заплыва: " + swim_limit);
        System.out.println("Внимание - Кот не умеет плавать!!!");  // выполнение метода переписано под тз кота
    }


}

