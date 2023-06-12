package ro.sda.spring.functional;

public class Main {

    public static void main(String[] args) {

        Operation op1 = new Addition();

        System.out.println("Addition: " + op1.operate(200, 350));

        System.out.println("Subtraction: " + new Subtraction().operate(350, 200));

        Operation division = (a, b) -> a / b;

        System.out.println("Division: " + division.operate(100, 2));

    }
}
