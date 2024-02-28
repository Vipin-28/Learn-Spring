package com.vipinkumarx28;

public class Doctor {
    private String qualification;
    private Nurse nurse;
    public void assist(){
        System.out.println("Doctor is assisting...");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
}
