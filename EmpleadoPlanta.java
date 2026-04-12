import java.sql.Time;

public class EmpleadoPlanta  extends  Empleado{


    private String cargo;
    private Time horasExtra;


    public EmpleadoPlanta(String nombre, String documento, int edad, double salarioBase, CategoriaEmpleado categoriaempleado, double descuentoSalud, double descuentoPension, String cargo, Time horasExtra) {
        super(nombre, documento, edad, salarioBase, categoriaempleado, descuentoSalud, descuentoPension);
        this.cargo = cargo;
        this.horasExtra = horasExtra;
    }

    public Time getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(Time horasExtra) {
        this.horasExtra = horasExtra;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}
