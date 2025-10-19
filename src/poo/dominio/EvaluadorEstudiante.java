package poo.dominio;
//Verificar si aprobó todas, ninguna o algunas
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

    //Prueba mas inconsistente
    public static String calcularVariacion(Estudiante estudiante){
        int [] notas = estudiante.getNotas();
        int maxVariacion= 0;
        int indice = 0;
        for (int i = 0; i < notas.length-1; i++) {
            int variacion = Math.abs(notas[i]- notas[i+1]);
            if (variacion> maxVariacion){
                maxVariacion= variacion;
                indice= i;
            }
        }
        return "El Mayor salto fué de "+ maxVariacion+" puntos entre la prueba "+ (indice+1)+" y la prueba "+(indice+2)+".";

    }
}



