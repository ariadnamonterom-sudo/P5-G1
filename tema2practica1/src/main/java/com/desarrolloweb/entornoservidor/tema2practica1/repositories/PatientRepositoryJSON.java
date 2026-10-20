package com.desarrolloweb.entornoservidor.tema2practica1.repositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.core.io.ClassPathResource;
import com.desarrolloweb.entornoservidor.tema2practica1.models.Patient;
import tools.jackson.databind.ObjectMapper;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

// Indicamos que es un repositorio
@Repository("patientJson")  
public class PatientRepositoryJSON implements IPatientRepository{ // Implementamos la interfaz

    // Declaramos la lista de pacientes
    private List<Patient> pacientes = new ArrayList<>(); 

    // Creamos el constructor de la clase
    public PatientRepositoryJSON() {
        Resource resource = new ClassPathResource(("pacientes.json")); 
        readValueJson(resource); 
    }
    // Con este método leemos el archivo Json
    public void readValueJson(Resource resource) {
        ObjectMapper objectMapper = new ObjectMapper(); 
        try {
            pacientes = new ArrayList<>(Arrays.asList(objectMapper.readValue(resource.getInputStream(), Patient[].class))); 
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    // Declaramos el incremento automático del id
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
