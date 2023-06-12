package ro.sda.spring.functional;

public class Subtraction implements Operation {

    @Override
    public int operate(int a, int b) {
        return a - b;
    }
}
