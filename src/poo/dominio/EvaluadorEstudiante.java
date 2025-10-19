package poo.dominio;

public class EvaluadorEstudiante {
    // 1. Verificar si aprobó todas, ninguna o algunas
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

    // 2. Prueba mas inconsistente
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

    // 3. Bonus por Progreso
    public static String verificarProgreso(Estudiante estudiante){
        int [] notas = estudiante.getNotas();
        boolean mejora = true;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]>= notas[i+1]){
                mejora=false;
                break;
            }
        }
        if (mejora){
            return "¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈";
        }else {
            return "";
        }
    }

}



