package com.homework.fourth_homework.Controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.LinkedList;
import java.util.List;

@Controller
public class GetController {
    @GetMapping("/headers")
    public String getHtml(@RequestHeader HttpHeaders headers, Model model)
    {
        List<String> headersList = new LinkedList<>();
        headers.forEach((key, value) -> headersList.add(
                key + ": " + String.join(" | ", value)));
        model.addAttribute("headers", headersList.toArray());
        return "headers";
    }
}
