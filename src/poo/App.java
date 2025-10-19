package poo;

import poo.dominio.Estudiante;

public class App {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Juan",80,70,90);
        Estudiante e2 = new Estudiante("Ana",50,65,85);
        Estudiante e3 = new Estudiante("Luis", 90, 85, 95);
        Estudiante e4 = new Estudiante("Marta", 40, 55, 60);

        e1.calcularNotasRestantes();
        e2.calcularNotasRestantes();
        e3.calcularNotasRestantes();
        e4.calcularNotasRestantes();


    }
}
