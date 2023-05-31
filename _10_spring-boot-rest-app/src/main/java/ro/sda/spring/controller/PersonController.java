package ro.sda.spring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ro.sda.spring.model.Person;

@RestController
@Slf4j
public class PersonController {

    @GetMapping("/get-person")
    public Person getPerson() {
        log.info("/get-person endpoint called");
        Person p = new Person("Catalin", 25);
        return p;
    }

    @PostMapping("post-person")
    public void postPerson(@RequestBody Person body) {
        log.info("/post-person endpoint called");
        log.info("Person: " + body);
    }
}
