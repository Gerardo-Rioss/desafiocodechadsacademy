package poo.dominio;

public class EvaluadorEstudiante {
    public static String evaluarAprobacion(Estudiante estudiante){
        int [] notas = estudiante.getNotas();
        int aprobadas = 0;
        for (int nota: notas){
            if(nota>=60){
                aprobadas++;
            }
        }
        if(aprobadas==5){
            return "Resultado: Aprobaste todas. ¡Backend Sensei!";
        } else if (aprobadas==0) {
            return "Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!";
        }else {
            return "Resultado: Algunas aprobadas. Sos un refactor en progreso.";

        }
    }
}
