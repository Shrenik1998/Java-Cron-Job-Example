package com.demo.scheculerorcronjob.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DemoClass {

    //run every minute
    @Scheduled(cron = "0 * * * * *")
    public void print()
    {
        System.out.println("Hello World");
    }
}
