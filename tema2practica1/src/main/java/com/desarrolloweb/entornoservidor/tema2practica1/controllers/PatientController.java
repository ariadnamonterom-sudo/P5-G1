package com.desarrolloweb.entornoservidor.tema2practica1.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.desarrolloweb.entornoservidor.tema2practica1.models.Patient;
import com.desarrolloweb.entornoservidor.tema2practica1.services.IPatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// Indicamos que es un RestController
@RestController 
@RequestMapping("/api/patients") // Definimos la ruta 
public class PatientController {
    
    // Inyectamos la dependencia del servicio
    private final IPatientService patientService;

    PatientController(IPatientService patientService) {
        this.patientService = patientService;
    } 

    // Hacemos un GetMapping para poder buscar por id
    @GetMapping("/{id}")
    public Patient getPatient(@PathVariable Long id) {
        Patient patient = patientService.getById(id); 
        return patient; 
    }

    // Hacemos un GetMapping para listar todos 
    @GetMapping
    public List<Patient> getListPatients() {
        return patientService.getAll(); 
    }

    // Hacemos un PostMapping para poder añadir más objetos
    @PostMapping
    public String save(@RequestBody Patient patient) {
        int id = patientService.add(patient); 
        return "redirect:/patients/" + id; 
    }
}
