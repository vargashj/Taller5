package com.HectorVargasMartinez.DominioHV;

public class Directo extends Empleado {
    double salarioBaseHector;
    double ventasHector;

    public Directo(String nombre, double salarioBaseHector, double ventasHector) {
        super(nombre, "Directo");
        this.salarioBaseHector = salarioBaseHector;
        this.ventasHector   = ventasHector;
    }

    public void calcularSalarioVargas() {
        double tasaComision = 0.04;
        if (salario > 1000000) {
            tasaComision = 0.035;
        }
        double comision = ventasHector * tasaComision;
        double deducciones = (salarioBaseHector * 0.05) + (salarioBaseHector * 0.065);
        salario = salarioBaseHector + comision - deducciones;
    }
}


