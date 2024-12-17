package com.dbs.Datasources.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class DatasourceService {

    public void testingAsync(int count) {

        try{
            int i =0;
            while(i<count) {
                callingAsyncMethodHere();
                i++;
                System.out.println("nice");
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Async
    public void callingAsyncMethodHere() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Inside callingAsyncMethodHere"+new SimpleDateFormat());
    }
}
