public class EmpleadoVenta extends Empleado  {

    private double totalVentas;
    private double porcentajeComision;

    public EmpleadoVenta(String nombre, String documento, int edad, double salarioBase, CategoriaEmpleado categoriaempleado, double descuentoSalud, double descuentoPension, double totalVentas, double porcentajeComision) {
        super(nombre, documento, edad, salarioBase, categoriaempleado, descuentoSalud, descuentoPension);
        this.totalVentas = totalVentas;
        this.porcentajeComision = porcentajeComision;
    }
    @Override
    public double calcularSalarioBruto() {
        double totalsalarioventas;
        double comision = (totalVentas * porcentajeComision) / 100;
        totalsalarioventas= getSalarioBase() + calcularBonificacionCategoria() + comision;
        return totalsalarioventas;
    }
    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

}