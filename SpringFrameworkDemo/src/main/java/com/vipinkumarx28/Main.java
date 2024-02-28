package com.vipinkumarx28;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* System.out.println("Hello Vipin!!!"); */
        //ApplicationContext extends beanfactory classes
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


        Doctor doctor = context.getBean(Doctor.class);
        Nurse nurse = context.getBean(Nurse.class);
        /*
            can also get object from using id
            Nurse nurse1 = (Nurse) context.getBean("nurse");
         */
        doctor.assist();
        nurse.assist();
        System.out.println(doctor.getQualification());
    }
}