package com.example.second_homework.Controllers;

import com.example.second_homework.Beans.FirstProductProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.Resource;


@RestController
@RequestScope
public class FirstController {
    private FirstProductProducer producer;

    @Autowired
    private void setProducer(FirstProductProducer producer){
        this.producer = producer;
    }

    @RequestMapping(value = "/1/{count}")
    public String createProducts(@PathVariable Integer count) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < count; i++)
            res.append("<p>")
                    .append(producer.produceProduct().getProductType())
                    .append(" was created by product producer with code ")
                    .append(producer.hashCode())
                    .append(" in controller with code ")
                    .append(this.hashCode());

        return res.toString();
    }
}
