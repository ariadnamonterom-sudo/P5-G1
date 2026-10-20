package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import com.desarrolloweb.entornoservidor.tema2practica1.models.Patient;

@Repository // indicamos que es un repositorio 
@Primary // Indicamos con la etiqueta de Primary que este repositorio es el primero que tiene que utilizar
public class PatientRepository implements IPatientRepository{
    // Declaramos la lista de pacientes y el generador automatico de id
    private List<Patient> pacientes = new ArrayList<>(); 
    private AtomicLong idGenerator = new AtomicLong();

    // Sobreescribimos el método de la interfaz
    @Override 
    public Patient findById(Long id) {
        return pacientes.stream().filter(m -> m.getId().equals(id))
                .findFirst().orElse(null); 
    }

    // Sobreescribimos el método de la interfaz
    @Override 
    public List<Patient> findAll() {
        return pacientes; 
    }

    // Sobreescribimos el método de la interfaz
    @Override 
    public int save (Patient patient) {
        patient.setId(idGenerator.incrementAndGet());
        pacientes.add(patient); 
        return pacientes.size(); 
    }
}
