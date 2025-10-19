package poo.dominio;

public class Estudiante {
    private String nombre;
    private int[] notas;

    public Estudiante(String nombre, int nota1, int nota2, int nota3) {
        this.nombre = nombre;
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
    }

    // Método para calcular las notas 4 y 5 según las reglas
    public void calcularNotasRestantes(){
        // Nota 4: si la nota 2 (índice 1) fue menor a 60, la nota 4 será 100, sino igual a la nota 2.
        if (notas[1]<60){
            notas[4]=100;
        }else{
            notas[3]=100;
        }
        // Nota 5: si la suma de las notas 1 y 3 (índices 0 y 2) supera 150, la nota 5 será 95, sino 70.
        if (notas[0]+notas[2]>150){
            notas[4]=95;
        }else{
            notas[4]=70;
        }

    }

    public String getNombre(){
        return nombre;
    }

    public int[] getNotas(){
        return notas;
    }

    public double getPromedio(){
        int suma=0;
        for (int nota: notas){
            suma+=nota;
        }
                return suma/5.0;
    }

}
