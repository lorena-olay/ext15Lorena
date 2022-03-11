package ejercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Trabajador implements Comparable<Trabajador>{
    private String nombre, apellidos;
    private LocalDate fechaNacimiento;
    private CategoriaEmpleado categoriaEmpleado;
    private final double SUELDOBASE = 1707;

    public Trabajador(String nombre, String apellidos, LocalDate fechaNacimiento, CategoriaEmpleado categoriaEmpleado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.categoriaEmpleado = categoriaEmpleado;
        //Period edad = Period.between(fechaNacimiento, LocalDate.now());
        //if((int)edad>=16){

        }

    public Trabajador (Trabajador origen){
        this.nombre = origen.nombre;
        this.apellidos = origen.apellidos;
        this.fechaNacimiento = origen.fechaNacimiento;
        this.categoriaEmpleado = origen.categoriaEmpleado;
    }
/*
    public double calcularSueldo(){
        double sueldo = this.SUELDOBASE + CategoriaEmpleado.INICIAL;
    }
*/
    /*
public int compare(Trabajador p1, Trabajador p2) {
    return  p1.().compareTo(p2.getApellido1());
}
*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public CategoriaEmpleado getCategoriaEmpleado() {
        return categoriaEmpleado;
    }

    public void setCategoriaEmpleado(CategoriaEmpleado categoriaEmpleado) {
        this.categoriaEmpleado = categoriaEmpleado;
    }

    public double getSUELDOBASE() {
        return SUELDOBASE;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", categoriaEmpleado=" + categoriaEmpleado +
                ", SUELDOBASE=" + SUELDOBASE +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trabajador)) return false;
        Trabajador that = (Trabajador) o;
        return Double.compare(that.getSUELDOBASE(), getSUELDOBASE()) == 0 && Objects.equals(getNombre(), that.getNombre()) && Objects.equals(getApellidos(), that.getApellidos()) && Objects.equals(getFechaNacimiento(), that.getFechaNacimiento()) && getCategoriaEmpleado() == that.getCategoriaEmpleado();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApellidos(), getFechaNacimiento(), getCategoriaEmpleado(), getSUELDOBASE());
    }

    @Override
    public int compareTo(Trabajador o) {
        return this.nombre.compareTo(o.nombre);
    }
}

