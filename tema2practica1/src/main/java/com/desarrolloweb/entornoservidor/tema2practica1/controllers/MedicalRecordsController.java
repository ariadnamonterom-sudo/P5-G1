package com.desarrolloweb.entornoservidor.tema2practica1.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.desarrolloweb.entornoservidor.tema2practica1.models.MedicalRecords;
import com.desarrolloweb.entornoservidor.tema2practica1.services.IMedicalRecordsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// Indicamos que es un RestController
@RestController 
@RequestMapping ("/api/medicalRecords") // Definimos la ruta que tiene que mapear
public class MedicalRecordsController {
    
    // Inyectamos la dependencia del sevicio por constructor 
    public final IMedicalRecordsService medicalRecordsService;

    MedicalRecordsController(IMedicalRecordsService medicalRecordsService) {
        this.medicalRecordsService = medicalRecordsService;
    } 

    // Hacemos un GetMapping para buscar por id
    @GetMapping("/{id}")
    public MedicalRecords getMedicalRecords(@PathVariable Long id) {
        MedicalRecords medicalRecords = medicalRecordsService.getId(id); 
        return medicalRecords; 
    }

    // Hacemos un GetMapping para listar todo 
    @GetMapping    
    public List<MedicalRecords> getListMedicalRecords() {
        return medicalRecordsService.getAll(); 
    }

    // Hacemos un PostMapping para poder añadir más objetos
    @PostMapping
    public String save(@RequestBody MedicalRecords medicalRecords) {
        int id = medicalRecordsService.add(medicalRecords); 
        return "redirect:/medicalRecords/" + id; 
    }
    

    
    
    
}
