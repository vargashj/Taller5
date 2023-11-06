package com.HectorVargasMartinez.DominioHV;

public class Vendedor extends Directo {
    Long ventadelmesHector;

    public Vendedor(String nombre, double salarioBase, double ventas, Long ventadelmesHector) {
        super(nombre, salarioBase, ventas);
        this.ventadelmesHector = ventadelmesHector;
    }

    public void calcularComisionVargas() {
        double comision;
        if (ventadelmesHector < 1000000) {
            comision = ventadelmesHector * 0.04;
        } else {
            comision = ventadelmesHector * 0.035;
        }
    }
}




