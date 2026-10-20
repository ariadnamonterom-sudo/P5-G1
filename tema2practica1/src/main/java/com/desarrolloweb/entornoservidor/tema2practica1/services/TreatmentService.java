package com.desarrolloweb.entornoservidor.tema2practica1.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.desarrolloweb.entornoservidor.tema2practica1.models.Treatment;
import com.desarrolloweb.entornoservidor.tema2practica1.repositories.ITreatmentRepository;

// Indicamos que es un servicio
@Service 
public class TreatmentService implements ITreatmentService{ // Implementamos la interfaz
    
    // Inyectamos la dependencia
    @Autowired 
    private ITreatmentRepository treatmentRepository; 

    // Declaramos el constructor
    public TreatmentService(ITreatmentRepository treatmentRepository) {
        this.treatmentRepository = treatmentRepository; 
    }

    // Sobreescribimos el método de la interfaz
    @Override 
    public Treatment getId(Long id) {
        return treatmentRepository.findById(id); 
    }

    // Sobreescribimos el método de la interfaz
    @Override 
    public List<Treatment> getAll() {
        return treatmentRepository.findAll(); 
    }

    // Sobreescribimos el método de la interfaz
    @Override 
    public int add(Treatment tratamiento) {
        return treatmentRepository.save(tratamiento); 
    }

    // Sobreescribimos el método de la interfaz
    @Override 
    public List<Treatment> getTreatmentByMedicalRecordsId(Long medicalRecordId) {
        return treatmentRepository.findByMedicalRecords(medicalRecordId); 
    }
}
