package ro.sda.spring._1_;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String lastName;
    private String firstName;
    private int age;
    private boolean isRegularCustomer;
}
