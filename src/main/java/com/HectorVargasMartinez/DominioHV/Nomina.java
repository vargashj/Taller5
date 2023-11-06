package com.HectorVargasMartinez.DominioHV;
import java.util.ArrayList;
import java.util.List;

public class Nomina {
    List<Empleado> HectorEmpleados;

    public Nomina() {
        HectorEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        HectorEmpleados.add(empleado);
    }

    public void calcularSalariosvargas() {
        for (Empleado empleado : HectorEmpleados) {
            empleado.calcularSalarioVargas();
        }
    }

    public void listarEmpleados() {
        for (Empleado empleado : HectorEmpleados) {
            System.out.println("Nombre: " + empleado.NombreHector);
            System.out.println("Tipo de empleado: " + empleado.tipoEmpleado);
            System.out.println("Salario: " + empleado.salario);
        }
    }
}


