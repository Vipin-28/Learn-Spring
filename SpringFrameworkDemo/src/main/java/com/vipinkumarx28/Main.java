package com.vipinkumarx28;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* System.out.println("Hello Vipin!!!"); */
        //ApplicationContext extends beanfactory classes
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);
//        Nurse nurse = context.getBean(Nurse.class);
        /*
            can also get object from using id
            Nurse nurse1 = (Nurse) context.getBean("nurse");
         */
        doctor.assist();
//        nurse.assist();
//        System.out.println(doctor.getQualification());
        doctor.setQualification("MBBS");
        Doctor doctor1 = context.getBean(Doctor.class); // by default scope is singlton. So, point to same object
        doctor1.assist();
        System.out.println(doctor.getQualification());
        System.out.println(doctor1.getQualification()); // same value as of doctor (null if scopeName = prototype)
    }
}