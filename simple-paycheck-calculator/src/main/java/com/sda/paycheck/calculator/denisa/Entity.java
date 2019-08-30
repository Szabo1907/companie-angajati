package com.sda.paycheck.calculator.denisa;

public abstract class Entity {

    private String city;

    public Entity(String city) {   // CONSTRUTOR
        if (city != null && !city.isEmpty()) {
            this.city = city;
        } else {
            throw new InvalidDataException("City must not be null");
        }
    }

    public Entity() {             // COSTRUCTOR
    }

    @Override
    public String toString() {
        return "Entity" + "city=" + city + '\'' + amountReceived() + "\n";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public abstract double amountReceived();

}

