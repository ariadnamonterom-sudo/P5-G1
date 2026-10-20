package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.List;

import com.desarrolloweb.entornoservidor.tema2practica1.models.Patient;
// Creamos la interfaz
public interface IPatientRepository {
    // Declaramos los métodos que va a manejar la interfaz de los repositorios
    public Patient findById(Long id); 

    public List<Patient> findAll(); 

    public int save(Patient paciente); 
}
