package ro.sda.spring.pass_by_value_vs_reference;

public class PassByReference {

    public static void main(String[] args) {

        Car c = new Car("Audi", 100);

        passByReference(c);

        System.out.println(c);

    }

    public static void passByReference(Car c){
        ++c.horsePower;
    }
}

class Car{
    public String brand;
    public int horsePower;

    public Car(String brand, int horsePower) {
        this.brand = brand;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
