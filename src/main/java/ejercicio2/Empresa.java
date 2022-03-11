package ejercicio2;

import ejercicio1.Trabajador;

import java.util.ArrayList;
import java.util.Comparator;

public class Empresa {
    private ArrayList<Trabajador> lista;
    private String nombreEmpresa;
    private String CIF;

    public Empresa(String nombreEmpresa, String CIF) {
        this.nombreEmpresa = nombreEmpresa;
        this.CIF = CIF;
        this.lista = new ArrayList<>();
    }

    public void imprimir(){
        System.out.println(this.nombreEmpresa);
        System.out.println(this.CIF);
        lista.forEach((valor)->{
            System.out.println("["+valor+"]");
        });
        }

    public void contratar(Trabajador t){
        lista.add(t);
    }

    public void despedir(Trabajador t){
        lista.remove(t);
    }

    public Object buscarTodosNombre(String nombre){
        int aux = lista.indexOf(nombre);
        if (aux == -1){
            return null;
        }
        return aux;
    }

    public void ordenarNombre(){
        lista.sort(Trabajador::compareTo);
    }

    public void buscarNombre(Trabajador t){
        //lista.sort(t);
    }

    public ArrayList<Trabajador> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Trabajador> lista) {
        this.lista = lista;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "lista=" + lista +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", CIF='" + CIF + '\'' +
                '}';
    }
}

