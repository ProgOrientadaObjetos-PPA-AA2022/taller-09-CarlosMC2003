/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String username;
    
    public Persona(String nom, String ape, String user) {
        nombre = nom;
        apellido = ape;
        username = user;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerApellido(String n) {
        apellido = n;
    }
    
    public void establecerUserName(String n) {
        username = n;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerApellido() {
        return apellido;
    }
    
    public String obtenerUserName() {
        return username;
    }
}
