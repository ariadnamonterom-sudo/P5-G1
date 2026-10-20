package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.desarrolloweb.entornoservidor.tema2practica1.models.Treatment;

// Indicamos que la clase es un repositorio
@Repository 
public class TreatmentRepository implements ITreatmentRepository{ // Implementamos la interfaz
    private List<Treatment> treatmentList = new ArrayList<>(); 
    private AtomicLong idGenerator = new AtomicLong();

    // Sobreescribimos el método de la interfaz
    public Treatment findById(Long id) {
        return treatmentList.stream().filter(m -> m.getId().equals(id))
                .findFirst().orElse(null); 
    }

    // Sobreescribimos el método de la interfaz
    public List<Treatment> findAll() {
        return treatmentList; 
    }

    // Sobreescribimos el método de la interfaz
    public int save (Treatment tratamiento) {
        tratamiento.setId(idGenerator.incrementAndGet());
        treatmentList.add(tratamiento); 
        return treatmentList.size(); 
    }

    // Sobreescribimos el método de la interfaz
    public List<Treatment> findByMedicalRecords(Long medicalRecordId) {
        return treatmentList.stream().filter(t -> t.getMedicalRecordId() != null && t.getMedicalRecordId().equals(medicalRecordId))
        .collect(Collectors.toList()); 
    }

    
}

