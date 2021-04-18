package com.homework.fourth_homework.Controllers;

import com.homework.fourth_homework.Dto.AnswerInfo;
import com.homework.fourth_homework.Dto.Dto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    @PostMapping("/json")
    public Dto getJson(@RequestBody Dto dto)
    {
        return new Dto(dto.price, new AnswerInfo(dto.info.date, 123L));
    }
}
