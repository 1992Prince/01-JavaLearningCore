package com.easybytes.sec26streamsapi.p5_flatmapdemo;

import java.util.List;

public class P6_PersonPojo {
    private String name;
    private List<String> phoneNumbers;

    public P6_PersonPojo(String name, List<String> phoneNumbers){
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName(){
        return this.name;
    }

    public List<String> getPhoneNumbers(){
        return this.phoneNumbers;
    }
}
