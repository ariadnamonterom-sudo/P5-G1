package com.desarrolloweb.entornoservidor.tema2practica1.models;

// CLASE PACIENTE //
public class Patient implements Cloneable{ // Implmentamos la interfaz Cloneable para que podamos clonar pacientes
    //Declaramos las propiedades encapsuladas
    private Long id; 
    private String name; 
    private String email; 
    private String phone; 

    // Declaramos un constructor vacío. 
    public Patient() {

    }

    // Declaramos un constructor con parámetros 
    public Patient(Long id, String name, String email, String phone) {
        this.id = id; 
        this.name = name; 
        this.email = email; 
        this.phone = phone; 
    }

    // Creamos los getters y los setters
    public Long getId() {
        return id; 
    }

    public void setId(Long id) {
        this.id = id; 
    }

    public String getName() {
        return name; 
    }

    public void setName(String name) {
        this.name = name; 
    }

    public String getEmail() {
        return email; 
    }

    public void setEmail(String email) {
        this.email = email; 
    }

    public String getPhone() {
        return phone; 
    }

    public void setPhone(String phone) {
        this.phone = phone; 
    }

    // Sobreescribimos el método toString
    @Override 
    public String toString () {
        return "id: " + this.id + "\n" + 
        "Nombre: " + this.name + "\n" +
        "Email: " + this.email + "\n" + 
        "Phone: " + this.phone;  
    }

    // Sobreescribimos el método clone
    @Override 
    public Patient clone() {
        return new Patient(this.id, this.name, this.email, this.phone); 
    }
}
