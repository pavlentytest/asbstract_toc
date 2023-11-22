public class Main {
    public static void main(String[] args) {

       // абстракция

        AbstractAnimal abstractAnimal = new AbstractAnimal();

        Cat barsik = new Cat();
        Dog bobik = new Dog();

        Cow cow = new Cow() {
            @Override
            void doRun() {

            }

            @Override
            void makeSound() {

            }
        };

        cow.doRun();
        cow.makeSound();


        Switchable switchable = new Switchable() {
            @Override
            public void switchOn() {

            }

            @Override
            public void switchOff() {

            }
        };
        switchable.switchOn();
        switchable.switchOff();


        Calculable calculable = (a, b) -> {
            for(int i=0;i<10;i++) {
                System.out.println(i);
            }
            return a+b;
        };

    }
}