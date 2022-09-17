package com.kubeforce.scdffunctiontigger;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Function;

public class SenderFunction implements Function<String,String> {


    @Autowired
    private QueueSender queueSender;
    @Override
    public String apply(String s) {
        queueSender.send("test message");
        return "ok. done";
    }
}
