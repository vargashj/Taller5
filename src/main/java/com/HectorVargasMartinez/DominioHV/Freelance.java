package com.HectorVargasMartinez.DominioHV;

public class Freelance extends Empleado {
    double tarifaPorHoraHector;
    double horasTrabajadas;

    public Freelance(String nombre, double tarifaPorHoraHector, double horasTrabajadas) {
        super(nombre, "Freelance");
        this.tarifaPorHoraHector = tarifaPorHoraHector;
        this.horasTrabajadas = horasTrabajadas;
    }

    public void calcularSalarioVargas() {
        salario = tarifaPorHoraHector * horasTrabajadas;
    }
}

