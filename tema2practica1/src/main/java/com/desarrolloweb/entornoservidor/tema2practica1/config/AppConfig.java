package com.desarrolloweb.entornoservidor.tema2practica1.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

// Indicamos que es component
@Component 
@PropertySource("classpath:application.properties")
public class AppConfig {

    // Indicamos un Value para el nombre de la app
    @Value("${spring.application.name:tema2practica1}")
    private String appName; 

    // Indicamos un Value para el valor por defecto 
    @Value("${clinic.name:Clinica Med}")
    private String appNameDefault; 

    // Indicamos un valor para el máximo por dia 
    @Value("${maxAppointmentsPerDay:20}")
    private int maxAppointmentsPerDay; 

    // Les hacemos los getters para acceder a ellos 
    public String getAppName() {
        return appName; 
    }

    public int getMaxAppointmentsPerDay() {
        return maxAppointmentsPerDay; 
    }

    // Sobreescribimos el método toString
    @Override 
    public String toString() {
        return "AppConfig {" +
                "springAppName='" + appName + '\'' +
                ", clinicName='" + appNameDefault + '\'' +
                ", maxAppointmentsPerDay=" + maxAppointmentsPerDay +
                '}';
    }
}
