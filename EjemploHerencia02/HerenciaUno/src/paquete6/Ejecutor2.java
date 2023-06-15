/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // Ingresar estudiante de tipo presencial por teclado.
        // El usuario decide cuando terminar
        // No utilizar super.toString en EstudiantePresencial
        // Debe existir 1 sola impresión de todos los estudiantes presenciales
        // No usar arreglos
        
        // Trabajo clases 15 junio 2023
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "";
        
        while(bandera){
            System.out.println("Ingrese un estudiente de tipo precencial");
            System.out.println("Ingresa su nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingresa su apellido");
            String apellido = entrada.nextLine();
            System.out.println("Ingresa su identificacion");
            String identificación = entrada.nextLine();
            System.out.println("Ingresa su edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese el numero Creditos");
            int numeroCreditos = entrada.nextInt();
            System.out.println("Ingrese el costo de Creditos");
            double costoCredito = entrada.nextDouble();
            entrada.nextLine();
            
            EstudiantePresencial estudianteP = new EstudiantePresencial(nombre, apellido, identificación, edad, costoCredito, numeroCreditos);
            
            cadena = String.format("%s%s\n", cadena, estudianteP);
            
            
            
            System.out.println("Desea salir, pulse S");
            String opcion = entrada.nextLine();
            if(opcion.equals("S")){
                bandera = false;
            }
        }
        
        System.out.printf("%s\n", cadena);
        
        
    }
}




