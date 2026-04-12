public class EmpleadoVenta extends Empleado  {

    private int totalVentas;
    private double porcentajeComsion;

    public EmpleadoVenta(String nombre, String documento, int edad, double salarioBase, CategoriaEmpleado categoriaempleado, double descuentoSalud, double descuentoPension, int totalVentas, double porcentajeComsion) {
        super(nombre, documento, edad, salarioBase, categoriaempleado, descuentoSalud, descuentoPension);
        this.totalVentas = totalVentas;
        this.porcentajeComsion = porcentajeComsion;
    }

    public double getPorcentajeComsion() {
        return porcentajeComsion;
    }

    public void setPorcentajeComsion(double porcentajeComsion) {
        this.porcentajeComsion = porcentajeComsion;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }

}
