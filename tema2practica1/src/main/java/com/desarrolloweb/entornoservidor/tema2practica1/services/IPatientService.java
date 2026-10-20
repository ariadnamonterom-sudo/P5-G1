package com.desarrolloweb.entornoservidor.tema2practica1.services;

import java.util.List;

import com.desarrolloweb.entornoservidor.tema2practica1.models.Patient;
 // Creamos la interfaz
public interface IPatientService { 
    // Declaramos los métodos que va a manejar la interfaz de los repositorios
    public Patient getById(Long id); 

    public List<Patient> getAll(); 

    public int add(Patient paciente); 


}
