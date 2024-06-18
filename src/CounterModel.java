public class CounterModel {
    private int counter = 0;
    private boolean counterIsLocked = false;

    public void increment() {
        if (!counterIsLocked) counter++;
    }

    public void decrement() {
        if (counter != 0 && !counterIsLocked) counter--;
    }

    public void changeLockCounter() {
        counterIsLocked = !counterIsLocked;
    }

    public int getCounter() {
        return counter;
    }

    public boolean getIsLocked() {
        return counterIsLocked;
    }
}