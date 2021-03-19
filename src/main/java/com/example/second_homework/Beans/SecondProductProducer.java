package com.example.second_homework.Beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component

public class SecondProductProducer {
    @Lookup
    public SecondProduct produceProduct() {
        return null;
    }
}
