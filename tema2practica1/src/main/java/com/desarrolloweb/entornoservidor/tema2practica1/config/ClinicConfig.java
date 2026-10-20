package com.desarrolloweb.entornoservidor.tema2practica1.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.desarrolloweb.entornoservidor.tema2practica1.repositories.MedicalRecordsRepository;
import com.desarrolloweb.entornoservidor.tema2practica1.repositories.PatientRepositoryJSON;
import com.desarrolloweb.entornoservidor.tema2practica1.repositories.TreatmentRepository;

// Indicamos que es Configuration
@Configuration
public class ClinicConfig {
    
    // Creamos un Bean para cada Repositorio. Cada método devuelve una instancia nueva de cada uno 
    @Bean("patientJSON")
    public PatientRepositoryJSON patientRepositoryJSON(AppConfig appConfig) {
        return new PatientRepositoryJSON(); 
    }

    @Bean
    public MedicalRecordsRepository medicalRecordsRepository() {
        return new MedicalRecordsRepository();  
    }

    @Bean
    public TreatmentRepository treatmentRepository() {
        return new TreatmentRepository(); 
    }


}
