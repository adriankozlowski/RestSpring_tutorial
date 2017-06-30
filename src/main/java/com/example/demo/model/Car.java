package com.example.demo.model;

import java.util.UUID;

/**
 * Created by Adrian on 30.06.2017.
 */
public class Car {

    String id;
    String name;
    String manufacturer;
    String licencePlate;
    Integer prodYear;

    public Car(String name, String model, int i, String licPlate) {
        this.id = UUID.randomUUID().toString();
        this.name = model;
        this.manufacturer = name;
        this.licencePlate = licPlate;
        this.prodYear  =i ;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public Integer getProdYear() {
        return prodYear;
    }

    public void setProdYear(Integer prodYear) {
        this.prodYear = prodYear;
    }
}
