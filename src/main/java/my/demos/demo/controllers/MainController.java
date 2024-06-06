package my.demos.demo.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest")
@AllArgsConstructor
public class MainController {

    @GetMapping("hello")
    public String hello() {
        return "Hello";
    }
}
