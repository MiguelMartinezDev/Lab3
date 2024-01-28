package org.example;

import java.util.List;

public class Titular implements Profesor{
    public Titular(Materias materiaAsignada) {
        this.materiaAsignada = materiaAsignada;
    }

    private Materias materiaAsignada;
    @Override
    public void enseniar() {
        System.out.println("Dictando "+ materiaAsignada);
    }

    @Override
    public void asignar(Materias materia) {
        materiaAsignada = materia;
    }
}
