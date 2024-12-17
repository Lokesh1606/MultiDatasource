package com.dbs.Datasources.controller;

import com.dbs.Datasources.service.DatasourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DatasourceController {
    @Autowired
    DatasourceService datasourceService;



    @GetMapping("/async")
    public boolean test(@RequestParam int count) {
        try{
            int i =0;
            while (i<count){
                datasourceService.callingAsyncMethodHere();
                System.out.println("done");
                i++;
            }
        }catch (Exception e){
            System.out.println("error where? "+e);
        }

//        datasourceService.testingAsync(count);
        return true;
    }
}
