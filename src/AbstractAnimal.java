 abstract class AbstractAnimal {
    abstract void makeSound();

    void doMove() {

    }
}
class Cat extends AbstractAnimal {

    @Override
    void makeSound() {
        System.out.println("Mau!");
    }
}
class Dog extends AbstractAnimal {
    @Override
    void makeSound() {
        System.out.println("Gav!");
    }
}
abstract class Cow extends AbstractAnimal {

    abstract void doRun();
}

class MegaCow extends Cow {

    @Override
    void makeSound() {

    }

    @Override
    void doRun() {

    }
}
