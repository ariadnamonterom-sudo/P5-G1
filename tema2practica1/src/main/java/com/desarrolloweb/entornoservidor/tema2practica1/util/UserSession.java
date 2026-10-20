package com.desarrolloweb.entornoservidor.tema2practica1.util;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import com.desarrolloweb.entornoservidor.tema2practica1.models.Patient;

// Indicamos que esto es un componente y un SessionScope
@Component 
@SessionScope 
public class UserSession {

    // Declaramos la propiedad
    private Patient sessionPatientHolder; 

    // Inicializamos la propuedad en el constructor
    public UserSession() {
        this.sessionPatientHolder = new Patient(); 
    }

    // Hacemos el getter y setter
    public Patient getSessionPatientHolder() {
        return sessionPatientHolder; 
    }

    public void setSessionPatientHolder(Patient sessionPatientHolder) {
        this.sessionPatientHolder = sessionPatientHolder; 
    }

    // Sobreescribimos el método toString()
    @Override 
    public String toString() {
        return sessionPatientHolder.toString(); 
    }


}
