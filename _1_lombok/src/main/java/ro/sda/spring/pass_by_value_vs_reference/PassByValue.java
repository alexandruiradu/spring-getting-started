package ro.sda.spring.pass_by_value_vs_reference;

public class PassByValue {

    public static void main(String[] args) {

        int a = 10;

        increment(a);

        System.out.println(a);

    }

    private static void increment(int number) {
        ++number;
        myMethod();
    }

    private static void myMethod() {
        int localVariable = 100;
        System.out.println("myMethod() called");
    }
}
