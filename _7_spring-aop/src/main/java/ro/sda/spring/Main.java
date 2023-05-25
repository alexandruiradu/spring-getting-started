package ro.sda.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring.config.ProjectConfig;
import ro.sda.spring.services.MathService;

public class Main {
    public static void main(String[] args) {

        try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            MathService service = c.getBean(MathService.class);

            try {
                int result = service.add(10, 21);
                System.out.println("Result of adding: " + result);
            } catch (Exception ignored) {
                System.out.println("Exception occurred");
            }

            try {
                int result = service.subtract(20, 3);
                System.out.println("Result of subtracting: " + result);
            } catch (Exception ignored) {
                System.out.println("Exception occurred");

            }

            try {
                int result = service.divide(20, 0);
                System.out.println("Result of division: " + result);

            } catch (Exception ignored) {
                System.out.println("Exception occurred");
            }

            System.out.println("------------------");

            int result = service.multiply(5, 8);

            System.out.println("Result of multiplication: " + result);

        }

    }
}