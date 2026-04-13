

public class EmpleadoPlanta  extends  Empleado {

    private String cargo;
    private int horasExtra;
    private double valorHorasExtra;
    private double auxilioTransporte;

    public EmpleadoPlanta(String nombre, String documento, int edad, double salarioBase, CategoriaEmpleado categoriaempleado, double descuentoSalud, double descuentoPension, String cargo, int horasExtra, double valorHorasExtra, double auxilioTransporte) {

        super(nombre, documento, edad, salarioBase, categoriaempleado, descuentoSalud, descuentoPension);
        this.cargo = cargo;
        this.horasExtra = horasExtra;
        this.valorHorasExtra = valorHorasExtra;
        this.auxilioTransporte = auxilioTransporte;
    }


    @Override
    public double calcularSalarioBruto() {
        double totalSalario;

        totalSalario = getSalarioBase()+ calcularBonificacionCategoria() + (horasExtra *horasExtra) + auxilioTransporte;


        return totalSalario;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {

        this.horasExtra = horasExtra;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}
