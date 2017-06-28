package com.example.demo.controllers;

import com.example.demo.dto.HelloWorldDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Adrian on 27.06.2017.
 */
@RestController
@RequestMapping("/")
public class ListController {

    @RequestMapping(value = "/",produces = MediaType.APPLICATION_XML_VALUE)
    public HelloWorldDto returnSingleName(){
        HelloWorldDto helloWorldDto = new HelloWorldDto();
        helloWorldDto.setAge(12);
        helloWorldDto.setDate(new Date());
        helloWorldDto.setName("NIE");

        return helloWorldDto;
    }

}
