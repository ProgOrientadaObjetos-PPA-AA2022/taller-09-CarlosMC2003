/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author Carlos Morocho - PC
 */
public class InstiEdu {
    private String nombre;
    private String siglas;
    
    public InstiEdu(String nom, String sig) {
        nombre = nom;
        siglas = sig.toUpperCase();
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerSiglas(String n) {
        siglas = n.toUpperCase();
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerSiglas() {
        return siglas;
    }
}
