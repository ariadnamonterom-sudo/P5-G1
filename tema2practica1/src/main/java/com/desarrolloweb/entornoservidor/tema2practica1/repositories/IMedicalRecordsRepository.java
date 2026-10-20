package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.List;

import com.desarrolloweb.entornoservidor.tema2practica1.models.MedicalRecords;

// Creamos la interfaz
public interface IMedicalRecordsRepository {
    // Declaramos los métodos que va a manejar la interfaz de los repositorios
    public MedicalRecords findById(Long id); 

    public List<MedicalRecords> findAll(); 

    public int save(MedicalRecords medicalRecord); 

    List<MedicalRecords> findByPatientId(Long patientId); 
}
