public class CodeChadsAcademy {
    public static void main(String[] args) {

        //1era Parte
        //El estudiante debe rendir 5 exámenes. Los primeros 3 puntajes ya están disponibles, pero los dos últimos se deben calcular automáticamente:
        int[] notas = new int[5];
        notas[0] = 70;
        notas[1] = 10;
        notas[2] = 90;
        //Nota 4
        //Si la nota 2 fue menor a 60, la nota 4 será 100 (porque hizo un trabajo práctico extra).
        //Si fue mayor a 60 entonces la nota 4 será igual a la nota 2.
        notas[3]= notas[1]<60?100:notas[1];
        //Nota 5
        //Si la suma de las notas 1 y 3 supera 150, la nota 5 será 95, sino 70.
        notas[4] = (notas[0] + notas[2] > 150) ? 95 : 70;






        //2da Parte
        //Teniendo ya precargados los valores de las primeros 5 examenes, continua el flujo :
        //✅ 1. Verificar si aprobó todas:
        //Una nota es aprobada si es mayor o igual a 60. Mostrar si el alumno aprobó todas, ninguna o algunas.
        //"Resultado: Aprobaste todas. ¡Backend Sensei!"
        //"Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!"
        //"Resultado: Algunas aprobadas. Sos un refactor en progreso."
        //TABLA PARA OBSERVAR LOS RESULTADOS
        System.out.println("******************************");
        System.out.println("RESULTADOS DE LAS PRUEBAS:");
        int aprobadas = 0;
        int desaprobadas = 0;
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









//      ✅ 2. Prueba más inconsistente:
//      Detectar cuál fue la mayor variación entre dos pruebas consecutivas y en qué lugar ocurrió.
//      "Mayor salto fue de 35 puntos entre la prueba 2 y la prueba 3."
        int mayorVariacion =notas[1]-notas[0];
        int posicionMayorVariacion = 1;
        for (int i = 2; i < notas.length; i++) {
            int variacionActual =notas[i]-notas[i-1];
            if (variacionActual>mayorVariacion){
                mayorVariacion= variacionActual;
                posicionMayorVariacion=i;
            }
        }
        System.out.printf("Mayor salto fue de %d puntos entre la prueba %d y la prueba %d%n.",mayorVariacion,(posicionMayorVariacion), posicionMayorVariacion+1);









//        3. Bonus por progreso:
//        Si el alumno mejora su nota en cada prueba respecto a la anterior, mostrar:
//        "¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈"
        System.out.println("=====================================================================");
        int notaAnterior = notas[0];
        for (int i =1;i< notas.length;i++ ) {
            if (notas[i]> notaAnterior){
                System.out.printf("Mejoraste tu nota en la prueba %d%n",(i+1) );
                System.out.println("¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈");
            }
            notaAnterior= notas[i];
        }







//        ✅ 4. Mostrar notas ordenadas (sin usar sort):
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






// Mostrar ordenadas
        System.out.println("=====================================================================");
        System.out.println("NOTAS ORDENADAS DE MAYOR A MENOR");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %d%n", notas[i]);
        }







//        ✅ 5. Evaluación final por nivel
//        Según el total acumulado, mostrar un rango personalizado:
//        Total < 250 → "Normie total 😢"
//        250–349 → "Soft Chad"
//        350–449 → "Chad"
//        450+ → "Stone Chad definitivo 💪"
        int total =0;
        for ( int nota: notas){
            total+=nota;
        }
        System.out.println("=====================================================================");
        if (total<250){
            System.out.printf("Normie total, su total es: %d%n", total);
        } else if (total>=250 & total<=349) {
            System.out.printf("Soft Chad, su total es: %d%n", total);
        } else if (total>=350 & total<=449) {
            System.out.printf("Chad, su total es: %d%n", total);
        }else {
            System.out.printf("Stone Chad definitivo, su total es: %d%n", total);
        }








//        6. (Desafío final) Ranking entre varios alumnos
//        Simulá una clase con 4 estudiantes, cada uno con sus 5 notas. Mostrá:
//        Qué estudiante obtuvo el promedio más alto
//        Cuál fue el más regular (menor desviación entre notas).
//                Quién tuvo el peor rendimiento en la tercera prueba.
        System.out.println("=====================================================================");
        int[][] notasAlumnos = {
                {90, 70, 90, 70, 95},   // Alumno 1
                {80, 85, 90, 75, 80},   // Alumno 2
                {100, 95, 90, 85, 100}, // Alumno 3
                {60, 65, 70, 60, 55}    // Alumno 4
        };




        double [] promedios = new double[4];
        int [] desviaciones = new int[4];
        int [] rendimientoTercerPrueba = new int[4];

        for (int i = 0; i < notasAlumnos.length; i++) {
            System.out.printf("ALUMNO %d%n", (i + 1));
            int suma = 0;
            int max =0;
            int min =100;
            for (int j = 0; j < notasAlumnos[i].length; j++) {
                int nota = notasAlumnos[i][j];
                System.out.printf(nota+ " ");
                if (nota>max){
                    max= nota;
                }
                if (nota<min){
                    min= nota;
                }
                suma += nota;
                if (j==2){
                    rendimientoTercerPrueba[i]=nota;
                }

            }
            desviaciones[i]= max-min;
            promedios[i]=suma/notasAlumnos[i].length;
            System.out.printf("TOTAL: %d PROMEDIO: %.2f%n",suma, promedios[i]);
            System.out.printf("Del alumno %d, nota maxima: %d, nota minima %d y la desviacion es de: %d%n",(i+1),max,min,(max-min));
        }


        //Cuál fue el más regular (menor desviación entre notas).
        int menorDesviacion = desviaciones[0];
        int alumnoNro = 1;
        for (int i = 1; i < desviaciones.length; i++) {
            if (desviaciones[i]<menorDesviacion){
                menorDesviacion=desviaciones[i];
                alumnoNro = i+1;
            }
        }
        System.out.println("=====================================================================");
        System.out.printf("El alumno con menor desviacion en sus notas fue alumno %d, su desviacion es: %d %n",alumnoNro,menorDesviacion);


        //Rendimiento tercer prueba
        int peorRendimiento = rendimientoTercerPrueba[0];
        int alumno = 1;
        for (int i = 1; i < rendimientoTercerPrueba.length; i++) {
            if (rendimientoTercerPrueba[i]<peorRendimiento){
                peorRendimiento= rendimientoTercerPrueba[i];
                alumno= i+1;
            }
        }
        System.out.printf("El alumno %d, la nota de la tercer prueba es: %d%n",alumno, rendimientoTercerPrueba[alumno-1] );








    }






}
