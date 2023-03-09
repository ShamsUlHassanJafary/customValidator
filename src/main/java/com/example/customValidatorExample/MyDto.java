package com.example.customValidatorExample;

public class MyDto {

    @MyCustomValidation(message = "name legth should be 5 or more charactor")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
