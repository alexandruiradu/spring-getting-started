package ro.sda.spring._2_;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        Car car = new Car("Renault", "Yellow", 100, true);

        try {
            // we transform from POJO (plain old java object) to json -> SERIALIZATION
            String serialized = mapper.writeValueAsString(car);
            System.out.println(serialized);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println("----------------------");

        try {
            // we transform from a json object to a POJO -> DESERIALIZATION
            Car deserialized = mapper.readValue("{\"brand\":\"Renault\",\"color\":\"Yellow\",\"horsePower\":100,\"manual\":true}", Car.class);
            System.out.println(deserialized);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
