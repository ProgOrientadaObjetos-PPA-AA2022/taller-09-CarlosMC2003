/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;
import paquete2.Prestamo;
import paquete5.Persona;
/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo{
    private String tipoAuto;
    private String marcaAuto;
    private double valorAuto;
    private double valorMenAuto;
    
    public PrestamoAutomovil(Persona garante, int meses, String ciu,
            String tipo, String marca, double valor) {
        super(garante, meses, ciu.toLowerCase());
        tipoAuto = tipo;
        marcaAuto = marca;
        valorAuto = valor;
    }
    
    public void establecerTipoAuto(String n) {
        tipoAuto = n;
    }
    
    public void establecerMarcaAuto(String n) {
        marcaAuto = n;
    }
    
    public void establecerValorAuto(double n) {
        valorAuto = n;
    }
    
    public void calcularValorMensualAuto() {
        valorMenAuto = valorAuto / obtenerTiempoPrestamo();
    }
    
    public String obtenerTipoAuto() {
        return tipoAuto;
    }
    
    public String obtenerMarcaAuto() {
        return marcaAuto;
    }
    
    public double obtenerValorAuto() {
        return valorAuto;
    }
    
    public double obtenerValorMensualAuto() {
        return valorMenAuto;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("NOMBRE: %s\n"
                + "APELLIDO: %s\n"
                + "USERNAME: %s\n"
                + "CIUDAD DEL PRESTAMO: %s\n"
                + "TIEMPO DE PRESTAMO (MESES): %d\n"
                + "TIPO DE AUTOMOVIL: %s\n"
                + "MARCA DEL AUTOMOVIL: %s\n"
                + "VALOR DEL AUTOMOVIL: %.2f\n"
                + "VALOR MENSUAL DE PAGO PRESTAMO: %.2f\n", obtenerBeneficiario().obtenerNombre(), obtenerBeneficiario().obtenerApellido(),
                obtenerBeneficiario().obtenerUserName(),obtenerCiudad() , obtenerTiempoPrestamo(), tipoAuto, marcaAuto, valorAuto, valorMenAuto);
        
        return cadena;
    }
}
