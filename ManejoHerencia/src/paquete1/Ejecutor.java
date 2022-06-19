/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import java.util.Locale;
import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.InstiEdu;
import paquete5.Persona;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        boolean bandera = true;
        String cadena = "---------------------------------------\n";
        
        System.out.println(" 1) DESEA INGRESAR UN PRESTAMO AUTOMOVIL");
        System.out.println(" 2) DESEA INGRESAR UN PRESTAMO EDUCATIVO");
        System.out.print("ELIGA UNA OPCION!: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        if (n == 1) {
            while (bandera) {
                System.out.println("\nPRESTAMO AUTOMOVIL");
                System.out.println("-------------------------");
                System.out.print("Ingrese el Nombre del Beneficiario: ");
                String nombre = sc.nextLine();
                System.out.print("Ingrese el Apellido del Beneficiario: ");
                String apellido = sc.nextLine();
                System.out.print("Ingrese el USER del Beneficiario: ");
                String user = sc.nextLine();
                
                Persona per = new Persona(nombre, apellido,user);
                
                System.out.print("Ingrese el Tiempo del Prestamo(MESES): ");
                int meses = sc.nextInt();
                sc.nextLine();
                System.out.print("Ingrese la Ciudad del Prestamo: ");
                String ciu = sc.nextLine();
                System.out.print("Ingrese el Tipo de AutoMovil: ");
                String tipo = sc.nextLine();
                System.out.print("Ingrese la Marca del AutoMovil: ");
                String marca = sc.nextLine();
                System.out.print("Ingrese el Valor del AutoMovil: ");
                double valor = sc.nextDouble();
                sc.nextLine();
                
                PrestamoAutomovil auto = new PrestamoAutomovil(per, meses, ciu, tipo, marca, valor);
                
                auto.calcularValorMensualAuto();
                
                cadena = String.format("%s%s"
                        + "---------------------------------------\n", cadena, auto);
                
                System.out.print("\nSi desea seguir ingresando !Presione Cualquier Tecla¡ (Sino Presione x): ");
                String seguir = sc.nextLine();
                
                if (seguir.equals("x") || seguir.equals("X")) {
                    bandera = false;
                }
            }
            System.out.println(cadena);
        } else if (n == 2) {
            while (bandera){
                System.out.println("\nPRESTAMO EDUCATIVO");
                System.out.println("-------------------------");
                System.out.print("Ingrese el Nombre de la Institución: ");
                String nombre = sc.nextLine();
                System.out.print("Ingrese las Siglas de la Institución: ");
                String siglas = sc.nextLine();
                
                InstiEdu insti = new InstiEdu(nombre, siglas);
                
                System.out.print("Ingrese el Tiempo del Prestamo(MESES): ");
                int meses = sc.nextInt();
                sc.nextLine();
                System.out.print("Ingrese la Ciudad del Prestamo: ");
                String ciu = sc.nextLine();
                System.out.print("Ingrese el Nivel de Estudio: ");
                String nivel = sc.nextLine();
                System.out.print("Ingrese el Valor de la Carrera: ");
                double valor = sc.nextDouble();
                sc.nextLine();
                
                PrestamoEducativo edu = new PrestamoEducativo(insti, meses, ciu,nivel, valor);
                
                edu.calcularValorMensualPrestamo();
                
                cadena = String.format("%s%s"
                        + "---------------------------------------\n", cadena, edu);
                
                System.out.print("\nSi desea seguir ingresando !Presione Cualquier Tecla¡ (Sino Presione x): ");
                String seguir = sc.nextLine();
                
                if (seguir.equals("x") || seguir.equals("X")) {
                    bandera = false;
                }
            }
            System.out.println(cadena);
        } else {
            System.out.println("\n¡OPCION FUERA DE RANGO!");
        }
    }
}
