package com.desarrolloweb.entornoservidor.tema2practica1.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.desarrolloweb.entornoservidor.tema2practica1.models.MedicalRecords;
import com.desarrolloweb.entornoservidor.tema2practica1.repositories.IMedicalRecordsRepository;

// Indicamos que es un servicio
@Service 
public class MedicalRecordsService implements IMedicalRecordsService{ // Implementamos la interfaz
    
    // Inyectamos la dependencia de la interfaz
    @Autowired 
    private IMedicalRecordsRepository medicalRecordsRepository; 

    // Hacemos el constructor
    public MedicalRecordsService(IMedicalRecordsRepository medicalRecordsRepository) {
        this.medicalRecordsRepository = medicalRecordsRepository; 
    }

    // Sobreescribimos el método de la interfaz
    @Override 
    public MedicalRecords getId(Long id) {
        return medicalRecordsRepository.findById(id); 
    }

    // Sobreescribimos el método de la interfaz
    @Override 
    public List<MedicalRecords> getAll() {
        return medicalRecordsRepository.findAll(); 
    }

    // Sobreescribimos el método de la interfaz
    @Override 
    public int add(MedicalRecords medicalRecord) {
        return medicalRecordsRepository.save(medicalRecord); 
    }

    // Sobreescribimos el método de la interfaz
    @Override
    public List<MedicalRecords> getRecordsByPatientId(Long patientId) {
        return medicalRecordsRepository.findByPatientId(patientId); 
    }
    

}
