package com.example.demo.dto;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Adrian on 27.06.2017.
 */
@XmlRootElement(name = "hello")
@XmlAccessorType
public class HelloWorldDto  {
    private Date date;
    private String name;
    private Integer age;

    public void metoda(){
        //fsalfshklfsadk
    }
    public void metoda(String argument){

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
