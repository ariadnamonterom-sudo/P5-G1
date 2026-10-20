package com.desarrolloweb.entornoservidor.tema2practica1.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.desarrolloweb.entornoservidor.tema2practica1.models.Treatment;
import com.desarrolloweb.entornoservidor.tema2practica1.services.ITreatmentService;



// Indicamos que es RestController
@RestController 
@RequestMapping("/api/treatments") // Definimos la ruta 
public class TreatmentController {

    // Inyectamos el servicio 
    public final ITreatmentService treatmentService;

    TreatmentController(ITreatmentService treatmentService) {
            this.treatmentService = treatmentService;
    } 

    // Creamos un GetMapping para encontrar por id
    @GetMapping("/{id}") 
        public Treatment getTreatment(@PathVariable Long id) {
            Treatment treatment = treatmentService.getId(id); 
            return treatment; 
        }

    // Creamos un GetMapping para listar todos 
    @GetMapping    
        public List<Treatment> getListTreatment() {
            return treatmentService.getAll(); 
        }

    // Creamos un PostMapping para crear nuevas instancias
    @PostMapping
        public String save(@RequestBody Treatment treatment) {
            int id = treatmentService.add(treatment); 
            return "redirect:/treatments/" + id; 
        }
}
    
    


