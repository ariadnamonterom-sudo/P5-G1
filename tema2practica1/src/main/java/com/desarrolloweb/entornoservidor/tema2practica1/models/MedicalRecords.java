package com.desarrolloweb.entornoservidor.tema2practica1.models;

import java.sql.Date;

// CLASE MEDICALRECORD//
public class MedicalRecords implements Cloneable{ // Implementamos la interfaz Cloneable para poder clonar los objetos que se instancien
    // Declaramos las propiedades encapsuladas
    private Long id; 
    private Patient patientId; 
    private String diagnosis; 
    private Date date; 
    
    // Creamos un constructor vacío
    public MedicalRecords() {

    }
    // Creamos un constructor con todos los parámetros
    public MedicalRecords(Long id, Patient patientId, String diagnosis, Date date) {
        this.id = id; 
        this.patientId = patientId; 
        this.diagnosis = diagnosis; 
        this.date = date; 
    }

    // Declaramos los setters y getters
    public Long getId () {
        return id; 
    }

    public void setId(Long id) {
        this.id = id; 
    }

    public Patient getPatientId() {
        return patientId; 
    }

    public void setPatientId(Patient patientId) {
        this.patientId = patientId; 
    }

    public String getDiagnosis() {
        return diagnosis; 
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis; 
    }

    public Date getDate() {
        return date; 
    }

    public void setDate(Date date) {
        this.date = date; 
    }

    // Sobreescribimos en método toString 
    @Override 
    public String toString() {
        return "Id: " + this.id + "\n" +
        "Id de Paciente: " + this.patientId + "\n" +
        "Diagnóstico: " + this.diagnosis + "\n" +
        "Fecha: " + this.date; 
    }

    // Sobreescribimos en método clone.
    @Override 
    public MedicalRecords clone() {
        return new MedicalRecords(this.id, this.patientId, this.diagnosis, this.date); 
    }
    
}
