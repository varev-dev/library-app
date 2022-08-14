package dev.varev.libraryapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/book", produces = "application/json")
public class BookController {

    @GetMapping(path = "/test")
    public String helloWorldTest() {
        return "Test";
    }

}
