package ro.sda.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"ro.sda.spring.services","ro.sda.spring.repository"})
public class Config {
}
