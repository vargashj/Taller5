package com.HectorVargasMartinez.AplicacionHV;

import com.HectorVargasMartinez.DominioHV.Directo;
import com.HectorVargasMartinez.DominioHV.Freelance;
import com.HectorVargasMartinez.DominioHV.Nomina;
import com.HectorVargasMartinez.DominioHV.Promotor;

public class App {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();


        Directo juan = new Directo("Juan", 4840000, 0);
        Directo julian = new Directo("Julián", 2050000, 45510000);
        Directo carolina = new Directo("Carolina", 980000, 35989000);
        Freelance johanna = new Freelance("johanna", 71000, 89);
        Promotor pedro = new Promotor("Pedro", 1200, 300,62);
        Directo david = new Directo("David", 3975000, 0);
        Freelance gustavo = new Freelance("Gustavo", 42500, 65);


        nomina.agregarEmpleado(juan);
        nomina.agregarEmpleado(julian);
        nomina.agregarEmpleado(carolina);
        nomina.agregarEmpleado(gustavo);
        nomina.agregarEmpleado(pedro);
        nomina.agregarEmpleado(david);
        nomina.agregarEmpleado(johanna);


        nomina.calcularSalariosvargas();


        nomina.listarEmpleados();
    }



}
