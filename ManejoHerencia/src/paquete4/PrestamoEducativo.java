/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import paquete2.Prestamo;
import paquete5.InstiEdu;
/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo{
    private String nivelEstudio;
    private InstiEdu centroEdu;
    private double valorCarrera;
    private double valorMenCarre;
    
    public PrestamoEducativo(InstiEdu centro, int meses, String ciu,
            String nivelEst, double valorCarre) {
        super(meses, ciu.toUpperCase());
        centroEdu = centro;
        nivelEstudio = nivelEst;
        valorCarrera = valorCarre;
    }
    
    public void establecerNivelEstudio(String n) {
        nivelEstudio = n;
    }
    
    public void establecerCentroEducativo(InstiEdu n) {
        centroEdu = n;
    }
    
    public void establecerValorCarrera(double n) {
        valorCarrera = n;
    }
    
    public void calcularValorMensualPrestamo() {
        valorMenCarre = (valorCarrera / obtenerTiempoPrestamo()) - 0.10 * (valorCarrera / obtenerTiempoPrestamo());
    }
    
    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }
    
    public InstiEdu obtenerCentroEducativo() {
        return centroEdu;
    }
    
    public double obtenerValorCarrera() {
        return valorCarrera;
    }
    
    public double obtenerValorMensualPrestamo() {
        return valorMenCarre;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("NOMBRE INSTITUCION: %s\n"
                + "SIGLAS DE LA INSTITUCION: %s\n"
                + "CIUDAD DEL PRESTAMO: %s\n"
                + "TIEMPO DEL PRESTAMO (MESES): %d\n"
                + "BIVEL DE ESTUDIO: %s\n"
                + "VALOR DE LA CARRERA: %.2f\n"
                + "VALOR MENSUAL DEL PRESTAMO: %.2f\n"
                + "", obtenerCentroEducativo().obtenerNombre(), obtenerCentroEducativo().obtenerSiglas(),
                obtenerCiudad(), obtenerTiempoPrestamo(), nivelEstudio, valorCarrera, valorMenCarre);
        
        return cadena;
    }
}
