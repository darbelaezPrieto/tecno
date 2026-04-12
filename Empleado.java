import java.util.List;

public class  Empleado {


    private String nombre;
    private String documento;
    private int edad;
    private double salarioBase;
    private double descuentoSalud;
    private double descuentoPension;
    private List<Empleado> Empleados;

    public Empleado(String nombre, String documento, int edad, double salarioBase,  CategoriaEmpleado categoriaempleado, double descuentoSalud, double descuentoPension) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.salarioBase = salarioBase;

        this.descuentoSalud = descuentoSalud;
        this.descuentoPension = descuentoPension;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    public double getDescuentoSalud() {
        return descuentoSalud;
    }

    public void setDescuentoSalud(double descuentoSalud) {
        this.descuentoSalud = descuentoSalud;
    }

    public double getDescuentoPension() {
        return descuentoPension;
    }

    public void setDescuentoPension(double descuentoPension) {
        this.descuentoPension = descuentoPension;
    }

}