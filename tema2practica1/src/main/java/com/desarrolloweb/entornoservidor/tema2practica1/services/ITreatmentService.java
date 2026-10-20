package com.desarrolloweb.entornoservidor.tema2practica1.services;

import java.util.List;

import com.desarrolloweb.entornoservidor.tema2practica1.models.Treatment;
 // Creamos la interfaz
public interface ITreatmentService {
    // Declaramos los métodos que va a manejar la interfaz de los repositorios
    public Treatment getId(Long id); 

    public List<Treatment> getAll(); 

    public int add(Treatment tratamiento); 

    public List<Treatment> getTreatmentByMedicalRecordsId(Long medicalRecordId); 
}
