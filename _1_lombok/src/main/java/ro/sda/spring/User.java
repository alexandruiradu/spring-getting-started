package ro.sda.spring;

import lombok.*;

import java.util.Objects;

// @Data -> is a shortcut for @ToString, @EqualsAndHashCode, @Getter and @Setter on all non-final fields
@ToString
@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private int age;
}
