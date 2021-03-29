package com.example.second_homework.Controllers;

import com.example.second_homework.AppContextProvider.AppContextProvider;
import com.example.second_homework.Beans.FirstProductProducer;
import com.example.second_homework.Beans.SecondProductProducer;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
    @Autowired
    private AppContextProvider contextProvider;

    @RequestMapping(value = "/2/{count}")
    public String createProducts(@PathVariable Integer count) {
        SecondProductProducer producer = contextProvider.getContext().getBean(SecondProductProducer.class);
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
