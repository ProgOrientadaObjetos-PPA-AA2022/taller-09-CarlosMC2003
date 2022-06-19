/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete5.Persona;
/**
 *
 * @author reroes
 */
public class Prestamo {
    protected Persona beneficiario;
    protected int prestamoMeses;
    protected String ciudad;
    
    public Prestamo(Persona bene, int meses, String ciu) {
        beneficiario = bene;
        prestamoMeses = meses;
        ciudad = ciu;
    }
    
    public Prestamo(int meses, String ciu) {
        prestamoMeses = meses;
        ciudad = ciu;
    }
    
    public void establecerBeneficiario(Persona n) {
        beneficiario = n;
    }
    
    public void establecerTiempoPrestamo(int n) {
        prestamoMeses = n;
    }
    
    public void establecerCiudad(String n) {
        ciudad = n;
    }
    
    public Persona obtenerBeneficiario() {
        return beneficiario;
    }
    
    public int obtenerTiempoPrestamo() {
        return prestamoMeses;
    }
    
    public String obtenerCiudad() {
        return ciudad;
    }
}
