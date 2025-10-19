package poo.dominio;

import java.lang.reflect.Array;
import java.util.Arrays;

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

    // 4. Mostrar notas ordenadas
    public static String ordenarNotas(Estudiante estudiante){
        int [] notas = estudiante.getNotas();
        for (int i = 0; i < notas.length - 1; i++) {
            int posMayor = i;
            for (int j = i + 1; j < notas.length; j++) {
                if (notas[j] > notas[posMayor]) {
                    posMayor = j;
                }
            }
            // Intercambiar
            int temp = notas[i];
            notas[i] = notas[posMayor];
            notas[posMayor] = temp;
        }
        return Arrays.toString(notas);
    }

    // 5. Evaluacion Final
    public static String evaluarNivel(Estudiante estudiante){
        int[] notas = estudiante.getNotas();
        int total=0;
        for(int nota: notas){
            total+= nota;
        }

        if (total<250){
            return "Normie total 😢";
        } else if (total>=250 & total<=349) {
            return "Soft Chad";
        } else if (total>=350 & total<=449) {
            return "Chad";
        }else {
            return "Stone Chad definitivo 💪";
        }

    }




}



