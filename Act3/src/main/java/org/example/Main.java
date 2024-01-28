package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Profesor titular = new Titular(Materias.CIENCIA);
        titular.enseniar();
        Profesor suplente = new Suplente();
        suplente.asignar(Materias.CIENCIA);
        suplente.enseniar();
        suplente.asignar(Materias.GIMNASIA);
        suplente.enseniar();
        suplente.asignar(Materias.MUSICA);
        suplente.enseniar();
    }
}