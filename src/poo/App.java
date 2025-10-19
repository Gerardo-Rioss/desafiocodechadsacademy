package poo;

import poo.dominio.Academia;
import poo.dominio.Estudiante;
import poo.dominio.EvaluadorEstudiante;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Academia academia = new Academia();

        Estudiante e1 = new Estudiante("Juan",80,70,90);
        Estudiante e2 = new Estudiante("Ana",50,65,85);
        Estudiante e3 = new Estudiante("Luis", 90, 85, 95);
        Estudiante e4 = new Estudiante("Marta", 40, 55, 60);

        e1.calcularNotasRestantes();
        e2.calcularNotasRestantes();
        e3.calcularNotasRestantes();
        e4.calcularNotasRestantes();

        academia.agregarEstudiante(e1);
        academia.agregarEstudiante(e2);
        academia.agregarEstudiante(e3);
        academia.agregarEstudiante(e4);

        evaluarEstudiante(e1);
        evaluarEstudiante(e2);
        evaluarEstudiante(e3);
        evaluarEstudiante(e4);

    }

    private static void evaluarEstudiante(Estudiante estudiante){
        System.out.println("Estudiante: " +estudiante.getNombre());
        System.out.println("Notas: "+ Arrays.toString(estudiante.getNotas()));
        System.out.println(EvaluadorEstudiante.evaluarAprobacion(estudiante));
        System.out.println(EvaluadorEstudiante.calcularVariacion(estudiante));
        System.out.println(EvaluadorEstudiante.verificarProgreso(estudiante));
        System.out.println("Notas Ordenadas: "+EvaluadorEstudiante.ordenarNotas(estudiante));
        System.out.println("Evaluación Final: "+ EvaluadorEstudiante.evaluarNivel(estudiante));
        System.out.println("=====================================================================");
    }
}
