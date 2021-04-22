package com.homework.sixth_homework.Controller;

import com.homework.sixth_homework.Annotation.CountExecutions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    private static final Logger log = LoggerFactory.getLogger(Controller.class);

    @CountExecutions
    @GetMapping("/first")
    public String firstApi() {
        log.info("First Api");
        return "first";
    }

    @CountExecutions
    @PostMapping("/second")
    public String secondApi() {
        log.info("Second Api");
        return "second";
    }
}
