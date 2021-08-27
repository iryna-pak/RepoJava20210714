package HW6_Teacher;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 29.07.2021
 */
class Cat extends Animal {

    public static int countCat = 0;
    private static final String thisTypeAnimal = "Cat";

    Cat(String name, float maxJump, float maxRun, float maxSwim) {
        super(thisTypeAnimal, name, maxJump, maxRun, maxSwim);
        ++countCat;
    }

    @Override
    protected int swim(float distance) {
        return Animal.SWIM_NONE;
    }

}

