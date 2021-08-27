package HW6_Teacher;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 29.07.2021
 */
class Dog extends Animal {

    public static int countDog = 0;
    private static final String thisTypeAnimal = "Dog";

    Dog(String name, float maxJump, float maxRun, float maxSwim) {
        super(thisTypeAnimal, name, maxJump, maxRun, maxSwim);
        ++countDog;
    }



}
