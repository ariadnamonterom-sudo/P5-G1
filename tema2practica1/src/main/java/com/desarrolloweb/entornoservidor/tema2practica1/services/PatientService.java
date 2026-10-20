package com.desarrolloweb.entornoservidor.tema2practica1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.desarrolloweb.entornoservidor.tema2practica1.models.Patient;
import com.desarrolloweb.entornoservidor.tema2practica1.repositories.IPatientRepository;

// Indicamos que esto es un servicio 
@Service  
public class PatientService implements IPatientService{ // Implemeentamos la interfaz
    //@Autowired -- Si lo ponemos NO FUNCIONA
    private IPatientRepository patientRepository; 

    // Declaramos el constructuctor con la anotación Qualifier
    public PatientService(@Qualifier("patientJson")IPatientRepository patientRepository) {
        this.patientRepository = patientRepository; 
    }

    // Sobreescribimos el método de la interfaz
    @Override 
    public Patient getById(Long id) {
        return patientRepository.findById(id); 
    }

    // Sobreescribimos el método de la interfaz
    @Override 
    public List<Patient> getAll() {
        return patientRepository.findAll(); 
    }

    // Sobreescribimos el método de la interfaz
    @Override 
    public int add(Patient paciente) {
        return patientRepository.save(paciente); 
    }
}
