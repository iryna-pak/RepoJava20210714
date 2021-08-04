package Lesson06;

public class Animals {
    protected int run_limit;
    protected int swim_limit;

    protected int run_distance;
    protected int swim_distance;

    private static int counter;

    {
        counter++;
    }

    public Animals(int run_limit, int swim_limit) {
        this.run_limit = run_limit;
        this.swim_limit = swim_limit;
        this.run_distance = 0;
        this.swim_distance = 0;
    }



    void run(int length) {

        System.out.println("--------------" + getClass() + "--------------");

        if (run_distance + length <= run_limit) {
            run_distance += length; // накапливающий счётчик пробега
            System.out.println("Заданная дистанция забега: " + length + ". Заданный лимит пробега: " + run_limit +
                    ". Всего пробега " + run_distance);
        } else {
            run_distance = run_limit; // добегает до лимита
            System.out.println("Дистаниция не должна превышать лимит!!!");
            System.out.println("Заданная дистанция забега: " + length + ". Заданный лимит пробега: " + run_limit +
                    ". Всего пробега " + run_distance + ". Достигнут лимит пробега. Дальше бежать нельзя!");
        }
    }

    void swim(int length) {

        System.out.println("--------------" + getClass() + "--------------");
        if (swim_distance + length <= swim_limit) {
            swim_distance += length;
            System.out.println("Заданная дистанция заплыва: " + length + ". Заданный лимит заплыва: " + swim_limit +
                    ". Всего заплыва " + swim_distance);
        }
        else {
            swim_distance = swim_limit;
            System.out.println("Дистаниция не должна превышать лимит!!!");
            System.out.println("Заданная дистанция заплыва: " + length + ". Заданный лимит заплыва: " + swim_limit +
                    ". Всего заплыва " + swim_distance + ". Достигнут лимит заплыва. Дальше плыть нельзя!");
        }
    }


    public static int getNumOfInstances() { //подсчёт колличества экземпляров
        return counter;
    }

}



