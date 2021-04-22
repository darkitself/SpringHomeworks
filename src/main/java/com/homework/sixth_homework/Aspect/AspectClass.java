package com.homework.sixth_homework.Aspect;

import com.homework.sixth_homework.Config.AspectConfig;
import com.homework.sixth_homework.Controller.Controller;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
public class AspectClass {
    private final AspectConfig config;
    private final Logger log = LoggerFactory.getLogger(Controller.class);
    private final Map<String, Integer> counter = new HashMap<>();

    public AspectClass(AspectConfig config) {
        this.config = config;
    }

    @Around("@annotation(com.homework.sixth_homework.Annotation.CountExecutions)")
    public String logMethodCall(ProceedingJoinPoint jp) throws Throwable {
        String methodName = jp.getSignature().getName();
        if (!counter.containsKey(methodName))
            counter.put(methodName, 0);
        if (counter.get(methodName) < config.getExecutionTimes()){
            counter.replace(methodName, counter.get(methodName) + 1);
            log.info("Amount of " + methodName + " calls: " + counter.get(methodName));
            return (String) jp.proceed();
        }
        else{
            log.info("Limit of " + methodName + " calls reached");
            return "Limit of " + methodName + " calls reached";
        }
    }
}
