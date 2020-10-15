package com.gopalfirstspproject.gopalfirstspprogram.controller;


import com.gopalfirstspproject.gopalfirstspprogram.impl.MyImpl;
import com.gopalfirstspproject.gopalfirstspprogram.repository.MyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

//    @Autowired       // Using spring's dependency injection facilities
//    private MyImpl myImpl;    //Container

    @Autowired
    private MyInterface myInterface;

    @GetMapping(value="/check")
    public String check(){
        return myInterface.getData();
    }
}
