package poo.dominio;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Estudiante> estudiantes;

    public Academia() {
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    // 6.1: Qué estudiante obtuvo el promedio más alto
    public Estudiante obtenerMejorPromedio(){
        Estudiante mejor = null;
        double maxPromedio = -1;
        for (Estudiante est: estudiantes){
            double promedio = est.getPromedio();
            if(promedio> maxPromedio){
                maxPromedio=promedio;
                mejor=est;
            }
        }
        return mejor;
    }
    
    // 6.2: Cuál fue el más regular (menor desviación entre notas)
    public Estudiante obtenerMasRegular(){
        Estudiante masRegular = null;
        int menorRango = Integer.MAX_VALUE;

        for (Estudiante est: estudiantes){
            int [] notas = est.getNotas();
            int max = notas[0];
            int min = notas[0];
            for (int i = 1; i < notas.length ; i++) {
                if(notas[i]>max){
                    max= notas[i];
                }
                if(notas[i]<min){
                    min= notas[i];
                }
            }
            int rango = max-min;
            if(rango<menorRango){
                menorRango= rango;
                masRegular= est;
            }
        }
        return masRegular;

    }
    
    



}
