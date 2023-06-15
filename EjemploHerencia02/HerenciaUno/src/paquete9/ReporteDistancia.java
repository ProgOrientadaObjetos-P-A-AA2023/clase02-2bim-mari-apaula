/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete9;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDistancia extends Reporte{
    
    private ArrayList<EstudianteDistancia> lista;
    private double totalMatriculaDistancia;
    
    public ReporteDistancia(String nombre, String carrera, String ciclo){
        super(nombre, carrera, ciclo);
        
    }
    
    public void establecerLista(ArrayList<EstudianteDistancia> listado){
        lista = listado;
    }
    
    public void establecerTotalMatriculasDistancia(){
        
        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaDistancia = totalMatriculaDistancia + 
                    lista.get(i).obtenerMatriculaDistancia();
        }
    }
    
    public ArrayList<EstudianteDistancia> obtenerLista(){
        return lista;
    }
    
    public double obtenerTotalMatriculasDistancia(){
        return totalMatriculaDistancia;
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("Carrera: %s \n"
                + "Ciclo: %s\n",
                carrera,
                ciclo);
        
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\nNombre: %s\n"
                    + "Apellido: %s\n"
                    + "Indentificacion: %s\n"
                    + "Edad: %s\n"
                    + "Costo asignatura: %.2f\n"
                    + "Numero de asignaturas: %d\n"
                    + "El total de matriculas es: %.2f\n", 
                    cadena,
                    lista.get(i).nombresEstudiante,
                    lista.get(i).apellidosEstudiante,
                    lista.get(i).identificacionEstudiante,
                    lista.get(i).edadEstudiante,
                    lista.get(i).costoAsignatura,
                    lista.get(i).numeroAsignaturas,
                    lista.get(i).matriculaDistancia);
            
        }
            
        
        cadena = String.format("%s\nEl total de matriculas es: %.2f\n",
                cadena,
                obtenerTotalMatriculasDistancia());
        return cadena;
    }
    
}
