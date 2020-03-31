package com.mongorest.tenderdemo.model;

import org.springframework.data.annotation.Id;

public class PatientReport {

    @Id private String id;

    private String patientName;
    private String details;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "PatientReport{" +
                "id='" + id + '\'' +
                ", tenderName='" + patientName + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
