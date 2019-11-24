package com.evolution;

import com.evolution.workshop.*;
import java.util.List;
import java.util.ArrayList;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    // Creación de los Trabajadores.
        Trabajador tra1 = new Trabajador("41759634A","Juan","Gonzalez Gomila","jgg@gmail.com",654287963, 1, 25.5,CategoriaTrabajador.TECNICO_JUNIOR);
        Trabajador tra2 = new Trabajador("45761826B", "Pepe", "Garcia Morro", "pgm@gmail.com", 678491221, 2, 50, CategoriaTrabajador.TECNICO_SUPERIOR);
        Trabajador tra3 = new Trabajador("41879666C", "Novita", "Novi", "nn@gmail.com", 666666666, 3, 80, CategoriaTrabajador.MAESTRO_TALLER);

    //Creación de los Clientes
        Cliente cli1 = new Cliente("44852693F", "Homer", "Simpson", "hs@gmail.com", 668742339, 1L, true);
        Cliente cli2 = new Cliente("47529555H", "Bart", "Simpson", "bs@gmail.com", 647898555, 2L, false);

    //Crecion de los Vehículos
        Vehiculo veh1 = new Vehiculo("9559JGX", "Tesla", 2018, cli1);
        Vehiculo veh2 = new Vehiculo("7587ASD", "Toyota", 2016, cli2);

    //Averias Tesla 1
        Averia ave1 = new Averia(1, "pinchazo", "rueda derecha trasera pinchada", 300, GravedadAveria.LIGERA, tra1, veh1);
        Averia ave2 = new Averia(2, "bateria dañada", "la bateria ha reventado", 1200, GravedadAveria.GRAVE, tra3, veh1);

        List<Averia> listaAveria_1 = new ArrayList<>();
        listaAveria_1.add(ave1);
        listaAveria_1.add(ave2);

        Factura fac1 = new Factura(1, true, LocalDate.of(2019, 11, 20), listaAveria_1);

    //Averias Toyota
        Averia ave3 = new Averia(3, "aceite y filtro", "cambio de aceite y filtro", 80, GravedadAveria.LIGERA, tra1, veh2);
        Averia ave4 = new Averia(4, "cambio ruedas", "cambiar las 4 ruedas", 300, GravedadAveria.LIGERA, tra2, veh2);

        List<Averia> listaAveria_2 = new ArrayList<>();
        listaAveria_2.add(ave3);
        listaAveria_2.add(ave4);

        Factura fac2 = new Factura(2, false, LocalDate.of(2019, 11, 15), listaAveria_2);

    //Lista averias Tesla 1
        System.out.println("Averias Tesla");
        System.out.println("----------------------------------");
        for (Averia e: fac1.getListaAverias()) {
            System.out.println(e.toString());
        }
        System.out.println("");

    //Factura Tesla 1
        System.out.println("Factura Tesla");
        System.out.println("----------------------------------");
        System.out.println("Factura sin IVA: " + fac1.totalFactura());
        System.out.println("Factura con IVA: " + fac1.totalFacturaConIVA());
        System.out.println("");

    //Lista averias Toyota
        System.out.println("Averias Toyota");
        System.out.println("----------------------------------");
        for (Averia e: fac2.getListaAverias()) {
            System.out.println(e.toString());
        }
        System.out.println("");

    //Factura Toyota
        System.out.println("Factura Toyota");
        System.out.println("----------------------------------");
        System.out.println("Factura sin IVA: " + fac2.totalFactura());
        System.out.println("Factura con IVA: " + fac2.totalFacturaConIVA());
        System.out.println("");

    //Averias Tesla 2
        Averia ave5 = new Averia(5, "pinchazo", "rueda derecha trasera pinchada", 300, GravedadAveria.LIGERA, tra1, veh1);
        Averia ave6 = new Averia(6, "bateria dañada", "la bateria ha reventado", 1200, GravedadAveria.GRAVE, tra3, veh1);

        List<Averia> listaAveria_3 = new ArrayList<>();
        listaAveria_3.add(ave5);
        listaAveria_3.add(ave6);

        Factura fac3 = new Factura(3, true, LocalDate.of(2019, 11, 22), listaAveria_3);

    //Factura Tesla 2
        System.out.println("Factura Tesla 2");
        System.out.println("----------------------------------");
        System.out.println("Factura sin IVA: " + fac3.totalFactura());
        System.out.println("Factura con IVA: " + fac3.totalFacturaConIVA());
        System.out.println("");

    //Todas las facturas de Tesla
        List<Factura> facturasTesla = new ArrayList<>();
        facturasTesla.add(fac1);
        facturasTesla.add(fac3);

        System.out.println("Listado facturas:");
        System.out.println("----------------------------------");
        for(Factura fac : facturasTesla) {
            System.out.println(fac.toString());
            System.out.println("Total factura: " + fac.totalFactura());
            System.out.println("");
        }

    // Usuario Web
        UsuarioWeb usu1 = new UsuarioWeb(cli1, "Homer", "12345678");
        System.out.println("Usuario Web:");
        System.out.println("----------------------------------");
        System.out.println(usu1.toString());

    }

}

