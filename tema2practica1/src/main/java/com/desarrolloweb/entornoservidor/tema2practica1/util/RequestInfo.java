package com.desarrolloweb.entornoservidor.tema2practica1.util;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

// Indicamos que es un componente y un RequestScope
@Component 
@RequestScope 
public class RequestInfo {
    
    // Declaramos las propiedades de fecha y descripcion
    private final LocalDateTime requesTime;
    private String description; 
    
    // Inicializamos en el constructor los parámetros
    public RequestInfo() {
        this.requesTime = LocalDateTime.now(); 
        this.description = "Petición procesada correctamente"; 
    }

    // Solo hacemos el getter del LocalDateTime ya que siempre va a acceder con la función now()
    public LocalDateTime getRequestTime() {
        return requesTime; 
    }

    // Setters y Getters de la descripción
    public String getDescription() {
        return description; 
    }

    public void setDescription(String description) {
        this.description = description; 
    }
}
