package ejercicio3;

import ejercicio1.CategoriaEmpleado;
import ejercicio1.Trabajador;
import ejercicio2.Empresa;
import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;

public class Prueba {
    public static void main(String[] args) {
        Empresa empresaA = new Empresa("empresaA", "1");
        Empresa empresaB = new Empresa("empresaB", "2");
        Trabajador t1 = new Trabajador("t1", "ap1", LocalDate.of(1999, 3, 8), CategoriaEmpleado.INICIAL);
        Trabajador t2 = new Trabajador("t2", "ap2", LocalDate.of(1999, 3, 8), CategoriaEmpleado.INICIAL);
        Trabajador t3 = new Trabajador("Obi-wan", "ap3", LocalDate.of(1999, 3, 8), CategoriaEmpleado.INICIAL);
        Trabajador t4 = new Trabajador("t4", "ap4", LocalDate.of(1999, 3, 8), CategoriaEmpleado.INICIAL);
        Trabajador t5 = new Trabajador("t5", "ap5", LocalDate.of(1999, 3, 8), CategoriaEmpleado.INICIAL);
        Trabajador t6 = new Trabajador(t3);
        empresaA.contratar(t1);
        empresaA.contratar(t2);
        empresaA.contratar(t3);
        empresaB.contratar(t4);
        empresaB.contratar(t5);
        empresaB.contratar(t6);
        System.out.println(empresaA);
        System.out.println("*********************************************");
        System.out.println(empresaB);
        empresaB.despedir(t5);
        empresaA.contratar(t5);
        empresaA.ordenarNombre();
        empresaB.ordenarNombre();
        System.out.println(empresaA);
        System.out.println("*********************************************");
        System.out.println(empresaB);
        empresaA.buscarNombre(t3);
        empresaB.buscarNombre(t3);

    }
}
