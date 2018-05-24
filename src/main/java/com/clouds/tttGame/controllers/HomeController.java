package com.clouds.tttGame.controllers;


import com.oracle.javafx.jmx.json.JSONException;
import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    //Since this is a POST, it DOESNT return anything
    @RequestMapping(value="/addStudent",method = RequestMethod.POST)
    public String addStudent(@RequestBody String studentJSON) throws JSONException {

        System.out.println("studentJSON = " + studentJSON);

//            fakeDatabase.put("name","brandon");

        return "R E T U R N";

    }



}
