package com.example.spring20230920.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class MyDto1 {
    //name property
    //homeAddress property
    //MTHOME property
    private String name;
    private String homeAddress;
    private String MYHOME;
    private Boolean married;
    private boolean maar;

    public boolean isMaar() {
        return maar;
    }

    public void setMaar(boolean maar) {
        this.maar = maar;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public String getMYHOME() {
        return MYHOME;
    }

    public void setMYHOME(String MYHOME) {
        this.MYHOME = MYHOME;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyDto1{" +
                "name='" + name + '\'' +
                '}';
    }
}
