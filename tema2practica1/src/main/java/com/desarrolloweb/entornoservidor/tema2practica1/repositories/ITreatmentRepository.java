package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.List;

import com.desarrolloweb.entornoservidor.tema2practica1.models.Treatment;
// Creamos la interfaz
public interface ITreatmentRepository {
    // Declaramos los métodos que va a manejar la interfaz de los repositorios
    public Treatment findById(Long id); 

    public List<Treatment> findAll(); 

    public int save(Treatment tratamiento); 

    public List<Treatment> findByMedicalRecords(Long medicalRecordId); 
}
