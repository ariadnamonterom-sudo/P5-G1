package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.desarrolloweb.entornoservidor.tema2practica1.models.MedicalRecords;

@Repository // Indicamos que esta clase es un repositorio
public class MedicalRecordsRepository implements IMedicalRecordsRepository{ // Implementamos la interfaz correspondiente
    // Declaramos la lista de MedicalRecrod y el autoincremento del id
    private List<MedicalRecords> medicalRecords = new ArrayList<>(); 
    private AtomicLong idGenerator = new AtomicLong();    

    // Desarrollamos el método de la interfaz findById()
    public MedicalRecords findById(Long id) {
        return medicalRecords.stream().filter(m -> m.getId().equals(id))
                .findFirst().orElse(null); 
    }

    // Desarrollamos el método de la interfaz findAll()
    public List<MedicalRecords> findAll() {
        return medicalRecords; 
    }

    // Desarrollamos el método de la interfaz save()
    public int save (MedicalRecords medical) {
        medical.setId(idGenerator.incrementAndGet());
        medicalRecords.add(medical); 
        return medicalRecords.size(); 
    }

    // Sobreescribimos el método de la interfaz findById()
    public List<MedicalRecords> findByPatientId(Long patientId) {
        return medicalRecords.stream().filter(t -> t.getPatientId() != null && t.getPatientId().equals(patientId)).collect(Collectors.toList());  
    }

    
}

