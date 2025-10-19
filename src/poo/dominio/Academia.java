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



}
