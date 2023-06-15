/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int creditos = 235;
        double costoCredito = 23.5;
        double matriculaPresencial = 25.3;

        EstudiantePresencial estPresencial = new EstudiantePresencial(creditos, costoCredito, matriculaPresencial, nombre, apellido, identificacion, edad);

        estPresencial.calcularMatriculaPresencial();

        System.out.println(estPresencial);

    }
}
