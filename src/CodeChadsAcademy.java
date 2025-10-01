public class CodeChadsAcademy {
    public static void main(String[] args) {

//      1era Parte
//      El estudiante debe rendir 5 exámenes. Los primeros 3 puntajes ya están disponibles, pero los dos últimos se deben calcular automáticamente:
//      Si la nota 2 fue menor a 60, la nota 4 será 100 (porque hizo un trabajo práctico extra).
//      Si la suma de las notas 1 y 3 supera 150, la nota 5 será 95, sino 70.
        int[] pruebas = new int[5];
        pruebas[0] = 50;
        pruebas[1] = 70;
        pruebas[2] = 60;
        //Nota 4
        if (pruebas[1] < 60) pruebas[3] = 100;
        //Nota 5
        pruebas[4] = (pruebas[0] + pruebas[2] == 150) ? 95 : 70;

//      2da Parte
//      Teniendo ya precargados los valores de las primeros 5 examenes, continua el flujo :
//      ✅ 1. Verificar si aprobó todas:
//      Una nota es aprobada si es mayor o igual a 60. Mostrar si el alumno aprobó todas, ninguna o algunas.
//      "Resultado: Aprobaste todas. ¡Backend Sensei!"
//      "Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!"
//      "Resultado: Algunas aprobadas. Sos un refactor en progreso."
        int aprobadas = 0;
        int desaprobadas = 0;

        System.out.println("***************");
        System.out.println("NOTAS:");
        for (int prueba : pruebas) {
            if (prueba >= 60) {
                aprobadas++;
            } else {
                desaprobadas++;
            }
            System.out.println(prueba);
        }
        System.out.println("***************");

        if (aprobadas == 5) {
            System.out.println("Resultado: Aprobaste todas. ¡Backend Sensei!");
        } else if (desaprobadas == 5) {
            System.out.println("Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!");
        } else {
            System.out.println("Resultado: Algunas aprobadas. Sos un refactor en progreso.");
        }


    }
}
