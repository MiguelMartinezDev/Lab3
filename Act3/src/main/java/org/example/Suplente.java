package org.example;

import java.util.List;

public class Suplente implements Profesor{

    public Materias materiaAsignada;


    @Override
    public void asignar(Materias materia) {
        materiaAsignada = materia;
    }

    @Override
    public void enseniar() {
        System.out.println("Dictando " + materiaAsignada);
    }
}
