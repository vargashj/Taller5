package com.HectorVargasMartinez.DominioHV;

public class Promotor extends Empleado {
    double volantesRepartidos;
    double valorVolanteHector;
    double comprasVolante;

    public Promotor(String nombre, double volantesRepartidos, double valorVolanteHector, double comprasVolante) {
        super(nombre, "Promotor");
        this.volantesRepartidos = volantesRepartidos;
        this.comprasVolante = comprasVolante;
        this.valorVolanteHector = valorVolanteHector;
    }

    public void calcularSalarioVargas() {
        salario = (volantesRepartidos * 300) + (comprasVolante * 15000);
    }
}



