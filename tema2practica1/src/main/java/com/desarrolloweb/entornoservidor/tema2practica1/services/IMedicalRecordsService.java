package com.desarrolloweb.entornoservidor.tema2practica1.services;

import java.util.List;

import com.desarrolloweb.entornoservidor.tema2practica1.models.MedicalRecords;

// Creamos la interfaz
public interface IMedicalRecordsService {
    // Declaramos los métodos que va a manejar la interfaz de los servicios
    public MedicalRecords getId(Long id); 

    public List<MedicalRecords> getAll(); 

    public int add(MedicalRecords medicalRecord); 

    public List<MedicalRecords> getRecordsByPatientId(Long patientId); 
}
