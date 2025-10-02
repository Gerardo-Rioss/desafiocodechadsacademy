public class CodeChadsAcademy {
    public static void main(String[] args) {

//      1era Parte
//      El estudiante debe rendir 5 exámenes. Los primeros 3 puntajes ya están disponibles, pero los dos últimos se deben calcular automáticamente:
//      Si la nota 2 fue menor a 60, la nota 4 será 100 (porque hizo un trabajo práctico extra).
//      Si fue mayor a 60 entonces la nota 4 será igual a la nota 2.
//      Si la suma de las notas 1 y 3 supera 150, la nota 5 será 95, sino 70.
        int[] notas = new int[5];
        notas[0] = 50;
        notas[1] = 70;
        notas[2] = 60;
        //Nota 4
        notas[3]= notas[1]<60?100:notas[1];
        //if (notas[1] < 60) notas[3] = 100;
        //Nota 5
        notas[4] = (notas[0] + notas[2] > 150) ? 95 : 70;

//      2da Parte
//      Teniendo ya precargados los valores de las primeros 5 examenes, continua el flujo :
//      ✅ 1. Verificar si aprobó todas:
//      Una nota es aprobada si es mayor o igual a 60. Mostrar si el alumno aprobó todas, ninguna o algunas.
//      "Resultado: Aprobaste todas. ¡Backend Sensei!"
//      "Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!"
//      "Resultado: Algunas aprobadas. Sos un refactor en progreso."
        int aprobadas = 0;
        int desaprobadas = 0;

        System.out.println("******************************");
        System.out.println("RESULTADOS DE LAS PRUEBAS:");



        for (int i =0;i< notas.length;i++ ) {
            if (notas[i] >= 60) {
                aprobadas++;
            } else {
                desaprobadas++;
            }
            System.out.printf("Nota %d: %d%n", (i + 1), notas[i]);
        }
        System.out.println("******************************");

        if (aprobadas == 5) {
            System.out.println("Resultado: Aprobaste todas. ¡Backend Sensei!");
        } else if (desaprobadas == 5) {
            System.out.println("Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!");
        } else {
            System.out.println("Resultado: Algunas aprobadas. Sos un refactor en progreso.");
        }


    }
}
