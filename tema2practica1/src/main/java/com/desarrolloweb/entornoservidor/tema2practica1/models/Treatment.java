package com.desarrolloweb.entornoservidor.tema2practica1.models;

// CLASE TREATMENT //
public class Treatment implements Cloneable{ // Implementamos la clase Cloneable para poder clonar tratamientos
    // Declaramos las propiedades
    private Long id; 
    private MedicalRecords medicalRecordId; 
    private String description; 
    private String medication; 

    // Declaramos un constructor vacío
    public Treatment() {

    }

    // Declaramos un constructor con propiedades
    public Treatment(Long id, MedicalRecords medicalRecordId, String description, String medication) {
        this.id = id; 
        this.medicalRecordId = medicalRecordId; 
        this.description = description; 
        this.medication = medication; 
    }

    // Creamos los setters y los getters
    public Long getId() {
        return id; 
    }

    public void setId(Long id) {
        this.id = id; 
    }

    public MedicalRecords getMedicalRecordId() {
        return medicalRecordId; 
    }

    public void setMedicalRecordId(MedicalRecords medicalRecordId) {
        this.medicalRecordId = medicalRecordId; 
    }

    public String getDescription() {
        return description; 
    }

    public void setDescription(String description) {
        this.description = description; 
    }

    public String getMedication() {
        return medication; 
    }

    public void setMedication(String medication) {
        this.medication = medication; 
    }

    // Sobreescribimos el método toString
    @Override 
    public String toString() {
        return "id: " + this.id + "\n" +
        "Id de Ficha médica: " + this.medicalRecordId + "\n" + 
        "Descripción: " + this.description + "\n" + 
        "Medicación: " + this.medication; 
    }

    // Sobreescribimos el método clone
    @Override 
    public Treatment clone() {
        return new Treatment(this.id, this.medicalRecordId, this.description, this.medication); 
    } 
} 
