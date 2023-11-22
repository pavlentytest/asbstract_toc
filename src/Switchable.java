public interface Switchable {
    void switchOn();
    void switchOff();

    default void toDo() {

    }
}
interface Movable {
    void doMove();
}
class Lamp implements Switchable, Movable {

    @Override
    public void switchOn() {

    }

    @Override
    public void switchOff() {

    }

    @Override
    public void doMove() {

    }
}
