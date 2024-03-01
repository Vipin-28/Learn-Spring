package com.vipinkumarx28;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor {

//    public Doctor(){
//        System.out.println("constructor called");
//    }


    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist(){
        System.out.println("Doctor is assisting...");
    }

}
